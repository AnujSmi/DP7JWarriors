package com.cunstrutor;

public class Testify
{
	String name;
	Testify()
	{
		
	}
	Testify(String nmae)
	{
		
		this.name=name;
	}
	void display()
	{
		System.out.println("Hi"+name);
		this.show();
	}
	void show()
	{
		System.out.println("Welcome to thinkQuotient:"+name);
	}
	Testify CHngeName()
	{
		name=name+"ThhinkQ";
		return this;
	}
	public static void main(String args[])
	{
		Testify t1= new Testify("Shruti");
		t1.display();
		
		Testify dummy;
		dummy=t1.CHngeName();
		System.out.println(dummy.name);
	}
}


