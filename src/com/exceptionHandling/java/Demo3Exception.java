package com.exceptionHandling.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo3Exception {   
	public static void main(String[] args) {
		int i,j=1, k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		i =8;
		try {
			System.out.println("User Enter the number of j : ");
			j= Integer.parseInt(br.readLine());
			k=i/j;
			
			System.out.println( "The output of k is : " + k);
		}
		catch (IOException e) {
			System.out.println("Some IO Error : " + e);
		}
		
		finally {
			System.out.println("Welcome to Exception Handling Program");
			
		}
		
	}
}	
