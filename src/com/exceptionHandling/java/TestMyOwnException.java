package com.exceptionHandling.java;

public class TestMyOwnException {
	public static void main(String[] args) {

		int i = 5;

		try {
			if (i < 10) {
				throw new MyException("Errrrrorrrr");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

