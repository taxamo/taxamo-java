package com.taxamo.client.common;

import com.mashape.unirest.http.HttpMethod;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.owlike.genson.GensonBuilder;
import com.owlike.genson.reflect.PropertyNameResolver;

import com.owlike.genson.GenericType;
import com.owlike.genson.Genson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ApiInvoker {
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private boolean isDebug = false;

    public void enableDebug() {
        isDebug = true;
    }

    public void addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
    }

    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    public static Object deserialize(String json, GenericType containerType, Class cls) throws ApiException {
        Genson genson = new GensonBuilder()
                .failOnMissingProperty(false)
                .setSkipNull(true)
                .with(new PropertyNameResolver.AnnotationPropertyNameResolver())
                .create();
        if (containerType != null) {
            return genson.deserialize(json, containerType);
        } else if (String.class.equals(cls)) {
            if (json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
                return json.substring(1, json.length() - 2);
            else
                return json;
        } else {
            return genson.deserialize(json, cls);
        }
    }

    public static String serialize(Object obj) throws ApiException {
        Genson genson = new GensonBuilder()
                .failOnMissingProperty(false)
                .setSkipNull(true)
                .with(new PropertyNameResolver.AnnotationPropertyNameResolver())
                .create();
        try {
            if (obj != null)
                return genson.serialize(obj);
            else
                return null;
        } catch (Exception e) {
            throw new ApiException(500, e.getMessage());
        }
    }

    public String invokeAPI(String host, String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Map<String, String> formParams, String contentType) throws ApiException {

        StringBuilder b = new StringBuilder();

        for (String key : queryParams.keySet()) {
            String value = queryParams.get(key);
            if (value != null) {
                if (b.toString().length() == 0)
                    b.append("?");
                else
                    b.append("&");
                b.append(escapeString(key)).append("=").append(escapeString(value));
            }
        }
        String querystring = b.toString();

        HttpRequest httpRequest;
        if (!"GET".equals(method) && body != null) {
            HttpRequestWithBody httpRequestWithBody = new HttpRequestWithBody(HttpMethod.valueOf(method.toUpperCase()), host + path + querystring);
            httpRequestWithBody.body(serialize(body));
            httpRequest = httpRequestWithBody;
            httpRequest.header("Content-type", "application/json");
        } else {
            httpRequest = new HttpRequest(HttpMethod.valueOf(method.toUpperCase()), host + path + querystring);
        }

        httpRequest.header("Accept", "application/json");

        for (String key : headerParams.keySet()) {
            httpRequest.header(key, headerParams.get(key));
        }

        for (String key : defaultHeaderMap.keySet()) {
            if (!headerParams.containsKey(key)) {
                httpRequest.header(key, defaultHeaderMap.get(key));
            }
        }


        try {
            HttpResponse<String> response = httpRequest.asString();
            String bodyResp = response.getBody();
            if (response.getStatus() != 200) {
                throw new ApiException(response.getStatus(), bodyResp);
            }

            return bodyResp;
        }
        catch (UnirestException e) {
            throw new ApiException(e);
        }
    }
}