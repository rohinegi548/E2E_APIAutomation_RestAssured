package stepdefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;

import io.cucumber.java.Before;
import resources.LoggerHelper;

public class Hooks {
	
	Logger log = LoggerHelper.getLogger(Hooks.class);
	stepDefinitions m = new stepDefinitions();
	
	/*@Before("@getPlaceAfterAddingPlace "
			+ "and @updatePlaceAfterAddingPlace "
			+ "and @getPlaceAfterUpdatingAddress "
			+ "and @deletePlace")
	public void execute_if_no_place_id_exist() throws IOException{
		
		m.user_supply_as_request_payload_to_add_place("John Gonzalez", "French-IN", "NY South Eve");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.The_API_call_got_success_with_status_code("200");
		m.in_response_body_is("status", "OK");
		m.in_response_body_is("scope", "APP");
	}*/
	
	@Before("@getPlaceAfterDeletingPlace,@updatePlaceAfterDeletingPlace")
	public void beforeScenario() throws IOException{
		
		//execute_if_no_place_id_exist();
		m.user_supply_as_request_payload_to_add_place("John Gonzalez", "French-IN", "NY South Eve");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.The_API_call_got_success_with_status_code("200");
		m.in_response_body_is("status", "OK");
		m.in_response_body_is("scope", "APP");
		m.user_supply_delete_place_request_payload_to_delete_place();
		m.user_calls_with_http_request("DeletePlaceAPI", "DELETE");
		m.The_API_call_got_success_with_status_code("200");
		m.in_response_body_is("status", "OK");
		
	}

}
