package com.cunstrutor;

class Movie
{
	private int movieId;
	private String moviename;
	private float rating;
	
	
	Movie()
	{
		
	}
	
	Movie(int movieId, String moviename, float rating)
	{
		this.movieId=movieId;
		this.moviename=moviename;
		this.rating=rating;
	}
	
	public void setMovieId(int movieId)
	{
		this.movieId=movieId;
	}
	public float getMovieId()
	{
		return movieId;
	}
	public void setMoviename(String moviename)
	{
		this.moviename=moviename;
	}
	public String getMoviename()
	{
		return moviename;
	}
	public void setRating(float rating)
	{
		this.rating=rating;
	}
	public float getRating()
	{
		return rating;
	}
	
	public String toString()

	{
		   return movieId+" " +moviename+" " +rating;

	}	
	
}

public class Movierating {

	static void checkRating(Movie i)
	{
		if(i.getRating()>=7.0)
		{
			System.out.println(i.getMovieId()+" "+i.getMoviename()+" "+i.getRating());
			
       	}
	}
			public static void main(String args[])
		{
			
			Movie i1= new Movie(1, "RRR", 3.2f);
			Movie i2= new Movie(2,"OMG",8.5f);
			Movie i3= new Movie(3,"Milk",6.0f);
			Movie i4= new Movie(4,"MGM",2.3f);
			Movie i5= new Movie(5,"CDQ",9.1f);
			
			System.out.println("-------------------------------------");
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
			System.out.println(i5);
			
			checkRating(i1);
			checkRating(i2);
			checkRating(i3);
			checkRating(i4);
			checkRating(i5);
			
			
			
			
			
		}
	}


