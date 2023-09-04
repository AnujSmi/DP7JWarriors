package com.Functions;

public class Calling {
  static void factnumber(long n)
  {
	  int fact =1;
	  for(int i =1; i<=n; i++)
	  {
		  fact*=i;
	  }

  }
  public static void main(String args[])
  
  {
	   factnumber(7);
	  factnumber(9);
  }
}

