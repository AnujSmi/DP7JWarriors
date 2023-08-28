package com.conditionals;

import java.util.Scanner;

public class Atm {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to HDFC ATM");
		System.out.println("ENTER 1 TO DEPOSIT");
		System.out.println("ENTER 2 TO WITHDRAW");
		System.out.println("ENTER 3 TO CHECK BALANCE");
		System.out.println("ENTER 4 TO EXIT");
		System.out.println("please enter the number of ur choice");
		int choice=sc.nextInt();
		if(choice==1) 
		    {
			System.out.println("Enter the ammount you want to Deposit");
			int deposit=sc.nextInt();
			System.out.println("Please provide the security PIN");
			int pin=sc.nextInt();
			int balance=10000;
			if(pin==12345)
			balance= balance+deposit;
			System.out.println("Yor new balance is"+balance);

		    }
         	    else if(choice==2) 
         	    {  
				System.out.println("Enter the amount to be widrwan");
				int widrawn = sc.nextInt();
				 int balance=10000; 
				 balance =balance-widrawn;
				System.out.println("Your Balance is" + balance);
	           }
				
				else if(choice==3) {
					System.out.println("Your available balance is 10000");
				}
				else if(choice==4){
					System.out.println("You Have Exited");
				}

			else 
			{
				System.out.println("You have entered an incorret PIN");
			}
			
		}

}
