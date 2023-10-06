package com.encapsulation;

public class Bank {
    private int customerId;
    private String Name;
    private int accountnumber;
    private double ammount;
    private double balance=1000;
    
    public void setcustomerId(int customerId)
    {
    	this.customerId=customerId;
    	
    }
    public int getcustomerId()
    {
    	return customerId;
    }
    public void setName(String Name)
    
    {
    	this.Name=Name;
    }
    public String getName()
    {
    	return Name;
    }
    public void setaccountnumber(int accountnumber)
    {
    	this.accountnumber=accountnumber;
    }
    public int getaccountnumber()
    {
    	return accountnumber;
    }
    public void setammount(double ammount)
    {
    	this.ammount=ammount;
    	
    	
    }
    public double getammount()
    {
    	return ammount;
    }
   	
}   

