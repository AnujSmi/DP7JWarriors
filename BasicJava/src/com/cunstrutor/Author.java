package com.cunstrutor;


class Books
{
	private String bname;
	private int Id;
	private float price;
	private String sname;
	private char category;
	
	Books(String bname,int id, float price, String sname,char category)
	{
		this.bname=bname;
		this.Id=id;
		this.price=price;
		this.sname=sname;
		this.category=category;
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public String getBname()
	{
		return bname;
	}
	public void setId(int Id)
	{
		this.Id=Id;
	}
	public int getId()
	{
		return Id;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public float getPrice()
	{
		return price;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public String getsname()
	{
		return sname;
	}
	public void setCategory(char category)
	{
		this.category=category;
	}
	public char getCategory()
	{
		return category;
	}
	
	
	
	public String toString()

	{
		   return bname+" "+Id+" "+price+" "+sname+" "+category;

	}	
	
}

public class Author {
	
	static void checkDiscount(Books b)
	{
		if(b.getCategory()=='S')
		{
			float discount=b.getPrice();
			discount=discount-(0.3f*discount);
			b.setPrice(discount);
		}
	}
   
	public static void main(String args[])
	{
		Books b1= new Books("abc",24,50.5f,"12/10/1989",'S');
		Books b2 =new Books("DEF",25,51.5f,"18/10/1980",'O');
		Books b3 =new Books("GHI",26,52.5f,"28/10/1981",'S');
		
		System.out.println("-------------------------------------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		 
				
		checkDiscount(b1);
		checkDiscount(b2);
		checkDiscount(b3);
		
		

}
}
