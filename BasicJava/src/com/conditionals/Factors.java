package com.conditionals;
import java.util.Scanner;
public interface Factors {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		if((a>b)&&(a%b==0))
		{
			
			System.out.println("THE SECOND NUMBER IS A FACTOR OF FIRST");
		}
		else if((a>b)&&(a%b!=0))
		{
		 System.out.println("It is not a Factor");
		 
		}
	
		else {
			System.out.println("The factor should be greater than number");
		}
	}
	
}
