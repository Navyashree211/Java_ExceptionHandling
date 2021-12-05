/*
 * @author : Navaya Shree
 */
package com.exceptionHandling.java;

public class Demo1Exception {
	public static void main(String[] args) {

		int i, j, k = 0;
		i = 8;
		j = 0;
		try {
			k= i/j;
		}
		
		catch (Exception e)  {
			System.out.println("Cannot Divide By Zero :"  + e);
			
			//System.out.println(e);
			
		}
		finally {
			System.out.println("Welcome to Exception Handling Program");
			
		}
		System.out.println(k);

	}
}
