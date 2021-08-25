$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/placeValidatures.feature");
formatter.feature({
  "name": "Validating Place API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if Person is being Successfully added using AddPersonAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Add Person Payload with \"\u003cfirst_name\u003e\" \"\u003clast_name\u003e\" \"\u003cid\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"AddPersonAPI\" with Post http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API Call got success with status code 201",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name",
        "id"
      ]
    },
    {
      "cells": [
        "shwetabh",
        "srivastava",
        "4"
      ]
    },
    {
      "cells": [
        "ocean",
        "srivastava",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if Person is being Successfully added using AddPersonAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Add Person Payload with \"shwetabh\" \"srivastava\" \"4\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.add_Person_Payload_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"AddPersonAPI\" with Post http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_calls_with_Post_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API Call got success with status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_API_Call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if Person is being Successfully added using AddPersonAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Add Person Payload with \"ocean\" \"srivastava\" \"5\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.add_Person_Payload_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"AddPersonAPI\" with Post http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_calls_with_Post_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API Call got success with status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_API_Call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if Person is being Successfully deleted using DeletePersonAPI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Delete Person \"5\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.delete_Person(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"DeletePersonAPI\" with Delete http request for ID \"5\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_calls_with_Delete_http_request_for_ID(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API Call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_API_Call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
});