package com.cunstrutor;

 class Person2
 {
	 private int id;
		private String name;
		private int age;
		
		public Person2()
		{ 
		   id=100;	 
		   name="Unknown";
		   age=18;
		}
			
		public String toString()
		{
			return id+" "+name+" "+age;
		}
		

}

	public class Person
	{
		public static void main(String[]args) 
		{
			
			Person p= new Person();
			System.out.println(p);	
			
		}
	}
 
	
	
