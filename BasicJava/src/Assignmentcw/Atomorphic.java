package Assignmentcw;
import java.util.Scanner;

public class Atomorphic {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int count=0;	
		int square=num*num*num;
		int pow=1;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		for(int i=1;i<=count;i++)
		{
			pow=pow*10;
		}
		System.out.println(square);
		if(square%pow==temp)
		{
			System.out.println("It is an atommoprhic ");
		}
		else
		{
			System.out.println("it is not an autpmorphic number");
		}
	}
}
