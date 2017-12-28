package Homework_3;

import java.util.Scanner;
import java.util.InputMismatchException;

/* This class invites the user to enter two double numbers. 
 * If two doubles are entered incorrectly, user is invited to try again.
 * if two doubles are entered correctly, the program terminates.
 * 
 */

public class HandsOnLecture3_Part2 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter two double values separated by a space: ");
		
	
		Scanner input = new Scanner(System.in);

		boolean isValid = false;
	 
		while (isValid == false){

	    	try {

			double value = input.nextDouble();
			System.out.println("Input value is good.");
		 	double value2 = input.nextDouble();
		 	System.out.println("Input value is good. Exiting.");
		//	break; // input is good
			System.exit(0);
			
		} catch (final InputMismatchException e) {
				System.out.println("You did not enter two doubles. Try again");
			input.nextLine();
			continue; // keep looping until you found right one
			
			}
	    		    	
	    } while(true); //end of while
	    	   
	}
}
