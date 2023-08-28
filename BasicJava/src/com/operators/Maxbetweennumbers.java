package com.operators;

import java.util.Scanner;

public class Maxbetweennumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rthe first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("First number is greater");
		}
		else if(b>c&&b>a)
		{
			System.out.println("Second number is greater");

		
	     }
		else if(c>a&&c>b)
		{
			System.out.println("Third number is greater");

		}

		else
		{
			System.out.println("error");

		}

}
}
