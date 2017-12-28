package Homework_2;

import java.util.Scanner;

public class MonthlySaving {

	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("This is the homework to calculate Monthly Savings ");
		System.out.println(" ");
		// Ask the user for a monthly saving amount and annual interest rate
		
		System.out.println("How much do you want to save each month? ");
		Scanner inputAmount = new Scanner(System.in);
		double amount = inputAmount.nextDouble();
		
		System.out.println("What is the annual interest rate? ");
		Scanner inputAnnualInterest = new Scanner(System.in);
		double annualInterest = inputAnnualInterest.nextDouble();
		double monthlylnterest = (annualInterest/100)/12;
		double roundedMonthlyInterest = (int)(monthlylnterest * 100000)/100000.0;
	//	System.out.println("Rounded monthly interest is: " + roundedMonthlyInterest);
		System.out.println(" ");
		System.out.println("The annual interest is: " +  annualInterest + " the rounded monthly interest is: " + roundedMonthlyInterest);
		System.out.println(" ");
		double newAmount = 100;
		for (int month=0; month < 6; month++) {
			newAmount = (amount + newAmount) + (newAmount * roundedMonthlyInterest);
			double roundedNewAmount = (int)(newAmount * 100)/100.0;
			System.out.println("The new amount for month " + (month+1) + " is: " + roundedNewAmount);
			System.out.println(" ");
		}
			
		
	}

}
