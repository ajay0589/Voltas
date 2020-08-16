package com.automation;

public class Chaining {

	static Chaining obj;

	public static void main(String[] args) {

		obj = new Chaining();

		obj.test3().test4().test5();

	}

	Chaining test3() {
		System.out.println("in test3");
		return obj;
	}

	Chaining test4() {
		System.out.println("in test4");
		return obj;
	}

	void test5() {
		System.out.println("in test5");
	}

	int test1() {
		System.out.println("in test1");
		int c = 10 + 24;

		return c;
	}

}
