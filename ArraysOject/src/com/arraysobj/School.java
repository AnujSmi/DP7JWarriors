package com.arraysobj;

public class School {
	
	static void findTopper(Student stud[])
	{
		float maxMarks=Float.MIN_VALUE;
		Student st = new Student();
		
		for(Student s: stud)
		{
			if(s.getMarks()>maxMarks)
			{
				maxMarks=s.getMarks();
				st=s;
				
			}
		}
		System.out.println(st);
	}
	
	static void sortMarks(Student stud[])
			{
		       Student st = new Student();
		       for(int i =0; i<stud.length; i++)
		    	   
		       {
		    	   for(int j=i+1; j<stud.length; j++)
		    	   {
			    	   if(stud[i].getMarks()<stud[j].getMarks())
			    	   {
			    		  st = stud[i];
			    		  stud[i]=stud[j];
			    		  stud[j]=st;
			    	   }

		    	   }   	   
		       }
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student s = new Student();
		Student st[] = new Student[5];

		st[0] = new Student(100, "Kailash", 96.5f);
		st[1] = new Student(101, "Anuj", 96.9f);
		st[2] = new Student(102, "Vishal", 86.5f);
		st[3] = new Student(103, "Kailash", 76.5f);
		st[4] = new Student(104, "Kailash", 46.5f);
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------");
		
		for(int i=0; i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		System.out.println("...");
		findTopper(st);
		System.out.println("....");
		sortMarks(st);
		for(Student s:st)
		{
		  System.out.println(s);
		}


	}

}
