Feature: Validating Place API's

Scenario: Verify if Place is being Successfully added using AddPlaceAPI
    Given Add Place Payload
    When user calls "AddPlaceAPI" with Post http request
    Then the API Call got success with status code 200
    And "status" in response body is "OK"
    And  "scope" in response body is "APP"
    
  #  Scenario: Verify if Person is being Successfully added using AddPersonAPI
  #  Given Add Person Payload
  #  When user calls "AddPersonAPI" with Post http request
  #  Then the API Call got success with status code 200
  #  And "status" in response body is "OK"
   
    
