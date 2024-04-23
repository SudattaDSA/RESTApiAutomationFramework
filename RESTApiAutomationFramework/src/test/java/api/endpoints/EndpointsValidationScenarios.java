package api.endpoints;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class EndpointsValidationScenarios {

	public static Response verifyRequest1() {
		Response response = given().contentType(ContentType.JSON).when().get(EndpointsList.URL1).then().extract()
				.response();
		return response;
	}

	public static Response verifyRequest2() {
		Response response = given().contentType(ContentType.JSON).when().get(EndpointsList.URL2).then().extract()
				.response();
		return response;
	}

}
