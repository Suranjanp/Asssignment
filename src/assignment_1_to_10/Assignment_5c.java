package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_5c {

	public static void main(String[] args) {
		//Area of triangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base and height : ");
		double b = input.nextDouble();
		double h = input.nextDouble();
		double A = 0.5*b*h;
		System.out.println("The area if traingle is " +A);

	}

}
