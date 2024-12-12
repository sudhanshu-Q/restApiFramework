package com.test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HelloworldTest {

@Test
    public void testHelloWorld(){
    RestAssured.given().baseUri("http://localhost:8010/")
            .get("helloworldbean")
            .then().log().all();
}
@Test
    public void runTest_HelloWorld(){
    RestAssured.baseURI = "http://localhost:8010";
    RequestSpecification request = RestAssured.given();
    Response response = request.get("/helloworldbean");
    response.then().log().all();
    System.out.println(response);
    Assert.assertEquals(response.getStatusCode(), 200);
}
}
