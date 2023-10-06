package com.encapsulation;
import java.util.Scanner;
import com.encapsulation.Book;
public class library {

	public static void main(String args[]) {
			Book b1 = new Book();
			b1.setbookId(1000);
			b1.setbname("author");
			b1.setprice(95);
		
			System.out.println(b1);
			
			
			Book b2 = new Book();
			System.out.println("Enter book id");
			Scanner sc= new Scanner(System.in);
		//	int bookId=sc.nextInt();
			
			b2.setbookId(sc.nextInt());
			System.out.println("Enter book name");
			b2.setbname(sc.next());
			System.out.println("Enter book price");
			b2.setprice(sc.nextFloat());
			
			
			
		
			
	}
}
