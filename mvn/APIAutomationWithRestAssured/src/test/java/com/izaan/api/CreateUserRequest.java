package com.izaan.api;

import base.Base;
import base.BaseAssertion;
import base.GetToken;
import io.restassured.response.Response;
import utility.ReportManager;
import utility.URL;

public class CreateUserRequest {

    public static Response createUserAPI() {
        String token = GetToken.getToken();

        String bearerToken = "Bearer" + token;

         String url = URL.getEndPoint("/cognito-create-user");

         String requestBody = Base.generatePayLoadString("CreateUser.json");

         Response responseBody = Base.POSTRequest(url, requestBody, bearerToken);

         return responseBody;
    }



    }
