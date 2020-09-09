package lattu.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import rest.testsuite.ReadTestJson;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import static io.restassured.RestAssured.*;


public class AddPlaceStepDefinition {

    ReadTestJson json;
    RequestSpecification specification;
    ResponseSpecification responseSpecification;
    String response;

    @Before // Hooks
    public void beforeTest() {
        System.out.println("before testcase");
    }

    @After
    public void afterTest() {
        System.out.println("after testcase");
    }

    @Given("I print hello")
    public void i_print_hello() {
        System.out.println("This is hello");
    }


    @Given("I remove hello")
    public void remove() {
        System.out.println("This is remove place");
    }

    @Given("I read something")
    public void iReadSomething() {
        System.out.println("hello SO");
    }

    @Given("I read something {string}")
    public void iReadSomething(String name) {
        System.out.println(name);
    }

    @Given("I pass data through data table")
    public void iPassDataThroughDataTable(DataTable data) {
        System.out.println(data.asMaps());
    }

    @Given("I read test data")
    public void iReadTestData() throws Exception {
        json = new ReadTestJson();
        json.readJson();

        RestAssured.baseURI = "https://rahulshettyacademy.com";

        specification = given().log().all().headers("Content-Type", "application/json").header("key", "qaclick123")
                .body(json.returnJson());
        // .when().post("maps/api/place/add/json").then().log().all().extract().response()
        // .asString();
    }

    @When("I send request")
    public void iSendRequest() {
        response = specification.when().post("maps/api/place/add/json").then().log().all().extract().response().asString();
    }

    @Then("I validate response")
    public void iValidateResponse() {
        JsonPath jsonObj = new JsonPath(response);

        String status = jsonObj.getString("status");
        System.out.println("Status is: " + status);

        Assert.assertEquals(status, "OK");
    }
}
