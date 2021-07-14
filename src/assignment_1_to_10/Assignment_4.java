package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principle : ");
		double P = input.nextDouble();
		System.out.println("Enter Time : ");
		double T = input.nextDouble();
		System.out.println("Enter Rate : ");
		double R = input.nextDouble();
		
		double I = (P*T*R)/100;
		System.out.println("The interest is " +I);
		
		
		
	}
}
