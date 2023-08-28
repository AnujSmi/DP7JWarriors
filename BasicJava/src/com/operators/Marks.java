package com.operators;
import java.util.Scanner;

public class Marks {
   public static void main(String args[])
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter name");
	   String name=sc.nextLine();
	   
       System.out.println("Enter the marks of subject 1");
       int sub1 = sc.nextInt();
       System.out.println("Enter the marks of subject 2");
       int sub2=sc.nextInt();;
       System.out.println("Enter the marks of subject 3");
       int sub3=sc.nextInt();;
       System.out.println("Enter the marks of subject 4");
       int sub4=sc.nextInt();;
       System.out.println("Enter the marks of subject 5");
       int sub5= sc.nextInt();;
       
       long percentage=(sub1+sub2+sub3+sub4+sub5/500*100);
       
       if(percentage>40)
       {
    	   System.out.print(name+"congrats you are passed");
    	   
       }
       else
       {
    	   System.out.println(name + "You are failed");
       }
   
   
}
}
