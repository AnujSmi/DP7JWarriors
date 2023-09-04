package com.loops;
import java.util.Scanner;
public class Workingman {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr working hrs");
		int hrs=sc.nextInt();
		int salray = 100;
		for(int i=1; i<=hrs; i++)
		{
			salray=salray*hrs;
			int total=salray*365;
			System.out.println(total);

		}
	}

}
