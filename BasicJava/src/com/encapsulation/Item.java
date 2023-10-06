package com.encapsulation;

public class Item {
	int itemId;
	String itemNmae;
	float itemPrice;
	 
	void display() {
		System.out.println(itemId);
		System.out.println(itemNmae);
		System.out.println(itemPrice);


	}
	public static void main(String args[])
	{
		Item i1= new Item();
		i1. itemId=10;
		i1.itemNmae="Pen";
		i1. itemPrice =10;
		
		i1.display();
		
		
	}

}
