package org.nobank.architecture.api.chassis.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class NobankApiArchitectureChassisResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/nobank-api-architecture-chassis")
                .then()
                .statusCode(200)
                .body(is("Hello nobank-api-architecture-chassis"));
    }
}
