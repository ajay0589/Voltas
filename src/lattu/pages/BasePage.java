package lattu.pages;

import org.openqa.selenium.WebDriver;

import lattu.utilities.AppSpecDriver;

public class BasePage {

	AppSpecDriver appSpecDriver;
	WebDriver driver;

	public BasePage() {

		driver = appSpecDriver.openBrowser("chrome", "https://phptravels.com/demo");

	}

	public void closeBrowser() {
		appSpecDriver.closeBrowser();
	}

	public void closeWindow() {
		appSpecDriver.closeWindow();
	}

	public void switchToBrowserWindow(String pageTitle) {
		appSpecDriver.switchToWindow(pageTitle);
	}

}
