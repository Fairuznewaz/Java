package WeatherApp;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class DailyWeather {

        /*
         * domain= api.openweathermap.org/data/2.5
         * resource= /forecast
         * Query1= lat=40.7029134
         * query2= lon= -73.8006429
         * query3= cnt=16
         * query4= appid=821ca3c86499c3cc4560a2292948bb5a
         * */

        public static void main(String[] args) {
            RestAssured.baseURI="https://api.openweathermap.org/data/2.5";

            String resource= "/forecast";
            String latitude= "40.7029134";
            String longitude ="-73.8006429";
            String cnt ="16";
            String apiKey= "821ca3c86499c3cc4560a2292948bb5a";

            Response response=given().queryParam("lat",latitude).queryParam("lon",longitude).queryParam("cnt",cnt).queryParam("appid",apiKey).get(resource);
            System.out.println(response.prettyPrint());
        }
    }

