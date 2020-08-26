package lattu.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportTest {
	
	//http://learn-automation.com/extent-report-with-selenium-webdriver/
	//http://learn-automation.com/how-to-capture-screenshot-for-failed-test-cases-in-selenium-webdriver/
	//https://www.seleniumeasy.com/selenium-tutorials/extent-reports-using-testng-listeners

	@Test
	void test1() {
		Assert.assertEquals("hello", "hello");
	}

	@Test
	void test2() {
		Assert.assertEquals("hello", "hello1");
	}

	@Test(dependsOnMethods = "test2")
	void test3() {
		Assert.assertEquals("hello", "hello");
	}

}
