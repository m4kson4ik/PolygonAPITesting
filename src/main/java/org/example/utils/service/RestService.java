package org.example.utils.service;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import io.restassured.specification.RequestSpecification;

public abstract class RestService {
    private static final String URL = "http://77.50.236.203:4879";
    protected String token;
    protected RequestSpecification REQ_SPEC;

    protected abstract String getBasePath();
    public RestService(String token) {
        this.token = token;

        REQ_SPEC = new RequestSpecBuilder()
                .setBaseUri(URL)
                .addHeader ("Authorization", "Bearer " + token)
                .setBasePath(getBasePath())
                .setContentType(ContentType.JSON)
                .build();
    }
}
