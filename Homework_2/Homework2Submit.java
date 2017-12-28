package Homework_2;

import java.util.Scanner;

public class Homework2Submit {
	
	public static void ExtractAndAdd() {
		
			System.out.println("  ");
			System.out.println("Exercise 2.6: Extract digits and add them together ");
			System.out.println("  ");
			System.out.print("Enter a three-digit integer: ");
			Scanner  input = new Scanner(System.in);
			int number = input.nextInt();
			int thirdDigit = number % 10;
			number = number/10;
			System.out.println("The third digit is: " + thirdDigit + " the new number is:  " +  number);
		
			int secondDigit = number %10;
			number = number/10;
			System.out.println("The second digit is: " + secondDigit + " the new number is:  " +  number);
			System.out.println("The sum of the three digits is: " +  (thirdDigit + secondDigit +number));
		
		}
	
	
	
	public static void ShowCurrentTime() {
	 	System.out.println("  ");
	 	System.out.println("Exercise 2.8: Show current time with  an offset  ");
	 	System.out.println("  ");
		// Define milliseconds in an hour as a constant
		final long MILLISECS_IN_HOUR = 3600000;
		
		// Obtain the  offset from GMT
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for offset: ");
		long offset = input.nextLong();
		
		// Obtain offset in milliseconds
		long newOffsetSeconds = offset * MILLISECS_IN_HOUR;
		// System.out.println("new_offset_seconds is: " + newOffsetSeconds);
		  
	    // Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();
	    
	    // Calculate new milliseconds with offset
	    long totalMillisecondsWithOffset = totalMilliseconds + newOffsetSeconds;

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMillisecondsWithOffset / 1000;

	    // Compute the current second in the minute in the hour
	    long new_offset_totalSeconds = totalSeconds + newOffsetSeconds;
	    long currentSecond = new_offset_totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;

	    // Display results
	    System.out.println("Current time is " + currentHour + ":"
	      + currentMinute + ":" + currentSecond);
	  }


	public static void MonthlySaving() {

		
			System.out.println(" ");
			System.out.println("Exercise 2.13: This is the homework to calculate Monthly Savings ");
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
	
	

	public static void CalculateTrip() {

		
		System.out.println("  ");
		System.out.println("Exercise 2-23: This is the homework to calculate a trip");
		System.out.println("  ");
		
		System.out.println("Enter the distance you need to drive: ");
		Scanner inputDistance = new Scanner(System.in);
		double distance = inputDistance.nextDouble();
		
		System.out.println("Enter the miles per gallon for your car: ");
		Scanner inputMpg = new Scanner(System.in);
		double mpg = inputMpg.nextDouble();
		
		System.out.println("Enter the price per gallon of gasoline: ");
		Scanner inputGasPrice = new Scanner(System.in);
		double gasPrice = inputGasPrice.nextDouble();
		
		// calculate price of trip
		double priceOfTrip = (distance/mpg) * gasPrice;
		
		double roundedPriceOfTrip = (int)(priceOfTrip * 100)/100.0;
		
		System.out.println("The price of the trip is:" + priceOfTrip + " the rounded price of Trip is: $"+roundedPriceOfTrip );
		
	}

	public static void main(String[] args) {
		ExtractAndAdd();
		ShowCurrentTime();
		MonthlySaving();
		CalculateTrip();
		

	}

}
