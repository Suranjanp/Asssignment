package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		//Write a program to find the perimeter of a circle, triangle, and rectangle.
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the radius of circle : ");
			double r = input.nextDouble();
			
			final double PI = 3.14;
			
			double Cir = 2*PI*r;
			
			System.out.println("The circumference of the circle is " +Cir);

	}

}
