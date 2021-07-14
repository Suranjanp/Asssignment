package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		//Write a program to find the area of a circle, rectangle, and triangle.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double r = input.nextDouble();
		
		final double PI = 3.14;
		
		double Area = PI*r*r;
		System.out.println("Area = " +Area);

		

	}

}
