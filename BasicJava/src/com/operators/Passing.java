package com.operators;
import java.util.Scanner;
public class Passing {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice of your stream");
		String choice =sc.next();
		switch(choice) {
		case"1": System.out.println("MBA");
		break;
		case"2": System.out.println("MCA");
		break;
		default: System.out.println("error");
		
		System.out.println("enter passing criteria");
		int passing=sc.nextInt();
		switch(passing) {
		case 1:
		if(passing>=75) {
			System.out.println("you got admmision");
		}
		break;
		case 2:
			int passing1=sc.nextInt();
			if(passing>=70){
		
			}
		break;
		}
		
		}	
	

}
}
