package WeatherApp;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class GetWeather {
    public static void main(String[]args) {
        /*Things needed
        *domain = https://api.openweathermap.org/data/2.5
        *resource = /weather
        * queryParam1 = lat= 39.2128
        * queryParam2 = lon= 76.7137
        * queryParam3 = appid= 821ca3c86499c3cc4560a2292948bb5a
         */

        RestAssured.baseURI = "https://api.openweathermap.org/data/2.5";

        String apiKey = "821ca3c86499c3cc4560a2292948bb5a";

        String resource = "/weather";

        String latitude = "39.2128";
        String longitude = "-76.7137";

        Response response = given().queryParam("lon",longitude).queryParam("lat",latitude).queryParam("appid",apiKey).get(resource);

        System.out.println(response.asString());
    }
}
