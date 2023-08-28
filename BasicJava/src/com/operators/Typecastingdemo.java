package com.operators;

public class Typecastingdemo {
   public static void main(String[] args) {
	byte num1 = 78;
	byte num2 = 50;
	byte sum  = (byte) (num1+num2);
	
	short s1=78;
	short s2=56;
	
	short r = (short)(s1+s2);
	System.out.println(r);
	System.out.println(sum);
	
	float n1,n2;
	n1=78.5F;
	n2=67.3F;
	int result=(int)(n1+n2);
	System.out.println(result);

	
    int a= 90;
    int b= 45;
    int total= a+b;
	System.out.println(total);

    
    
}
}
