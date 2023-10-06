package com.cunstrutor;
class Test
{
	int a;
	int b;
	String name;
	
	Test()
	{
		System.out.println("Default constructor");
		this.a=10;
		this.b=20;
		this.name="unknown";
		System.out.println("Task has to be done everytime");
		
	}
	Test(int a, int b)
	{
		this();
		System.out.println("PARAM CONSTRUCTOR 1");
		this.a=a;
		this.b=b;
	}
	Test(int a, int b, String name)
	{
		this();
		System.out.println("Param consgrictor 2");
		this.a=a;
		this.b=b;
		this.name=name;
	}
	public String toString()
	{
		return "a:" +a+ "\n b:"+b+"\n name:"+name;
	}
}
public class cc2 {
	public static void main(String args[])
			{
		       Test t1= new Test();
		       System.out.println(t1);
		       Test t2= new Test();
		       System.out.println(t2);
		       Test t3= new Test();
		       System.out.println(t3);
			}

}
