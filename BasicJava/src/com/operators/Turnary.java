package com.operators;
import java.util.Scanner;
public class Turnary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		int max, max1;
		 max=a > b ? ( a > c ? a : c) : (b > c ? b : c);
		 max1= (a>b&&a>c)?a:b>c?b:c;
		 System.out.println("GREATEST NUMBER " + max);
		 System.out.println("GREATEST NUMBER " + max1);

	}

}
