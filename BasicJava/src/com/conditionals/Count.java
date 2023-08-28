package com.conditionals;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int count = 0;
        
        if (number == 0) {
            count = 1;
        } else 
        {
            for (long num2 = number; num2 != 0; num2/=10) {
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}


