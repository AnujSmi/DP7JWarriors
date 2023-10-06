package com.encapsulation;

public class Employee {
	private int employeeId;
	private String employeename;
	private double esalary;
	
	
	public void setemployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public int getemployeeId()
	{
		return this.employeeId;
	}
	
	public void setemployeename(String employeename)
	{
		this.employeename=employeename;
	}
	public String getemployeename()
	{
		return this.employeename;
	}
	public void setesalary(double esalary)
	{
		this.esalary=esalary;
	}
	public double getesalary()
	{
		return this.esalary;
	}
	
	public String toString()
	{
		return employeeId+employeename+esalary;
		
	}
	

}
