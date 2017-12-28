package Homework_3;

import java.util.Scanner;


public class YearMonth {
	public static void main(String[] args) {
		// Prompt for a year and a month
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first three letters of a month: ");
	    String inputMonth = input.nextLine();
	    
	    if (inputMonth.length() !=3) {
	    	System.out.println("You entered " + inputMonth.length() + " letters. You must enter 3 letters only. Try again.");
	    	System.exit(0);
	    }
	    
	    String month = inputMonth.toUpperCase();
	    System.out.println("The month you entered was " + month);
	    
	    System.out.print("Enter a year (yyyy): ");
	    int year = input.nextInt();
	    int intLength = String.valueOf(year).length();
	    if (intLength !=4) {
	    	System.out.println("You entered " + intLength + " digits. You must enter a 4-digit year. Try again.");
	    	System.exit(0);
	    }
	    

		// See if the year is leap year
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		int days = 0;
		 
		switch (month) {
		case "FEB":
		 if (isLeapYear ) {
		    days = 29;
		    break;
		   }
		 days = 28;
		 break;
		 
		case "APR":
		case "JUN":
		case "SEP":
		case "NOV":
		 days = 30;
		 break;
		 
		case "JAN":
		case "MAR":
		case "MAY":
		case "JUL":
		case "AUG":
		case "OCT":
		case "DEC":
		 days = 31;
		 break;
		 
		default:
		 System.out.println("You might have mis-spelled the month. Try again.");
		 System.exit(0);
		 
		}
		 
		System.out.println("The " + month + " in the " + year + " has " + days + " days");
	}
}