package Homework_3;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

public class HandsOnLecture_Part1 {

	public static void main(String[] args) {
		
		 // Display the header of the table 
	    System.out.println("Welcome to the sorting program \n");
	    // Display the header of the table 
	    System.out.printf("%16s\n", "1. Title");
	    System.out.printf("%15s\n", "2. Rank");
	    System.out.printf("%15s\n", "3. Date");
	    System.out.printf("%16s\n", "4. Stars");
	    System.out.printf("%16s\n", "5. Likes");
	    System.out.printf("\n");
		
		Scanner inputNumber = new Scanner(System.in);
		
		int inputInt = 0;
		do { // Loop until we have correct input
			
			try {
			//	inputInt = inputNumber.nextInt(); // waits for user input
				System.out.print("Please enter a value between 1 to 5: ");
				inputInt = Integer.parseInt(inputNumber.next());
			} 
			// never catches the following one.
			catch (InputMismatchException e) {
				System.out.println("Input was wrong number format");
				inputNumber.nextLine();
			//	throw e; // pass the buck
			}
			catch (NumberFormatException e) {
				System.out.println("Input was bad text");
				inputNumber.nextLine();
			//	throw e; // pass the buck
			}
			if (inputInt < 1 || inputInt > 5) {
				inputNumber.nextLine();
			}
			else {
			System.out.println("Your input value is good");
			System.exit(1);}
			
		} while (true);	
	//		if (inputInt >= 1 && inputInt <= 5) {
	//				System.out.println(" Your input value" +  inputInt + "  is good.");
	//				System.exit(1);}
			//	break;} //if you are here, all is good
			 
			
	//	} while (true);

	}

}
