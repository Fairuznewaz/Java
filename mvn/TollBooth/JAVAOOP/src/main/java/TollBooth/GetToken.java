package TollBooth;

import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.response.Response;
import jdk.nashorn.internal.ir.Node;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


import static io.restassured.RestAssured.given;

public class GetToken {
    private static Node tokenAcess;
    private RestAssuredResponseOptionsGroovyImpl response;


    public String getToken() {
        /*Things needed
         *domain = https://api.openweathermap.org/data/2.5
         * https://is-toll-plaza-user-pool.auth.us-east-1.amazoncognito.com/oauth2/token?scope=feature-toll-plaza/read&grant_type=client_credentials
         * Basic Auth = t5bi323d5o1sp39q2jp9okjor : 7s6jcc3l0gmaps2ce9gt6cd6nm4sif8l77e0cae3lbnb5rp0mpa
         * endPoint = /oauth2/token
         * Body-type = x-www-form-urlencoded (we have convert into string data-type)
         */

        RestAssured.baseURI = "https://is-toll-plaza-user-pool.auth.us-east-1.amazoncognito.com";

        String bodyOfGetToken = "Scope=feature-toll-plaza/read&grant_type=client_credentials";

        String endPoint = "/oauth2/token";

        String userName = "t5bi323d5o1sp39q2jp9okjor";

        String password = "7s6jcc3l0gmaps2ce9gt6cd6nm4sif8l77e0cae3lbnb5rp0mpa";

        String credential = userName + ":" + password;

        byte[] credentialInBytes = credential.getBytes(StandardCharsets.UTF_8);

        String encodedCredential = Base64.getEncoder().encodeToString(credentialInBytes);

        String basicCredential = "Basic "+ encodedCredential;

        Response response = given().header("Content-Type","application/x-www-form-urlencoded")
                .header("Authorization",basicCredential)
                .body(bodyOfGetToken)
                .post(endPoint);

        System.out.println(response.prettyPrint());

        String authToken = response.jsonPath().get("access_token");

        return authToken;
    }



    public static void main (String[]args) {
        GetToken tokenAccess = new GetToken();
        tokenAccess.getToken();
    }



}
