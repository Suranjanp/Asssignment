package assignment_11_to_21;

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
		//Write a program to print the number entered by the user only if the number entered is negative.
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = input.nextInt();
			if(n<0)
			{
				System.out.println(n);
			}
			else {
			System.out.println("Wrong Input. ");}
		}
			


	}


