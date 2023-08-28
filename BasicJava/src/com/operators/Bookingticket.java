package com.operators;
import java.util.Scanner;

public class Bookingticket 
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Welcome to Eticket Booking");
	   System.out.println("Enter the airlines name");
	   String name = sc.nextLine();
	   System.out.println("Enter the Depart place");
	   String place =sc.nextLine();
	   System.out.println("Enter the Destination place");
	   String destination =sc.nextLine();
	   System.out.println("Enter the cupon code if you have");
	   int cupoun = sc.nextInt();
	   double price1 = 35000;

	   
	   if(cupoun ==12345)
	   {
		   
		   double price = 35000;
		   System.out.println("we are providing 15% discount");
		   
		   double discount = (price/100*15);
		   double finalprice = (discount-price);
		   
		   System.out.println("Your final price is" + finalprice);
		   System.out.println("Your Tickets are booked Enjoy your Jorney");	   
	   }
	   else if(cupoun!=12345)
	   {
		   System.out.println("no discount your price is"+ price1);
	   }
	   else {
		   System.out.println("Your tickets are not booked");
	   }
       sc.close();
   }
   
}
