package lattu.utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppSpecDriver {

	static WebDriver driver;

	public static WebDriver openBrowser(String browserName, String url) {

		if (driver == null) {
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
		}

		return driver;
	}

	public static void clickOnButton(WebElement element) {
		waitForElementPresent(element);
		element.click();
	}

	public static void enterText(WebElement element, String text) {
		waitForElementPresent(element);
		element.sendKeys(text);
	}

	public static String getText(WebElement element) {
		waitForElementPresent(element);
		String s = element.getText();
		return s;
	}

	public static void switchToWindow(String expectedPageTitle) {

		Set<String> allWindows = driver.getWindowHandles();

		for (String string : allWindows) {

			driver.switchTo().window(string);

			String currentPageTitle = driver.getTitle();

			if (currentPageTitle.equalsIgnoreCase(expectedPageTitle)) {
				break;
			}

		}

	}

	// wait implicit wait/ explicit/ fluent

	public static void waitForElementPresent(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void closeWindow() {
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
