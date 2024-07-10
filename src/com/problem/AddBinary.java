package com.problem;// Java Program to Add Two Binary Strings

public class AddBinary {
	static String add_binary(String x, String y)
	{
		int num1 = Integer.parseInt(x,2);
		int num2= Integer.parseInt(y,2);
		int sum = num1 + num2;
		String result = Integer.toBinaryString(sum);
		return result; 
	}
		
		public static void main(String[]args)
		{
			String x = "010101", y = "101010";
			System.out.println(add_binary(x,y));
			System.out.println("Result: "+add_binary(x,y));
		}

	}