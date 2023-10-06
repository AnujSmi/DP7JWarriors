package com.cunstrutor;
class Demo
{
	int a;
	int b;
	String name;
	
	Demo()
	{
		this(10,20);
		System.out.println("Default construtor");
		
	}
	Demo(int a, int b)
	{
		System.out.println("Param constructor 1");
		this.a=a;
		this.b=b;
		this.name="unknown";
	}
	Demo(int a, int b, String name)
	{
		System.out.println("Param constructor 2");
		this.a=a;
	    this.b=b;
	    this.name="name";
	}
	public String toString()
	{ 
		return "a"+a+"b"+name;
	}
}


public class Constructotchain {
	public static void main(String args[])
	{
		Demo d1= new Demo();
		System.out.println(d1);
		
		Demo d2= new Demo();
		System.out.println(d2);
		
		Demo d3= new Demo();
		System.out.println(d3);
	}

}
