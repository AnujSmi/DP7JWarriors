package com.operators;
import java.util.Scanner;
public class Consonat {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char c = sc.next().charAt(0);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			System.out.println("This are Vowel");
		}
		else
		{
			System.out.println("This are consonat");
		}
	}

}
