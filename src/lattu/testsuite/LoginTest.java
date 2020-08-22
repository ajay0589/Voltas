package lattu.testsuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lattu.pages.HomePage;

public class LoginTest {

	HomePage homePage;
	
	@BeforeTest
	void beforeTest() {
		homePage = new HomePage();
	}
	

	@Test
	void loginTest() {
	//	homePage.clickOnLoginButton();
		
	}

}
