package stepDefinitions;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

public class BDDStyledRA {
	
	public static void simpleGETPOST(String postNumber) {
		
		given().contentType(ContentType.JSON);
			when().get(String.format("http://localhost:3000/posts/%s", postNumber))
				.then().body("author", equalTo("AMBAGAN, Therese"));
	}
	
	public static void PerformContainsCollection() {
		
		given()
			.contentType(ContentType.JSON)
		.when()
			.get(String.format("http://localhost:3000/posts/"))
		.then()
			.body("author", containsInAnyOrder("AMBAGAN, Therese", "AMBAGAN, Therese", null))
			.statusCode(200);
	}
	
	public static void PerformPathParams() {
		
		//for detailsAPI implementation
		given()
			.contentType(ContentType.JSON)
		.with()
			.pathParams("post", "1")
		.when()
			.get("http://localhost:3000/posts/{post}")
		.then()
			.body("author", containsString("AMBAGAN, Therese"));
		
	}
	
	public static void PerformQueryParams() {
		
		//for listAPI implementation
		given()
			.contentType(ContentType.JSON)
			.queryParam("id", 1)
		.when()
			.get("http://localhost:3000/posts/")
		.then()
			.body("author", hasItem("AMBAGAN, Therese"));
		
	}

}
