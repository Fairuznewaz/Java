package TollBooth;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SubmitToll {
    public static void main(String[]args) {
        GetToken token = new GetToken();
        String accessToken = token.getToken();
        String bearerToken = "Bearer " + accessToken;


        RestAssured.baseURI = "https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev/tollcollection";
        String bodyToSubmitToll = "{\"id\": \"32343dfdfdf45\",\"createdAt\": \"10-Sep-2023\",\"collectionDate\": \"10-Sep-2023\",\"createdBy\": \"Amran\",\"updatedBy\": \"\",\"collectionPointId\": \"NY088734\",\"tagNumber\":  \"Tag3455632\",\"vehicleType\": \"Hybrid Vehicles\",\"tollCollectionMethod\":\"Cash\",\"tollRate\":10}";



        Response response = given()
                .header("Authorization", bearerToken)
                .body(bodyToSubmitToll)
                .when()
                .post();

        System.out.println(response.prettyPrint());
        System.out.print(response.getStatusCode());
    }
}
