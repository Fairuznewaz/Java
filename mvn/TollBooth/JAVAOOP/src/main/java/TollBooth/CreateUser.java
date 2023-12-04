package TollBooth;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateUser {

    public static void main(String[]args) {
        GetToken token = new GetToken();
        String accessToken = token.getToken();
        String bearerToken = "Bearer " + accessToken;


        RestAssured.baseURI = "https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev/cognito-create-user";
        String bodyToCreateUser = "{\"username\":\"Fairuz\",\"password\":\"Fairuz@1234\",\"email\":\"fairuz@gmail.com\",\"userType\":\"User\",\"name\":\"Test Data\"}";



        Response response = given()
                .header("Authorization", bearerToken)
                .body(bodyToCreateUser)
                .when()
                .post();

        System.out.println(response.prettyPrint());
        System.out.print(response.getStatusCode());
    }

}