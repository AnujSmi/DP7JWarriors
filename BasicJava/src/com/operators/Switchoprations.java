package com.operators;
import java.util.Scanner;
public class Switchoprations {
 
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1");
			int num1 = sc.nextInt();

			System.out.println("Enter number 2");
			int num2 = sc.nextInt();
			
			System.out.println("Enter operation +,-,*,/");
			char ch=sc.next().charAt(0);
			
			switch (ch) {
			case '+': System.out.println(num1+num2);
			break;
			case'-': System.out.println(num1-num2);
			break;
			case'/': System.out.println(num1/num2);
			break;
			case'*': System.out.println(num1*num2);
			break;
			default:System.out.println("Error");	
			}
			
		}
	}

