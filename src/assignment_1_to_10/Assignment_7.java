package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_7 {

	public static void main(String[] args) {
		//Write a program that reads the radius and length of a cylinder and computes volume.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double r = input.nextDouble();
		System.out.println("Enter the length : ");
		double l = input.nextDouble();
		final double PI = 3.14;
		double V = PI*r*r*l;
		System.out.println("The volume of a cylinder is " +V+ " m^3.");
	}

}
