package com.operators;
import java.util.Scanner;

public class Divisible 

{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	if(a%5==0 && a%11==0)
	{
		System.out.println("The number is divisible by 5 and 11");
		
	}
	else
	{
		System.out.println("The number is not dividible");
	}

}
}
