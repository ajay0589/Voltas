package lattu.stepDefinitions;

import io.cucumber.java.en.Given;

public class AddPlaceStepDefinition {

	@Given("I print hello")
	public void i_print_hello() {
		System.out.println("This is hello");
	}

}
