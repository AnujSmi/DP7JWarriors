package com.arraysobj;
import java.util.Scanner;

public class SchoolGetterSetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st []= new Student[3];
		
		for(int i =0; i<st.length; i++)
		{
			st[i]= new Student();
			
			System.out.println("ENTER STUDENT ID");
			
			st[i].setId(sc.nextInt());
			
			System.out.println("enter name");
			
			st[i].setName(sc.next());
			
			
			System.out.println("eNTER MAARKS");
			
			st[i].setMarks(sc.nextFloat());
		}
		System.out.println("....");
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		
	}

}
