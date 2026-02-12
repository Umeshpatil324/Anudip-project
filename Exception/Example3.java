package com.Exception;

public class Example3 {

	String str;

	void checkLength() throws NullPointerException {
		try {
 			System.out.println("length of the string is " + str.length());
			throw new NullPointerException();
		}
		catch(NullPointerException e){
			System.err.println(e.getMessage());
	}

	}

}