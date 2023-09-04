package com.Functions;

public interface Nubers {
	
	static void extract(int num) {
		System.out.println("the digit number is"+ num);
		while(num!=0)
		{
			System.out.println(num%10);
			num=num/10;
		
		}
	}
		public static void main(String args[]) {
			extract(5876);
	

}
}
