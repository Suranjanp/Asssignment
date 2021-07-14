package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_6c {

	public static void main(String[] args) {
		// Perimeter of rectangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two sides of rectangle : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double p = a + b;
		System.out.println(p);
	}

}
