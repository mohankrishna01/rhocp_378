package com.mohan.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TestClassTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/test")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}