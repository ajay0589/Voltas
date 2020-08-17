package com.testsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	@Test()
	public void test1() {

		System.out.println("In test method");
		String expectedResult = "hello";
		String actualResult = "hello";

		Assert.assertEquals(actualResult, expectedResult);

		/*
		 * if (expectedResult.equalsIgnoreCase(actualResult)) {
		 * System.out.println("Test Passed"); } else {
		 * System.out.println("Test Failed"); }
		 */
	}

	
	@Test()
	public void test2() {

		Reporter.log("Printing something");
		
		System.out.println("In test method");
		String expectedResult = "hello";
		String actualResult = "hello2";

		Reporter.log("before assert");
		
		Assert.assertEquals(actualResult, expectedResult);

		/*
		 * if (expectedResult.equalsIgnoreCase(actualResult)) {
		 * System.out.println("Test Passed"); } else {
		 * System.out.println("Test Failed"); }
		 */
	}
	
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("in before method");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("in after method");
	}
	


	
	

}
