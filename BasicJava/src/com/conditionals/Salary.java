package com.conditionals;
import java.util.Scanner;
public class Salary 
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int salary = sc.nextInt();
      if(salary<=10000) {
    	  System.out.println(salary+((20/100)*salary)+((80/100)*salary));
    	  
      }
      else if(salary<=20000)
      {
    	  System.out.println(salary+((25/100)*salary)+((90/100)*salary));

}
      else if(salary>20000)
      {
    	  System.out.println(salary+((35/100)*salary)+((95/100)*salary));

}
      else
      {
    	  System.out.println("Error");
      }
}
}
