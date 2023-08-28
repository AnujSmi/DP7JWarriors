package com.loops;

public class New {
	public static void main(String args[])
	{
		for(int i =1; i<=50; i++)
		{
			if((i%5==0)&&(i%3==0)) {
				System.out.println("Bye");
			}
			
			else if(i%3==0) {
				System.out.println("hello");
			}
			else if(i%5==0) {
				System.out.println("Welcome");
				
			}
			else
			{
				System.out.println(i);
			}
				
		}
	}

}
