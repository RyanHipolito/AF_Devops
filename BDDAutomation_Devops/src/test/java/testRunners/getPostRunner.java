package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features/GetPost.feature", //feature file path
		glue = {"stepDefinitions"}, //path of step definitions
		format = {"pretty", "html:test-outout"},
		dryRun = false, //always set as false to execute the test steps
		monochrome = true // generates console output into a readable format
//First Demo for Devops
		)

public class getPostRunner extends AbstractTestNGCucumberTests {
	
}
