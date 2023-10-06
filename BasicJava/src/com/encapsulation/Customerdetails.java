
package com.encapsulation;
import java.util.Scanner;
public class Customerdetails {
  public static void main(String args[])
  {
	  Bank b1= new Bank();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter cutomer id");
	  int customerId = sc.nextInt();
	  
	  System.out.println("Enter name");
	  String Name = sc.next();
	  
	  System.out.println("Enter accountnumber");
	  int accountnumber = sc.nextInt();
	  
	  Customerdetails c = new Customerdetails();
	  System.out.println("you want to credit or debeit");
	  char ch=sc.next().charAt(0);
	  if(ch=='c')
	  {
		  System.out.println("enter the amount to be credited");
		  double ammount=sc.nextDouble();
		  c.getbalance
		  
	  }
	  else if(ch=='d')
	  {
		  System.out.println("enter the ammount to be debited");
		  double ammount=sc.nextDouble();
		  
	  }
	  else
	  {
		  System.out.println("ERROR");
	  }
	  
  }
}
