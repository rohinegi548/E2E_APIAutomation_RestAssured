$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Add%20Place%20API%20Validation.feature");
formatter.feature({
  "name": "End to End (Add \u003e Get \u003e Update \u003e Get Place) Response validations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating POST API response for adding place",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addPlace"
    }
  ]
});
formatter.step({
  "name": "User supply \"\u003cname\u003e\" \"\u003clanguage\u003e\" \"\u003caddress\u003e\" as request payload to add place",
  "keyword": "Given "
});
formatter.step({
  "name": "User calls \"AddPlaceAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "language",
        "address"
      ]
    },
    {
      "cells": [
        "Gablo Anderson",
        "Spanish-IN",
        "South BLVD. Ave 22"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating POST API response for adding place",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addPlace"
    }
  ]
});
formatter.step({
  "name": "User supply \"Gablo Anderson\" \"Spanish-IN\" \"South BLVD. Ave 22\" as request payload to add place",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_as_request_payload_to_add_place(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"AddPlaceAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating GET API response for added place",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@getPlaceAfterAddingPlace"
    }
  ]
});
formatter.step({
  "name": "User supply \"place_id\" as request payload to get the place",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_as_request_payload_to_get_the_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"GetPlaceAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"name\" and \"address\" are present in API response",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.and_are_present_in_API_response(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Trying to update address for added place",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@updatePlaceAfterAddingPlace"
    }
  ]
});
formatter.step({
  "name": "User supply update address payload to update place api",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_update_address_payload_to_update_place_api()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"UpdatePlaceAPI\" with \"PUT\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"msg\" in response body is \"Address successfully updated\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating GET API response after updating address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@getPlaceAfterUpdatingAddress"
    }
  ]
});
formatter.step({
  "name": "User supply \"place_id\" as request payload to get the place",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_as_request_payload_to_get_the_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"GetPlaceAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"name\" and \"address\" are present in API response",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.and_are_present_in_API_response(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Get%20Place%20API%20Validation%20After%20Deleting%20Place.feature");
formatter.feature({
  "name": "End to End (Delete \u003e Get \u003e Update place) Response Validations",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating DELETE API response after deleting place",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@deletePlace"
    }
  ]
});
formatter.step({
  "name": "User supply delete place request payload to delete place",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_delete_place_request_payload_to_delete_place()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"DeletePlaceAPI\" with \"DELETE\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode200\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating GET API response after place got deleted",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@getPlaceAfterDeletingPlace"
    }
  ]
});
formatter.step({
  "name": "User supply \"place_id\" as request payload to get the place",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_as_request_payload_to_get_the_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"GetPlaceAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode404\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"msg\" in response body is \"Get operation failed, looks like place_id  doesn\u0027t exists\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating PUT API response after place got deleted",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@updatePlaceAfterDeletingPlace"
    }
  ]
});
formatter.step({
  "name": "User supply update address payload to update place api",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_supply_update_address_payload_to_update_place_api()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"UpdatePlaceAPI\" with \"PUT\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The API call got success with status code \"StatCode404\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.The_API_call_got_success_with_status_code(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"msg\" in response body is \"Update address operation failed, looks like the data doesn\u0027t exists\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.stepDefinitions.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});