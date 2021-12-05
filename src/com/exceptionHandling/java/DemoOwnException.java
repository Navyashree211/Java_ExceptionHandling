package com.exceptionHandling.java;

public class DemoOwnException {
	public static void main(String[] args) {

		int i = 5;

		try {
			if (i < 10) {
				throw new Exception("Errrrrorrrr");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
