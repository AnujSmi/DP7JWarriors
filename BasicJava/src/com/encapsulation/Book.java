package com.encapsulation;

public class Book {
   
	private int bookId;
	private String bname;
	private float price;
	
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public int getBookId()
	{
		return this.bookId;
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return this.bname;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return bookId+bname+price;
		
	}
	
}

