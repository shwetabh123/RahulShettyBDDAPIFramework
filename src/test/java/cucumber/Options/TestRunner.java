package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue= {"stepDefinitions"},
	
		plugin= {"pretty","json:target/cucumber.json",
				"html:target/cucumber-html-report","junit:target/cucumber.xml",
				"rerun:target/rerun.txt"
				
		}
	//	tags="not @Regression"		
		
		
		)
public class TestRunner {
	
	
	
	
	

}
