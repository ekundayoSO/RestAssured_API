package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

    @Test
    public void test_1() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getHeader("Content-Type"));

        /* Assertion*/
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        /* Negative Assertion*/
        //Assert.assertEquals(statusCode, 201);
    }
}
