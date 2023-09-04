package com.conditionals;

public class Perfectnumber {
	public static void main(String args[])
	{
		int n=4;
		int count=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=(n-i); j--)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=1;j++)
			{
				System.out.println(count+" ");
				count++;
				
			}
			System.out.println();
		}
	}

}
