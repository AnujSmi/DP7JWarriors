package com.conditionals;
import java.util.Scanner;
public class Positivenegative {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>=1) {
			System.out.println("Number is positive");
		}
		else if(number<0)
		{
			System.out.println("Number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		
	}

}
