import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetStationDataOn15thApril {

    @Test
    public void testGetStationDataOn15thAprilAndValidateForStatusCode(){
        given().
        when().
            get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y").
        then().
            assertThat().statusCode(200);
    }
    @Test
    public void testGetStationDataOnRouteCode(){
        given().
                when().
                get("https://api.bart.gov/api/etd.aspx?cmd=etd&orig=RICH&key=MW9S-E7SL-26DU-VV8V&json=y").then()
                .statusCode(200);
               // assertThat().(400);
    }

    @Test
    public void testGetStationDataOn15thAprilAndValidateResponseBody(){
        given().
                when().
                get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y").
                then().
                assertThat().
                body("root.routes.route[1].color", equalTo("BEIGE"));
              /*  body("root.routes.route.routeID", hasItem("ROUTE 20")).
                body("root.routes.route.routeID", not(hasItem("ROUTE 0"))).
                body("root.routes.route.number", hasSize(12));*/
    }
    @Test
    public void getData(){
        given().log().all().when().get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y")
                .then().log().body().extract();
    }

    @Test
    public void jsonContentType(){
        given().
                when().
                get("https://api.bart.gov/api/route.aspx?cmd=routes&key=MW9S-E7SL-26DU-VV8V&date=04/15/2021&json=y").
                then().
                assertThat().contentType("application/json");


    }
}
