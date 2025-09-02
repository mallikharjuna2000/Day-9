package com.codegnan.controlstatements;

import java.util.Scanner;

import java.util.Scanner;
public class CanteenSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int teaPrice = 10, coffeePrice = 15, samosaPrice = 20;
		int teaQty = 0, coffeeQty = 0, samosaQty = 0;
		int choice;
		double taxRate = 0.05;
		do {
			System.out.println("\n||=========== CANTEEN MENU ===========||");
			System.out.println("1. View Menu");
			System.out.println("2. Order Items");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("\n--- MENU ---");
				System.out.println("1. Tea     - ₹" + teaPrice);
				System.out.println("2. Coffee  - ₹" + coffeePrice);
				System.out.println("3. Samosa  - ₹" + samosaPrice);
				break;
			case 2:
				System.out.print("Enter item number to order (1-3): ");
				int item = scanner.nextInt();
				System.out.print("Enter quantity: ");
				int qty = scanner.nextInt();
				if (qty <= 0) {
					System.out.println("Quantity must be greater than 0.");
					break;
				}
				switch (item) {
				case 1:
					teaQty += qty;
					System.out.println(qty + " Tea(s) added.");
					break;
				case 2:
					coffeeQty += qty;
					System.out.println(qty + " Coffee(s) added.");
					break;
				case 3:
					samosaQty += qty;
					System.out.println(qty + " Samosa(s) added.");
					break;
				default:
					System.out.println("Invalid item number. Please choose between 1 and 3.");
					break;
				}
				break;
			case 3:
				int teaTotal = teaQty * teaPrice;
				int coffeeTotal = coffeeQty * coffeePrice;
				int samosaTotal = samosaQty * samosaPrice;
				int subtotal = teaTotal + coffeeTotal + samosaTotal;
				double tax = subtotal * taxRate;
				double grandTotal = subtotal + tax;
				System.out.println("\n--- BILL ---");
				if (teaQty > 0) {
					System.out.println("Tea x" + teaQty + " = ₹" + teaTotal);
				}
				if (coffeeQty > 0) {
					System.out.println("Coffee x" + coffeeQty + " = ₹" + coffeeTotal);
				}
				if (samosaQty > 0) {
					System.out.println("Samosa x" + samosaQty + " = ₹" + samosaTotal);
				}
				if (subtotal == 0) {
					System.out.println("No items ordered yet.");
				} else {
					System.out.println("Subtotal = ₹" + subtotal);
					System.out.println("Tax (5%) = ₹" + tax);
					System.out.println("Total = ₹" + grandTotal);
				}
				break;
			case 4:
				System.out.println("Thank you! Exiting system.");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 4.");
				break;
			}
		} while (choice != 4);
		scanner.close();
	}
}
