package com.operators;
import java.util.Scanner;
public class Stringswitch {
	public static void main(String args[])
	
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= sc.nextInt();
		System.out.println("Enter the Second number");
		int num2= sc.nextInt();
		System.out.println("Enter the operations");
		String operations = sc.next();

		switch (operations) {
		case "add": System.out.println(num1+num2);
		break;
		case"SUBTRACT": System.out.println(num1-num2);
		break;
		case"Division": System.out.println(num1/num2);
		break;
		case"Multilpication": System.out.println(num1*num2);
		break;
		default:System.out.println("Error");
		
	}

}
}
