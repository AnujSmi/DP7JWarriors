package com.arraysobj;

import java.util.Arrays;

public class Student1 {
	
	private int id;
	private String name;
	private float marks[];
	
	Student1()
	{
		marks=new float[5];
		
	}
	public Student1(int id, String name, float marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public float[]getMarks()
	{
		return marks;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}

}
