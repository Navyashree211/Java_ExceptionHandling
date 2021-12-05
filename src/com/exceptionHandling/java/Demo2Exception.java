package com.exceptionHandling.java;

public class Demo2Exception {   
	public static void main(String[] args) {

		int i, j, k = 0;
		int []a = new  int[4];
		i = 8;
		j = 2;
		
		try {
			k= i/j;  
			for (int c=0; c<=4;c++)
			{
               a[c] = c+1;
			}
			for (int value : a) {
				System.out.println(value);
			}
		}
		
		catch (ArithmeticException e)  {
			System.out.println("Cannot Divide By Zero :"  + e);
			
			//System.out.println(e);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Maximum number of values is 4 : "  + e);
		}
		
//		catch (Exception e) {
//			System.out.println("Unknown Exception : " + e);
//		}
		
		finally {
			System.out.println("Welcome to Exception Handling Program");
			
		}
		System.out.println( "The value of k is : " + k);

	}
}
