package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class RestAssuredExtension {
	
	public static RequestSpecification Request;
	
	public RestAssuredExtension() {
		
		String excelPath = "./excelSheets/API_URLs.xlsx";
		String sheetName = "API URL";
		
		ExcelUtility excel = new ExcelUtility(excelPath, sheetName);
		
		//Arrange
		String apiURL = excel.getAPIURL(1, 2);
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(apiURL);
		builder.setContentType(ContentType.JSON);
		RequestSpecification requestSpec = builder.build();
		Request = RestAssured.given().spec(requestSpec);
	}
	
	public static void GetOpsWithPathParameter(String url, Map<String, String> pathParams) {
		//Act
		Request.pathParams(pathParams);
		try {
			Request.get(new URI(url));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ResponseOptions<Response> GetOps(String url) {
		//Act
		try {
			return Request.get(new URI(url));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
