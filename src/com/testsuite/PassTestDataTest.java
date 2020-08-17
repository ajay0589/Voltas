package com.testsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassTestDataTest {

	@Test(dataProvider = "login")
	void testLogin(String userName, int password) {

		System.out.println(userName);
		System.out.println(password);

	}

	@DataProvider(name = "login")
	Object[][] testData() {

		// String[][] s = new String[1][2];
		Object[][] s = new Object[1][2];

		s[0][0] = "ajay1234";
		s[0][1] = 123456;
		return s;
	}

}
