package com.testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityTests {

	@Parameters("browser")
	@Test(priority = 2)
	void bTest(String browserName) {
		System.out.println("In b test");
		System.out.println("Browser name:" + browserName);
	}

	@Test(priority = 0)
	void cTest() {
		System.out.println("In c test");
	}

	@Test(priority = 1)
	void aTest() {
		System.out.println("In a test");
	}

}
