package Assignmentcw;
import java.util.Scanner;
public class Additionnum {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for a random number
	        System.out.print("Enter any number: ");
	        int number = scanner.nextInt();
	            while (number >= 10) 
	            {
	                int sum = 0;
	                while (number > 0) {
	                    sum += number % 10;
	                }
	                number = sum; 
	            }
	            System.out.println("The one-digit result is: " + number);
	        }


	    }