package com.test.testbase;

import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Testbase {


    public static Response response;

    public HashMap<String, String> getHeaders_Common() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Connection", "keep-alive");
        return map;
    }

    public Response response_GET(String url, HashMap<String, String> setHeader) {
        response = given().auth()
                .basic("username", "password123")
                .headers(setHeader).baseUri(url).
                when().get("").
                then().extract().response();
        response.then().log().all();
        return response;
    }

    public Response response_GET_ID(String url, HashMap<String, String> setHeader, int id) {
        response = given().auth()
                .basic("username", "password123")
                .headers(setHeader).baseUri(url).
                when().get("").
                then().extract().response();
        response.then().log().all();
        return response;
    }
}

