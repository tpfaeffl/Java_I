package Homework_3;

import java.util.Scanner;

public class Homework3Submit {
	
	public static void Keypad() {
		
		System.out.println("  ");
		System.out.println("Exercise 4.15: Homework to enter a letter and associate it with a number on a keypad");
		System.out.println("  ");

		
		// Ask the user for a letter
		
		System.out.println("Enter a letter between A and Z: ");
		Scanner inputLetter = new Scanner(System.in);
		String stringLetter = inputLetter.next();

		char charLetter = stringLetter.charAt(0);
		char upper_char = Character.toUpperCase(charLetter);
	//	if ('A' <= upper_char <= 'C') {  why is this syntax not accepted?
		if (upper_char >= 'A' && upper_char  <= 'C') { 
			System.out.println("The letter "  + upper_char + " corresponds to number 2" );}
		
		else if (upper_char >= 'D' && upper_char  <= 'F') { 
			System.out.println("The letter "  + upper_char + " corresponds to number 3" );}
		
		else if (upper_char >= 'G' && upper_char  <= 'I') {
			System.out.println("The letter "  + upper_char + " corresponds to number 4" );}
		
		else if (upper_char >= 'J' && upper_char  <= 'L') {
			System.out.println("The letter "  + upper_char + " corresponds to number 5" );}
		
		else if (upper_char >= 'M' && upper_char  <= 'O') {
			System.out.println("The letter "  + upper_char + " corresponds to number 6" );}
		
		else if (upper_char >= 'P' && upper_char  <= 'S') {
			System.out.println("The letter "  + upper_char + " corresponds to number 7" );}
		
		else if (upper_char >= 'T' && upper_char  <= 'V') {
			System.out.println("The letter "  + upper_char + " corresponds to number 8" );}
		
		else if (upper_char >= 'W' && upper_char  <= 'Z') {
			System.out.println("The letter "  + upper_char + " corresponds to number 9" );}
		
		}

	
	public static void YearMonth() {
			System.out.println("  ");
			System.out.println("Exercise 4.17: Homework to enter a year and first three letter of a month name and \nand display number of days in the month");
			System.out.println("  ");
		
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
	
	
	public static void ValidSsNumber() {

			
		System.out.println("  ");
		System.out.println("Exercise 4.21: Homework to test if a Social Security number is valid");
		System.out.println("  ");
		
			Scanner input = new Scanner(System.in);
			// Prompt the user to enter two cities
		    System.out.print("Enter a Social Security Number: ");
			
			String SsNumber = input.nextLine();
			String testSsNumber = SsNumber; 
			
			int intLength = String.valueOf(SsNumber).length();
			System.out.println("The length is : " +  intLength);
			
			
			final int CORRECT_LENGTH = 11;

			
			if (intLength != CORRECT_LENGTH) {
				System.out.println(SsNumber + " is NOT a valid Social Security number. Try again.");
				System.exit(1);
			}
			
			for (int i =0; i < CORRECT_LENGTH; i++) {
				if ((i == 3 || i == 6)  && SsNumber.charAt(i) == '-'){
					continue;
				}
				if (!Character.isDigit(SsNumber.charAt(i) )) {
					System.out.println(SsNumber + " is NOT a valid Social Security number. Try again.");
					System.exit(0);
				}
			}
					
			System.out.println(SsNumber + " IS a valid Social Security number.");		
								

	  }
				
	public static void OrderThreeCities() {
			System.out.println("  ");
			System.out.println("Exercise 4.24: Homework to order three cities in alphabetical order.");
			System.out.println("  ");
	
		    Scanner input = new Scanner(System.in);
		    
		    // Prompt the user to enter two cities
		    System.out.print("Enter the first city: ");
		    String city1 = input.nextLine();
		    System.out.print("Enter the second city: ");
		    String city2 = input.nextLine();
		    System.out.print("Enter the third city: ");
		    String city3 = input.nextLine();
		    
		    // Fords  Mateo San   OK
		    if       (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) > 0)
		    	System.out.println("The cities in alphabetical order are " +
		    	city1 + " " + city2 + " " + city3);
		    
		    //Fords  San Mateo  OK
		    else if  (city1.compareTo(city2) < 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) > 0)  { // 2
		        System.out.println("The cities in alphabetical order are " + 
		        city1 + " " + city3 + ' ' + city2);}
		    
		    // Mateo Fords San OK
		    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) > 0) {  //3
		    	System.out.println("The cities in alphabetical order are " + 
		    	        city2 + " " + city1 + ' ' + city3);}
		    
		    // Mateo San Fords -- OK
		    else if (city1.compareTo(city2) < 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) < 0) {  // 4
		    	System.out.println("The cities in alphabetical order are " + 
		    	        city3 + " " + city1 + ' ' + city2);}
		    
		    // San Fords Mateo -- OK
		    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) <0 ) { // 5
		    	System.out.println("The cities in alphabetical order are " + 
		    	        city2 + " " + city3 + ' ' + city1);}
		    
		    // San Mateo Fords  --OK
		    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) < 0)  { 
		        	System.out.println("The cities in alphabetical order are " + 
		        	        city3 + " " + city2 + ' ' + city1);}
		          		
		    	   	
		  }
	
	public static void LicensePlate() {
		
		System.out.println("  ");
		System.out.println("Exercise 4.25(Optional): generate a 3 character, 4 digit license plate number");
		System.out.println("  ");

			  char letter1 = (char) ((int)(Math.random()*26+65));
			  char letter2 = (char) ((int)(Math.random()*26+65));
			  char letter3 = (char) ((int)(Math.random()*26+65));
			  
			  String string1 = (Character.toString(letter1) + Character.toString(letter2) + Character.toString(letter3));
					  
			
			   
			  int numbers =  (int)(Math.random()*10000);
			  //Zeros padding using format method
			  String sNumbers = String.format("%04d" ,numbers );
			   
			  System.out.println("The license plate number is " + string1 + sNumbers);
			   
	}

	public static void main(String[] args) {
		Keypad();
		YearMonth();
		ValidSsNumber();
		OrderThreeCities();
		LicensePlate();

	}

}
