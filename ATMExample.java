package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 60000;
		int pin = 1234;// original pin.
		System.out.println("Enter your pin : ");
		int enteredPin = scanner.nextInt();
		if (enteredPin != pin) {
			System.out.println("Incorrect Pin. Existing");
			return;
		}
		int choice;
		do {
			System.out.println("||=======================================||");
			System.out.println("||============ATM Menu===================||");
			System.out.println("||===============1. check balance========||");
			System.out.println("||==============2. Deposit ==============||");
			System.out.println("||=============3. Withdraw===============||");
			System.out.println("||=============4.Exit====================||");
			System.out.println("||=======================================||");
			System.out.println("Enter Your Choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Your Balance is : "+balance);
				break;
			case 2:
				System.out.println("Enter Deposit Amount : ");
				double depositAmount=scanner.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please Deposit multiples"
							+ " Hunderd like[600,700]");
				}else {
					if(depositAmount<500) {
						System.out.println("Please Deposit More thyan 500 rupees."
								+ "minimum deposit is 500");
					}else {
						balance+=depositAmount;
						System.out.println("Deposited $ "+depositAmount
								+" amount succesfully. new Balance is : "+balance);
					}
				}
				break;
			case 3:
				System.out.println("Enter Withdraw Amount : ");
				double withdrawAmount=scanner.nextDouble();
				if(withdrawAmount%100!=0) {
					System.out.println("Please withdraw multiples"
							+ " Hunderd like[600,700]");
				}else {
					if(withdrawAmount<500) {
						System.out.println("Please withdraw More thyan 500 rupees."
								+ "minimum deposit is 500");
					}else {
						if(withdrawAmount<=balance) {
							balance-=withdrawAmount;
							System.out.println("withdraw $ "+withdrawAmount
									+" amount succesfully. new Balance is : "+balance);
						}else {
							System.out.println("insufficient funds");
						}
					}
				}
			case 4:
				System.out.println("Existing... Thank your for using ATM machine");
				break;
				default:
					System.out.println("Invalid Choice please choose a valid option(1-4)");
					break;
			}
			
		}while(choice!=4);
		scanner.close();
	}

}
