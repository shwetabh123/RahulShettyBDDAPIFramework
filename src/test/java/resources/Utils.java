package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification req;
	
	public static final Properties prop = new Properties();

	public RequestSpecification requestSpecification() throws IOException {

		
		if(req==null)
		{	
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));

		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("base_url"))

				// req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com ")

				// .addQueryParam("Key", "qaclick123")
				
				

				.addFilter(RequestLoggingFilter.logRequestTo(log))

				.addFilter(ResponseLoggingFilter.logResponseTo(log))

				.setContentType(ContentType.JSON).build();

		return req;
	}
		return req;
		
	}

	
	
	public static String getGlobalValue(String key) throws IOException
	{
		
			FileInputStream inputStream = new FileInputStream("D:\\RestAssuredWorkspace\\RahulShettyBDDAPIFramework\\src\\test\\java\\resources\\global.properties");
		
			prop.load(inputStream);
			
		  return prop.getProperty(key);
			
			
			
	}

	
	

	
	
	
	
	
	
	
	
	
}
