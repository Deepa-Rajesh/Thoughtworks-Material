package SerializationDeserialization;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.junit.Test;

public class SerializationDeserializationClass {
    @Test
    public void postUserDetails() {
        Response response =
                given().contentType(ContentType.JSON)
                body
    }
}