package switchcase;
import java.util.Scanner;

public class Biggernumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1=90;
		int num2=78;
		int max;
		max=(num1>num2)?num1:num2;
		
	System.out.println(max+"is grater");
	if(num1>num2)
	{
		max=num1;
	}
	else
	{
		max=num2;
	}
	System.out.println(max+" is greater");
	}

}
