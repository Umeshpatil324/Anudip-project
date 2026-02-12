package com.Exception;

public class Example2 {

	String str;

	void checkLength() throws NullPointerException {
		System.out.println("length of the string is " + str.length());
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();
		try {
			ex.checkLength();

		} catch (Exception a) {
			System.err.println(a.getMessage());

		}
	}

}