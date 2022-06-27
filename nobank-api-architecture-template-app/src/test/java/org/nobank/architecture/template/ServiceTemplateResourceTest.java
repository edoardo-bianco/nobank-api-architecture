package org.nobank.architecture.template;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class ServiceTemplateResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/service-template/teste_bean_extension")
          .then()
             .statusCode(200)
             .body(containsString("Quarkus Extension Bean"));
    }

}