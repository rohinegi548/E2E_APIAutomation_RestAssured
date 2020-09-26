package stepdefinitions;

import static io.restassured.RestAssured.given;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResAndStatCodes;
import resources.TestDataBuilder;
import resources.Utilities;

public class stepDefinitions extends Utilities {
	Response response;
	RequestSpecification request;
	static String place_id;

	@Given("User supply {string} {string} {string} as request payload to add place")
	public void user_supply_as_request_payload_to_add_place(String name, String lang, String address)
			throws IOException {

		request = given().spec(getReqSpecification()).body(TestDataBuilder.getAddPlacePayloadPOJO(name, lang, address));
		setGlobalRuntimeProperty("name", name);
		setGlobalRuntimeProperty("address", address);
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String http_method) throws IOException {

		if (http_method.equalsIgnoreCase("POST")) {
			response = request.when().post(APIResAndStatCodes.getResource(resource));
			setGlobalRuntimeProperty("place_id", getReskeyValue(response, "place_id"));
		} else if (http_method.equalsIgnoreCase("GET"))
			response = request.when().get(APIResAndStatCodes.getResource(resource));
		else if (http_method.equalsIgnoreCase("DELETE"))
			response = request.when().delete(APIResAndStatCodes.getResource(resource));
		else if (http_method.equalsIgnoreCase("PUT")){
			//String temp = getGlobalRuntimeProperty("address");
			//UpdatePlacePojo upj = new UpdatePlacePojo();
			System.out.println("hello ");
			response = request.expect().defaultParser(Parser.JSON)
					.when().put(APIResAndStatCodes.getResource(resource));
			System.out.println("hello "+getReskeyValue(response, "msg"));
			//setGlobalProperty("address", upj.getAddress());
			setGlobalRuntimeProperty("address",TestDataBuilder.getAddress());
			System.out.println("hello "+TestDataBuilder.getAddress());
		}
	}

	@Then("The API call got success with status code {string}")
	public void The_API_call_got_success_with_status_code(String status_code) {

		Assert.assertEquals(Integer.toString(response.getStatusCode()), APIResAndStatCodes.getResource(status_code));
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {

		Assert.assertEquals(getReskeyValue(response, key), value);
		/*System.out.println(getReskeyValue(response, key));
		System.out.println(value);
		System.out.println("hello");*/
	}

	@Then("{string} {string} should exist when {string} get called with {string} request")
	public void should_exist_when_get_called_with_request(String expctedName, String expctAddress, String resource,
			String http_method) throws IOException {

		place_id = getReskeyValue(response, "place_id");
		request = given().spec(getReqSpecification()).queryParam("place_id", place_id);
		user_calls_with_http_request(resource, http_method);
		Assert.assertEquals(getReskeyValue(response, "name"), expctedName);
		Assert.assertEquals(getReskeyValue(response, "address"), expctAddress);
	}

	@Given("User supply {string} as request payload to get the place")
	public void user_supply_as_request_payload_to_get_the_place(String placeid) throws IOException {

		request = given().spec(getReqSpecification()).queryParam(placeid, getGlobalRuntimeProperty("place_id"));
	}

	@Then("{string} and {string} are present in API response")
	public void and_are_present_in_API_response(String name, String address) throws IOException {

		 Assert.assertEquals(getReskeyValue(response, name),getGlobalRuntimeProperty("name"));
		 Assert.assertEquals(getReskeyValue(response, address),getGlobalRuntimeProperty("address"));
		/*System.out.println(getReskeyValue(response, name));
		System.out.println(getGlobalRuntimeProperty("name"));
		System.out.println("hello");*/
	}

	@Given("User supply delete place request payload to delete place")
	public void user_supply_delete_place_request_payload_to_delete_place() throws IOException {

		// String place_id = placeid.replace(placeid,
		// getGlobalRuntimeProperty("place_id"));
		request = given().spec(getReqSpecification())
				.body(TestDataBuilder.getDeletePlacePayload(getGlobalRuntimeProperty("place_id")));

	}
	
	@Given("User supply update address payload to update place api")
	public void user_supply_update_address_payload_to_update_place_api() throws IOException {
	    
		request = given()
				.spec(new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.setBaseUri(getGlobalProperty("baseURI"))
				.addFilter(RequestLoggingFilter.logRequestTo(logPutResponse()))
				.addFilter(ResponseLoggingFilter.logResponseTo(logPutResponse()))
				.addFilter(new AllureRestAssured())
				.build())
				.body(TestDataBuilder.getUpdatePlacePayload(getGlobalRuntimeProperty("place_id")));
	}
}
