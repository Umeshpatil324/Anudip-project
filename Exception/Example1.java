package com.Exception;

public class Example1 {
	public static void main(String[] args) {

		try {
			int arr[] = { 1, 2, 3, 4, 5, 6 };
			System.out.println("6th index is " + arr[5]);

			int res = 102 / 2;
			System.out.println("Division is " + res);

		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println(a);

		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());

		}
	}

}