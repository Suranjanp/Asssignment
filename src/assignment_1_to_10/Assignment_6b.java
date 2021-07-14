package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_6b {

	public static void main(String[] args) {
		// Perimeter of triangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lenght of first, second and third sides of triangle : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double Perimeter = a + b + c;
		System.out.println("Perimeter = " +Perimeter);
	}

}
