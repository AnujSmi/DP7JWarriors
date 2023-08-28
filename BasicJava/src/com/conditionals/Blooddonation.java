package com.conditionals;
import java.util.Scanner;


public class Blooddonation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age=sc.nextInt();
		System.out.println("Enter the weight of person");
		int weight = sc.nextInt();
		
		if(age>=18)
		{
			if(weight>=70)
			{
				System.out.println("Eligilble for blood donation");
			}
			else {
				System.out.println("Your under weight");
			}
		
		}
		else
		{
			System.out.println("Your not eligilbe as your age is not greater than 18");
		}
		sc.close();
	}

}
