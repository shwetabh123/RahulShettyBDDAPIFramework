Feature: Validating Place API's

#Scenario: Verify if Place is being Successfully added using AddPlaceAPI
 #   Given Add Place Payload
 #   When user calls "AddPlaceAPI" with Post http request
 #   Then the API Call got success with status code "201"
 #   And "status" in response body is "OK"
 #   And  "scope" in response body is "APP"
    
    
   @AddPerson @Smoke
   Scenario Outline: Verify if Person is being Successfully added using AddPersonAPI
    Given Add Person Payload with "<first_name>" "<last_name>" "<id>"
    When user calls "AddPersonAPI" with "Post" http request
    Then the "AddPersonAPI" Call got success with status code "201"
    And "status" in response body is "OK"
 
    
   Examples:
    |first_name|last_name |id|
    |rohan	   |srivastava|4 |
   	|ocean	   |srivastava|5 | 
    
    
       @GetPerson @Smoke
   Scenario Outline: Verify if Person is being Successfully get using GetPersonAPI

    Given Get Person Payload with "<id>"
    When user calls "GetSinglePersonAPI" with "GET" http request
    Then the "GetSinglePersonAPI" Call got success with status code "200"
    And "status" in response body is "OK"
        Examples:
    |id|
    |4 |
    |5 |
    
    
   @DeletePerson  @Smoke 
   Scenario Outline: Verify if Person is being Successfully deleted using DeletePersonAPI
    Given Delete Person Payload with "<id>"
    When user calls "DeletePersonAPI" with Delete http request for "<id>" 
    Then the "DeletePersonAPI" Call got success with status code "200"
    And "status" in response body is "OK"
      Examples:
    |id|
    |4 |
    |5 |
    
