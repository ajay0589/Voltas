package rest.testsuite;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static org.hamcrest.Matchers.*;
//import static org.hamcrest.CoreMatchers.*;
import static io.restassured.RestAssured.*;

public class AddPlace {

	ReadTestJson json;

	public void runTest() throws Exception {
		json = new ReadTestJson();
		json.readJson();

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		Response response = given().log().all().headers("Content-Type", "application/json").header("key", "qaclick123")
				.body(json.returnJson()).when().post("maps/api/place/add/json").then().log().all().extract().response();

		int statusCode = response.getStatusCode();
		if (statusCode == 200) {
			System.out.println("stattus code passed");
		} else {
			System.out.println("stattus code failed");
		}

		response.then().assertThat().body("status", equalTo("OK"));

		ResponseBody responseBody = response.getBody();

		JsonPath obj = new JsonPath(responseBody.toString());

	}

	public static void main(String[] args) throws Exception {
		AddPlace obj = new AddPlace();
		obj.runTest();
	}

}
