package com.operators;
import java.util.Scanner;

public class Greaternumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second nunber");
		int num2 = sc.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greatrer");
			
		}
		else
		{
			System.out.println("num2 is greater");
		}
	}

}
