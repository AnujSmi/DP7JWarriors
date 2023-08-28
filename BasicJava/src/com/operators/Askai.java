package com.operators;
import java.util.Scanner;
public class Askai {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  char c = sc.next().charAt(0);
	  if((c>'a'&&c<'z')||(c>'A'||c<'Z'))
	  {
	 System.out.println("It is an alphabet");
	  }
	  else if(c>='0'&&c<= '9') {
		  System.out.println("its ia an digit");
	  }
	  else {
		  System.out.println("it is an symbol");
	  }
	  
      sc.close();

  }
  
}
