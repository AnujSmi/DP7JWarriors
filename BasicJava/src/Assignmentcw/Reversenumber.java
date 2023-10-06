package Assignmentcw;
import java.util.Scanner;

public class Reversenumber 
		{
			public static void main(String args [])
			{
				Scanner in = new Scanner(System.in);
				System.out.println("enter");
				int n = in.nextInt();
				int orignal=n;
				int reverse = 0;
				while(n>0)
		   {
			int lastDigit = n%10;
			reverse = reverse * 10 + lastDigit;
			n = n/10;
		    }
				{
	        System.out.println(reverse);
	        if(reverse<orignal)
			{
				System.out.println(orignal-reverse);
			}
			else
			{
				System.out.println("0");
			}
	}
				
		
				
				//int answer=n-reverse;
				//System.out.println(answer);
		}
		}


