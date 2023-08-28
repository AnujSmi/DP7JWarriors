package com.operators;

import java.util.Scanner;

public class AreaOfCircle

{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		double perimeter =2*Math.PI*radius;
		System.out.println(area);
		System.out.println(perimeter);
        sc.close();
	}
}
