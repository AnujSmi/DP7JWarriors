package com.operators;

public class Conversion 

{
	public static void main(String args[])
	{
	char ch ='@';
	int x=ch;
	
	System.out.println(x);
	
	int x1 =76;
	char ch2 = (char)x1;
	System.out.println(ch2);
	
	char value1 = 'a';
	char value2= (char) (value1-32);
	System.out.println(value2);
	
	char value3 = 'A';       // conversion of char to char for having the same//
    char value4=(char)(value3+32); //o/p in lower case

	System.out.println(value4);
	
	char value5 = 'T';        //conversion to char t int
	int value6 = value5;
	System.out.println(value6);
	
	int new1 = 97;            // conversion of int to char                        //
	char new2 =(char)(new1);
	System.out.println(new2);
	

	
	
	
		
	
	

}
}
