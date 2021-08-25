package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.TestDataBuild;
import resources.Utils;

import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpStatus;

import resources.APIResources;
import resources.EndPoints;

import static io.restassured.RestAssured.*;

public class StepDefinition extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;

	TestDataBuild data = new TestDataBuild();

	/*
	 * @Given("Add Place Payload") public void add_Place_Payload() throws
	 * IOException {
	 * 
	 * resspec = new
	 * ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.
	 * JSON).build();
	 * 
	 * res = given().spec(requestSpecification())
	 * 
	 * .body(data.addPlacePayLoad());
	 * 
	 * }
	 */
	@Given("Add Person Payload with {string} {string} {string}")
	public void add_Person_Payload_with(String fname, String lname, String id) throws IOException {

		resspec = new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification())

				.body(data.addPersonPayLoad(fname, lname, id));
	}

	/*
	 * @When("user calls {string} with Post http request") public void
	 * user_calls_with_Post_http_request(String string) throws FileNotFoundException
	 * {
	 * 
	 * // response =res.when().post("/maps/api/place/add/json")
	 * 
	 * //response = res.when().post("/place")
	 * 
	 * response = res.when().post(EndPoints.CREATE_PERSON)
	 * 
	 * .then().spec(resspec).extract().response();
	 * 
	 * }
	 */

	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {

		// response =res.when().post("/maps/api/place/add/json")

		// response = res.when().post("/place")

		APIResources resourceAPI = APIResources.valueOf(resource);

		System.out.println(resourceAPI.getResource());

		if (method.equalsIgnoreCase("POST")) 
			
			
			response = res.when().post(resourceAPI.getResource());

			// response = res.when().post(EndPoints.CREATE_PERSON)

		 else if (method.equalsIgnoreCase("GET"))

			
			response = res.when().get(resourceAPI.getResource());

					// response = res.when().post(EndPoints.GET_ALL_PERSON)
			
			//		.then().spec(resspec).extract().response();

	}
	
	
	
	@Given("Get Person Payload with {string}")
	public void get_Person_Payload_with(String id) throws IOException {
		
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification()).pathParam("id", id);
		
	
	
	}

	

	@Given("Delete Person Payload with {string}")
	public void delete_Person_Payload_with(String id) throws IOException {

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification()).pathParam("id", id);
		
		

	}

	@When("user calls {string} with Delete http request for {string}")
	public void user_calls_with_Delete_http_request_for(String string, String id) {

		response = res.when().delete(EndPoints.DELETE_PERSON)

				.then().spec(resspec).extract().response();
	}

	/*
	 * 
	 * @Then("the API Call got success with status code {string}") public void
	 * the_API_Call_got_success_with_status_code(String statuscode) {
	 * 
	 * int statusco= Integer.parseInt(statuscode);
	 * 
	 * System.out.println("status code is:" +response.getStatusCode());
	 * 
	 * assertEquals(response.getStatusCode(),statusco);
	 * 
	 * String responsestring=response.asString();
	 * System.out.println("response body is :-"+responsestring);
	 * 
	 * 
	 * 
	 * Response response =res.when().post("/maps/api/place/add/json")
	 * 
	 * .then().spec(resspec).extract().response();
	 * 
	 * String responsestring=response.asString();
	 * System.out.println(responsestring);
	 * 
	 * //body("scope",equalTo("APP")).header("Content-Type",
	 * "application/json;charset=UTF-8");
	 * 
	 * 
	 * 
	 * }
	 */

	@Then("the {string} Call got success with status code {string}")
	public void the_Call_got_success_with_status_code(String resource, String statuscode) {

		APIResources resourceAPI = APIResources.valueOf(resource);

		System.out.println(resourceAPI.getResource());

		if (resource.equalsIgnoreCase("AddPersonAPI")) {
			int statusco = Integer.parseInt(statuscode);

			System.out.println("status code is:" + response.getStatusCode());

			assertEquals(response.getStatusCode(), statusco);
		}

		else if (resource.equalsIgnoreCase("GetSinglePersonAPI")) {
			
			int statusco = Integer.parseInt(statuscode);

			System.out.println("status code is:" + response.getStatusCode());

			assertEquals(response.getStatusCode(), statusco);

		}
		
     else if (resource.equalsIgnoreCase("DeletePersonAPI")) {
			
			int statusco = Integer.parseInt(statuscode);

			System.out.println("status code is:" + response.getStatusCode());

			assertEquals(response.getStatusCode(), statusco);

		}

	

		String responsestring = response.asString();
		System.out.println("response body is :-" + responsestring);

		/*
		 * Response response =res.when().post("/maps/api/place/add/json")
		 * 
		 * .then().spec(resspec).extract().response();
		 * 
		 * String responsestring=response.asString();
		 * System.out.println(responsestring);
		 */
		// body("scope",equalTo("APP")).header("Content-Type","application/json;charset=UTF-8");

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {

//	String res=response.asString();

//	JsonPath js=new JsonPath(res);

//	assertEquals(js.get(key).toString(),value);

	}

}