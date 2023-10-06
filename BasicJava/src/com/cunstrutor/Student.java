package com.cunstrutor;

 class Student {
	private int id;
	private String name;
	private int age;
	
	
	//Student(int sid, String sname ,int sage)
	{
	//	int sid;
	//	String sname;
	//	age=sage;
	}
      Student()
      {
    	  
      }
      Student(int id, String name ,int age)
      {
    	  this.id=id;
    	  this.name=name;
    	  this.age=age;
    	  
      }
      public int getId()
      {
    	  return id;
    	  
      }
      public void setId(int id)
      {
    	  this.id=id;
      }
      public String getname()
      {
    	  return name;
    	  
      }
      public void setname(String name)
      {
    	  this.name=name;
      }
      public int getAge()
      {
    	  return age;
      }
      public void setAge(int age)
      {
    	  this.age=age;
      }
      
      
      public String toString()
      {
    	  return id +" " + name+" "+ age;
    	  
      }
      
      public class Paraconstructor
      {
    	  public static void main(String args[]) 
    	  {
    		  Student s1=new Student(101,"Anuj" , 24);
    		  Student s2=new Student(102, "Vikas",25);
    		  Student s3=new Student(103, "vishal", 26);
    		  
    		  Student s4=new Student();
    	  }
      }
}
