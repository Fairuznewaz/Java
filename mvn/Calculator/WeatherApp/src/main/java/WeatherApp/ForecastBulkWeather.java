package WeatherApp;


import io.restassured.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class ForecastBulkWeather {


        public static void main(String[] args) {
            // Replace with your API key
            String apiKey = "821ca3c86499c3cc4560a2292948bb5a";

            // Setting Base URI
            RestAssured.baseURI = "http://api.openweathermap.org/data/2.5";

            // Preparing request
            Response response = given()
                    .queryParam("q", "Dallas")
                    .queryParam("appid", apiKey)
                    .queryParam("units", "metric") // You can change to "imperial" for Fahrenheit
                    .get("/weather");

            // Print response
            System.out.println("Response Body is: " + response.getBody().asString());
            System.out.println("Status Code: " + response.getStatusCode());

            // Let's write the response in a JSON file

            if (response.getStatusCode() == 200) {
                String responseBody = response.asString();
                String currentWorkingDir = System.getProperty("user.dir");
                System.out.println("Current working directory: " + currentWorkingDir);
                JsonWriteUtility.writeStringAsJsonFile(responseBody,  currentWorkingDir + "/output/weatherData.json");
            } else {
                System.out.println("Failed to fetch data: " + response.getStatusLine());
            }
        }
    }

