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

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class StepDefinition extends Utils {

	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;

	TestDataBuild data = new TestDataBuild();

	@Given("Add Place Payload")
	public void add_Place_Payload() throws FileNotFoundException {

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification())

				.body(data.addPlacePayLoad());

	}

	@Given("Add Person Payload")
	public void add_Person_Payload() throws FileNotFoundException {

		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		res = given().spec(requestSpecification())

				.body(data.addPersonPayLoad());

	}

	@When("user calls {string} with Post http request")
	public void user_calls_with_Post_http_request(String string) throws FileNotFoundException {

		// response =requestSpecification().when().post("/maps/api/place/add/json")

		response = requestSpecification().when().post("/place")

				.then().spec(resspec).extract().response();

	}

	@Then("the API Call got success with status code {int}")
	public void the_API_Call_got_success_with_status_code(Integer int1) {

		assertEquals(response.getStatusCode(), 200);

		
		/*
		 * Response response =res.when().post("/maps/api/place/add/json")
		 * 
		 * .then().spec(resspec).extract().response();
		 * 
		 * String responsestring=response.asString();
		 * System.out.println(responsestring);
		 */
//body("scope",equalTo("APP")).header("Content-Type","application/json;charset=UTF-8");

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {

//	String res=response.asString();

//	JsonPath js=new JsonPath(res);

//	assertEquals(js.get(key).toString(),value);

	}

}