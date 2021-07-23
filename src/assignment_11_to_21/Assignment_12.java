package assignment_11_to_21;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
	
		// Write a program to accept the roll, name, and nationality of the person and display those values in good format.
			Scanner input = new Scanner(System.in);
			 System.out.println("Enter Name : ");
			 String n = input.next();
			 System.out.println("Enter Roll Number : ");
			 int roll = input.nextInt();
			 System.out.println("Enter Nationality : ");
			 String na = input.next();
			 System.out.println("Your name is " +n+ ".\nYour roll number is " +roll+ ". Your nationality is " +na);
			} 

	}


