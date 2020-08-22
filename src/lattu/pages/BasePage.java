package lattu.pages;

import org.openqa.selenium.WebDriver;

import lattu.utilities.AppSpecDriver;

public class BasePage {

	AppSpecDriver appSpecDriver;
	WebDriver driver;

	BasePage() {

		driver = appSpecDriver.openBrowser("chrome", "https://phptravels.com/demo");

	}

}
