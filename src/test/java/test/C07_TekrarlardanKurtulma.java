package test;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C07_TekrarlardanKurtulma {

     /*
    https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde donen Response’un,
            status code’unun 200,
            ve content type’inin application/json, ve response body’sindeki
            "firstname"in, “Susan”,
            ve "lastname"in, “Brown”,
            ve "totalprice"in, 390,
            ve "depositpaid"in, false,
	        ve "additionalneeds"in, “Breakfast” oldugunu test edin
     */

    @Test
    public void nonReapet(){

        // 1-Endpoint hazirlama

        String url = "https://restful-booker.herokuapp.com/booking/10";

        // 2-Expected body verilmedigi icin hazirlanmadi

        // 3-Response kaydet
        Response response = given().when().get(url);

        // 4-Assertion yap
        response.then().assertThat().statusCode(200).contentType("application/json")
                .body("firstname",Matchers.equalTo("Mark"),
                        "lastname",Matchers.equalTo("Ericsson"),
                        "totalprice",Matchers.equalTo(680),
                        "depositpaid",Matchers.equalTo(true),
                        "additionalneeds",Matchers.equalTo(null));
    }
}
