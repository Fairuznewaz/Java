package com.izaan.apitests;

import base.BaseAssertion;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.izaan.api.CreateUserRequest;
import io.restassured.response.Response;
import junit.framework.TestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.ReportManager;

public class CreateUserRequestTests {

    private static ExtentReports extent;
    private static ExtentTest testlog;



    /*Test Scenarios
*
*  @BeforeMethod
    public void beforeTests() {
        extent = ReportManager.getInstance();
        testlog = extent.createTests("Validate User Creation Test");
    }

    @AfterMethod
    public void afterTests() {
        extent.flush();
*
 */

    public void validateUserCreation(){

        extent = ReportManager.getInstance();
        testlog = extent.createTest("Validate User Creation Test");

        Response response = CreateUserRequest.createUserAPI();

        BaseAssertion.verifyStatusCode(response,200);

        BaseAssertion.verifySpecificMessage(response, "message", "User Created successfully!");

        extent.flush();
        
    }



    public void validateUserCreationWithExistingUsername(){

        extent = ReportManager.getInstance();
        testlog = extent.createTest("Validate User Creation Test");

        Response response = CreateUserRequest.createUserAPI();

        BaseAssertion.verifyStatusCode(response,200);

        BaseAssertion.verifySpecificMessage(response, "statusCode", "400" );

        BaseAssertion.verifySpecificMessage(response, "message", "User account already exists");

        extent.flush();

    }

}
