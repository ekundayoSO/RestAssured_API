package tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

    @Test
    public void test_2() {

        baseURI = "https://reqres.in/api";
        given().
            get("/users?page=2").
        then().
            statusCode(200).
            body("data[1].id", equalTo(8)).
            log().all();
    }
}
