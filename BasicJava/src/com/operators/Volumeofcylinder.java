package com.operators;
import java.util.Scanner;

public class Volumeofcylinder {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		float radius = sc.nextFloat();
		System.out.println("Enter the height");
		float height = sc.nextFloat();
		System.out.println(Math.PI*radius*radius*height);
		
	}
	

}

