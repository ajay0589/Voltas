package lattu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	// Page factory or By class

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginButton;

	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginButton() {

	//	driver.findElement(By.xpath("")).click();

	//	loginButton.click();

		appSpecDriver.clickOnButton(loginButton);
		
		
	}

}
