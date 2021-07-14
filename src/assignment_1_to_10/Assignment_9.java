package assignment_1_to_10;

import java.util.Scanner;

public class Assignment_9 {

	public static void main(String[] args) {
		//Write a program that converts pounds into kg. The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
		Scanner input = new Scanner(System.in);
		System.out.println("Enter pound : ");
		double P = input.nextDouble();
		final double p = 0.454;
		double kg = P*0.454;
		System.out.println(P+ "lb = " +kg+ "kg");

	}

}
