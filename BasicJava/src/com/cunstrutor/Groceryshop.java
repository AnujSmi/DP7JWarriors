package com.cunstrutor;
  class Item
  {
	  private String name;
	  private int id;
	  private float price;
  
  
  Item()
  {
	  
  }
  Item(int id, String name, float price)
  {
	  this.id=id;
	  this.name=name;
	  this.price=price;
  }
  public float getPrice()
  {
	  return price;
  }
  public void  setPrice(float price)
  
  
  {
	 this.price=price;
  }
  public int getId()
  {
	  return id;
  }
  public void setid(int age)
  {
	  this.id=id;
  }
  
  
public class Groceryshop {
	
	
	
	
  public static void main(String args[])
  {
	  Item i1= new Item(1,"flour",260);
	  Item i2= new Item(2,"flour",160);
	  Item i3= new Item(3,"flour",60);
	  Item i4= new Item(4,"flour",290);



	  
  }
}
}

