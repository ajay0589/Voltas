package com.testsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PassTestData {

	@Test(dataProvider = "login")
	void testLogin(String userName, String password) {

		System.out.println(userName);
		System.out.println(password);

	}

	@DataProvider(name = "login")
	Object[][] testData() {

		String[][] s = new String[2][2];

		s[0][0] = "ajay1234";
		s[0][1] = "ajay5678";
		return s;
	}

}
