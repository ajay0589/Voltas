package lattu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "inputEmail")
	private WebElement emailTextbox;

	@FindBy(name = "password")
	private WebElement passwordTextbox;

	@FindBy(css = "#login")
	private WebElement loginButton;

	@FindBy(className = "alert alert-danger text-center")
	private WebElement errorText;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	void enterEmail(String email) {
		appSpecDriver.enterText(emailTextbox, email);
	}

	void enterPassword(String password) {
		appSpecDriver.enterText(passwordTextbox, password);
	}

	void clickOnLogin() {
		appSpecDriver.clickOnButton(loginButton);
	}

	String getErrorText() {
		String s = appSpecDriver.getText(errorText);
		return s;
	}

	public String login(String email,String password) {
		enterEmail(email);
		enterPassword(password);
		clickOnLogin();
		return getErrorText();
	}

}
