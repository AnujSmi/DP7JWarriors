package com.operators;
import java.util.Scanner;
public class Man {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of person");
		String name = sc.nextLine();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Enter the height");
		float height = sc.nextFloat();
		System.out.println("Enter the gender");
		char gender = sc.next().charAt(0);
		System.out.println("name -"+ name +  " age -"+ age +" height -"+height+" gender -"+gender);
		
	}

}
