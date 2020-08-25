package lattu.testsuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lattu.pages.BasePage;
import lattu.pages.HomePage;
import lattu.pages.LoginPage;

public class LoginTest {

	BasePage basePage;
	HomePage homePage;
	LoginPage loginPage;

	@BeforeTest
	void beforeTest() {
		basePage = new BasePage();
		homePage = new HomePage();
		loginPage = new LoginPage();
	}

	@Test
	void loginTest() {
		homePage.clickOnLoginButton();
		basePage.switchToBrowserWindow("Client Area - PHPTRAVELS");
		loginPage.login("ajay@mail.com", "hello1234");
	}

	@AfterTest
	void tearDown() {

	}

}
