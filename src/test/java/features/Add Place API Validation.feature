Feature: End to End (Add > Get > Update > Get Place) Response validations

@addPlace
Scenario Outline: Validating POST API response for adding place
Given User supply "<name>" "<language>" "<address>" as request payload to add place
When User calls "AddPlaceAPI" with "POST" http request
Then The API call got success with status code "StatCode200"
And "status" in response body is "OK"
And "scope" in response body is "APP"
#And "<name>" "<address>" should exist when "GetPlaceAPI" get called with "GET" request

Examples:
	| name | language | address |
	| Gablo Anderson | Spanish-IN | South BLVD. Ave 22 |
#	| Adam Brocato | French-IN | New GTA Ave 2, 5th flr |

@getPlaceAfterAddingPlace
Scenario: Validating GET API response for added place
Given User supply "place_id" as request payload to get the place
When User calls "GetPlaceAPI" with "GET" http request
Then The API call got success with status code "StatCode200"
And "name" and "address" are present in API response

@updatePlaceAfterAddingPlace
Scenario: Trying to update address for added place
Given User supply update address payload to update place api
When User calls "UpdatePlaceAPI" with "PUT" http request
Then The API call got success with status code "StatCode200"
And "msg" in response body is "Address successfully updated"

@getPlaceAfterUpdatingAddress
Scenario: Validating GET API response after updating address
Given User supply "place_id" as request payload to get the place
When User calls "GetPlaceAPI" with "GET" http request
Then The API call got success with status code "StatCode200"
And "name" and "address" are present in API response