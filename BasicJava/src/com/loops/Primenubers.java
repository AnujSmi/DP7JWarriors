package com.loops;
import java.util.Scanner;
public class Primenubers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber");
		int num=sc.nextInt();
		boolean flag=false;
	    for(int i=2; i<num; i++)
	    {
	    	if(num%i==0)
	    	{
	    		flag= true;
	    		break;
	    	}
	    }
	    if(flag==false)
	    {
	    	System.out.println("This is a prime nunmber");
	    }
	    else
	    {
	    	System.out.println("this is not a prime nunber");
	    }
		
	}

}
