Feature: End to End (Delete > Get > Update place) Response Validations

@deletePlace
Scenario: Validating DELETE API response after deleting place
Given User supply delete place request payload to delete place
When User calls "DeletePlaceAPI" with "DELETE" http request
Then The API call got success with status code "StatCode200"
And "status" in response body is "OK"

@getPlaceAfterDeletingPlace
Scenario: Validating GET API response after place got deleted
Given User supply "place_id" as request payload to get the place
When User calls "GetPlaceAPI" with "GET" http request 
Then The API call got success with status code "StatCode404"
And "msg" in response body is "Get operation failed, looks like place_id  doesn't exists"

@updatePlaceAfterDeletingPlace
Scenario: Validating PUT API response after place got deleted
Given User supply update address payload to update place api
When User calls "UpdatePlaceAPI" with "PUT" http request
Then The API call got success with status code "StatCode404"
And "msg" in response body is "Update address operation failed, looks like the data doesn't exists"


