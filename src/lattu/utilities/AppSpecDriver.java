package lattu.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppSpecDriver {

	static WebDriver driver;

	public static WebDriver openBrowser(String browserName, String url) {

		switch (browserName) {
		case "chrome":

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			break;
		case "firefox":
			break;
		case "ie":
			break;
		default:
			System.out.println("Enter correct browser name");
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public static void clickOnButton(WebElement element) {
		waitForElementPresent(element);
		element.click();
	}

	// wait implicit wait/ explicit/ fluent

	public static void waitForElementPresent(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

}
