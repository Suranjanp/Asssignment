package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		
		//Write a program to find the sum and average of two numbers input by User (using Scanner class).
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first and second number : ");
		double a = input.nextDouble();
		double b =  input.nextDouble();
		double avg = (a + b)/2;
		System.out.println("The average of the two numbers is " +avg);
		
		


	}

}
