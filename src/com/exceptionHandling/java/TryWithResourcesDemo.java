/*
 *@author : Navya Shree 
 */

package com.exceptionHandling.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesDemo {  
	public static void main(String[] args) throws IOException 
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Enter the String value : ");
			String str = "";
			str = br.readLine();
			System.out.println("Output of String is : " + str);
			
		}
				
	}
}
