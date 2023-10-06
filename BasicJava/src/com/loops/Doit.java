package com.loops;
import java.util.Scanner;
public class Doit {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.println("ENter the first number");
			int num1= sc .nextInt();
			System.out.println("Enter the seconf number");
			int num2 = sc.nextInt();
			System.out.println("Enter the arthematic operations");
			char operators= sc.next().charAt(0);

			switch(operators)
			{
			case '+': System.out.println(num1 + num2);
			break;
			case '-': System.out.println(num1-num2);
			break;
			case '*': System.out.println(num1*num2);
			break;
			case '/': System.out.println(num1/num2);
			break;
			default: System.out.println("Enter the invalid oprator");
			System.out.println("CONTINUE");	
			
		}
			ch=sc.next().charAt(0);

			
	
		}while(ch!='N'); 
		
			
		}
		
}


