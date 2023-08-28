package com.conditionals;
import java.util.Scanner;
public class Movieticket {
	public static void main(String args[])
	{
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("Enter the movie name");
	  String moviename = sc.nextLine();
	  System.out.println("Enter the Rating");
	  float rating = sc.nextFloat();
	  System.out.println("Enter the pricce");
	  int price = sc.nextInt();
	  System.out.println("cupon codes are available");
	  System.out.println("press 0 for silver and 1 for gold");
	  int code = sc.nextInt();
	  int discount = 0;
	  if(code==0)
	  {
		  System.out.println("50 rs off");
		  discount = (price-50);
		  System.out.println("Your ticket is booked at price " + discount);

		 
	  }
	  else if(code==1) {
		  System.out.println("100rs off");
		   discount = (price-100);
		  System.out.println("Your ticket is booked at price " + discount);

	  }
	  else {
		  System.out.println("No Discount you have to pay actual price "+ price);
	  }
	  
	  
	}
	

}






