package com.conditionals;
import java.util.Scanner;
public class Electricitybil {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units of consuption");
		double cosumed = sc.nextDouble();
		if(cosumed<=50) {
			double bill = cosumed*0.50;
			double finalbill= bill+((bill/100)*20);
			System.out.println("The Electricity bill according to the consuption is "+ bill);
			System.out.println("The final bill with addtional surcharge is "+ finalbill);	
		}
		else if(cosumed<=150) {
			double bill = cosumed*0.75;
			double finalbill= bill+((bill/100)*20);
			System.out.println("The Electricity bill according to the consuption is "+ bill);
			System.out.println("The final bill with addtional surcharge is "+ finalbill);	
		
		}
		else if(cosumed<=250) {
			double bill = cosumed*1.20;
			double finalbill= bill+((bill/100)*20);
			System.out.println("The Electricity bill according to the consuption is "+ bill);
			System.out.println("The final bill with addtional surcharge is "+ finalbill);	
		}
		else if(cosumed>250) {
			double bill = cosumed*1.50;
			double finalbill= bill+((bill/100)*20);
			System.out.println("The Electricity bill according to the consuption is "+ bill);
			System.out.println("The final bill with addtional surcharge is "+ finalbill);	
		}
		else {
			System.out.println("Error");
		}
	}

}
