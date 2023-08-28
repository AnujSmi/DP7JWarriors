package switchcase;
import java.util.Scanner;

public class Month {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of month");
		String month = sc.nextLine();
		switch(month) {
		case"January":
		case"March":
		case"May":
		case"July":
		case"August":
		case"october":
		case"December":
			System.out.println("31 days");
			break;
		case"april":
		case"june":
		case"september":
		case"november":
			System.out.println("30 days");
			break;
		case"february":
			System.out.println("enter the yrar");
			int year= sc.nextInt();
			if((year%4==0)&&(year%100!=0)||(year%400==0))
					{
				        System.out.println("28 days");
					}
			else
			{
				System.out.println("29days");	
		}
			break;
			default:System.out.println("errorin input");
	}

}
}
