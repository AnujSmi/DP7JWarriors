package Assignmentcw;
import java.util.Scanner;
public class Guessnumber {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int guess=34;
		for(int i=1; i!=0; i++)
		{
			System.out.println("Enter the number between 1 to 50");
			int num = sc.nextInt();

			if(num==guess) {
				System.out.println("you have the correcet number the time of atteempts are " + i);
				break;
			}
			else if(num<guess)
			{
				System.out.println("you have the LOWER number ");
			}
			else
			{
				System.out.println("you have entered the higher number ");
			}
		}
	}
}
