package Assignmentcw;
import java.util.Scanner;
public class Guessnumber2 {
	public static void main(String args[])
	
	{
		int num=24;
		System.out.println("number" +num);
		int count=0;
		while(num!=0) {
			count++;
			Scanner sc = new Scanner(System.in);
			System.out.println("eneter the number");
			int num1=sc.nextInt();
			if(num>num1) {
				System.out.println("number is lower enter higher number");
			}
		 else if(num<num1)
		{
			System.out.println("number id higher enter lower number");
		}
		else
		{
			System.out.println("congrats u have entered the correct number and the number of attemptes were " + count);
			break;
		}
		}
	}

}
