package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_5b {

	public static void main(String[] args) {
		//Area of rectangle 
		
		Scanner input = new Scanner(System.in);
				System.out.println("Enter length and breadth : ");
				double l = input.nextDouble();
				double b = input.nextDouble();
				double A = l*b;
				System.out.println("The area of rectangle is " +A);

	}

}
