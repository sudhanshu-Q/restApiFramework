package com.test.userService;

import com.test.testbase.Testbase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_User_Service extends Testbase {

    @Test
    public void runTest_User_getUserById() {
        response = response_GET_ID("http://localhost:8010/users", getHeaders_Common(), 2);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
