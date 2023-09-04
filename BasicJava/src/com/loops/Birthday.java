package com.loops;
import java.util.Scanner;
public class Birthday {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of birthday");
		int num = sc.nextInt();
		for(int i =1; i<=num; i++)
		{
			System.out.println("she will get the coins on her birthdays accordingly " + i*i*i);
			
		}
	}
      
}
