package rest.testsuite;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class AddPlace {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().log().all().headers("Content-Type", "application/json").headers("key", "qaclick123")
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -93.383494,\r\n" + "    \"lng\": 42.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 1234\",\r\n"
						+ "  \"address\": \"29, side layout, lattu 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://hello.com\",\r\n" + "  \"language\": \"French-IN\",\r\n"
						+ "  \"language111111\": \"French-IN\"\r\n" + "}")
				.when().post("maps/api/place/add/json").then().log().all().extract().response().toString();

	}

}
