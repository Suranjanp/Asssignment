package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_8a {

	public static void main(String[] args) {
		//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Fahrenheit : ");
		double F = input.nextDouble();
		double C = (32*F-32)*5/9;
		System.out.println(F+ " farhenheit is " +C+ " degree. ");
		

	}

}
