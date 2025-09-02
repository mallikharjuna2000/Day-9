package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int number = scanner.nextInt();

		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		System.out.println("Factorial of : " + number + " is " + result);

	}

}
