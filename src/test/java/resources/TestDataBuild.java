package resources;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.AddPlace;
import pojo.Location;
import pojo.Person;

public class TestDataBuild {

	// queryParam("Key", "qaclick123").header("Content-Type","application/json")
	/*
	 * .body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" +
	 * "    \"lng\": 33.427362\r\n" + "  },\r\n" + "  \"accuracy\": 50,\r\n" +
	 * "  \"name\": \"Frontline house\",\r\n" +
	 * "  \"phone_number\": \"(+91) 983 893 3937\",\r\n" +
	 * 
	 * "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" +
	 * "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n" +
	 * "  \"website\": \"http://google.com\",\r\n" +
	 * "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "")
	 */

	public AddPlace addPlacePayLoad() {

		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setPhoneNumber("(+91) 983 893 3937");
		p.setAddress("29, side layout, cohen 09");
		p.setWebsite("http://google.com");
		p.setLanguage("French-IN");
		p.setName("Frontline house");
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);

		return p;

	}

	public Person addPersonPayLoad(String fname,String lname ,String id) {

		Person person = new Person();
	
		person.setFirstName(fname);
		person.setLastName(lname);

		person.setAge(35);
		
		person.setId(Integer.parseInt(id));
		person.setAddress("201 house no");
		person.setPhonenumbers("9978678");

		return person;

	}

}
