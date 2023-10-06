package Assignmentcw;
import java.util.Scanner;

public class Inrese {



		public static void main(String[] args)

		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			int flag = 0;
			int rem = num % 10;
			while (num != 0) {
				int rem1 = num % 10;
				if (rem1 > rem) {
					flag = 1;
					break;
				}

				num = num / 10;
			}

			if (flag == 0) {
				System.out.println("incresing number is");
			} else {
				System.out.println("not incresing number");
			}

		}
	}

