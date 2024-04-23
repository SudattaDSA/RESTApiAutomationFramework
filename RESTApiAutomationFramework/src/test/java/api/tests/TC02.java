package api.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;

import api.endpoints.EndpointsValidationScenarios;
import api.payload.Payload;
import api.utilities.ExtentReportManager;
import io.restassured.response.Response;

public class TC02 {
	Faker faker;
	Payload userpayload;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeMethod
	public void initializeLoginTest() {
		extent = ExtentReportManager.getReports();
		test = extent.createTest("TC01");
	}

	@AfterMethod
	public void finish() {
		extent.flush();
	}

	@Test(priority = 2)
	public void verifyGetResponse2(){
		test.log(Status.INFO, "TC01 execution started.");
		Response response = EndpointsValidationScenarios.verifyRequest2();
		response.then().log().all();
		// Assert.assertEquals(response.getStatusCode(), "200");
		if (response.getStatusCode() == 200) {
			test.log(Status.PASS, "Validation Passed");
		} else {
			test.log(Status.FAIL, "Validation Failed");
		}
		test.log(Status.INFO, "TC01 execution finished.");
	}
}
