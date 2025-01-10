package com.test.userService;

import com.test.testbase.Testbase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Users_Service extends Testbase {

    @Test
    public void runTest_Users_getAllUsers(){
        response=response_GET("http://localhost:8010/users",getHeaders_Common());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
