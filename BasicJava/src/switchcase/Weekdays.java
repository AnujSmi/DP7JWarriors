package switchcase;
import java.util.Scanner;

public class Weekdays 
{

      public static void main(String[] args) 
	

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weekdays between 1-7");
		int weekdays = sc.nextInt();
		
		switch(weekdays) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Sturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		case 8:System.out.println("Eror");
		System.out.println("Have a nice day");
		}
		
	}
}


