package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.http.ContentType;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matcher;

import utilities.RestAssuredExtension;

public class getPostStepDefinition {
	
	private static ResponseOptions<Response> response;
	
	@Given("^User performs GET operation for \"([^\"]*)\"$")
	public void user_performs_GET_operation_for(String url) throws Throwable {
		
		response = RestAssuredExtension.GetOps(url);
	}

	@Then("^User should see status code as 200")
	public void user_should_see_author_name_as() throws Throwable {
		
		
		String APIResponse = response.getBody().jsonPath().prettyPrint();
		System.out.println("API Response: " + APIResponse);
		
		int statusCode = response.statusCode();
		System.out.println("Status Code: " + statusCode);
		assertThat(response.statusCode(), equalTo(200));
	}

	@Then("^User should see author names$")
	public void user_should_see_author_names() throws Throwable {
		
		BDDStyledRA.PerformContainsCollection();	
	}
	
	@Then("^User should verify GET parameters$")
	public void user_should_verify_GET_parameters() throws Throwable {
		
		BDDStyledRA.PerformPathParams();
	}
	
	@Then("^User should verify GET query parameters$")
	public void user_should_verify_GET_query_parameters() throws Throwable {
		
		BDDStyledRA.PerformQueryParams();
	}
}
