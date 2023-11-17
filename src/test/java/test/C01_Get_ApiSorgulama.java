package test;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {

     /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/83 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */

    // 1-url belirleyip url adresine gideceğiz
    // 2-expected data verilmişse expected data hazırlanır
    // 3-Actual data alınacak
    // 4-assertion işlemi

    @Test
    public void get01(){
        // 1-url belirleyip url adresine gideceğiz
        String url = "https://restful-booker.herokuapp.com/booking/46";
        // 2-expected data acikca verilirse belirlenecek
        // 3-actual data alinir

        Response response = given().when().get(url);

      // response.prettyPeek();
        System.out.println("status code : " + response.getStatusCode());   // 200
        System.out.println("content type : " + response.getContentType());  //  application/json; charset=utf-8
        System.out.println("server header degeri : " + response.getHeader("Server"));
        System.out.println("status line : " + response.getStatusLine());  //  HTTP/1.1 200 OK
        System.out.println("get time : " + response.getTime());   //  5 sn


    }
}
