package Homework_4a;


/*
 * HandsOn-4 file
 * Author: Thomas Pfaeffle
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;

public class HandsOnLecture_4 {

	public static void main(String[] args) {
		
	
	}
		
		//--------------------------------------------------------------------------
		
		public static int getUserChoice (Scanner rI) { 
		int userChoice;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to the User Choice program");
		userChoice = getUserChoice(rI);
		System.out.println("\n You entered valid choice %d\n," + userChoice);
		System.out.println("Thank you for giving your choice");
		return userChoice;
		
		}
	
		public static float[] getTwoFloats() {
			// Reads two values and ensures they are float. Keeps looping until good values are entered.
			float value = 0;
			float value2 = 0;
			
			System.out.println("\nEnter two floats values separated by a space: ");
					
			Scanner rI = new Scanner(System.in);
			
			boolean isValid = false;
			
			while (isValid == false){

			 	try {
			 		// test first entered float
					value = rI.nextFloat();
						
			    	} catch (final InputMismatchException e) {
						System.out.println("You did not enter two floats. Try again.\n\n");
						rI.nextLine();
						continue; // keep looping until you found right one		
					
			    	} 	catch (final IllegalStateException e) {
						System.out.println("You did not enter two floats. Try again.\n\n");
						rI.nextLine();
						
						continue; // keep looping until you found right one	
						
					}
			   
				try {
					// test second entered float
				 	value2 = rI.nextFloat();
				 	// System.out.println("Input value is good.");
				 	
				} catch (final InputMismatchException e) {
					System.out.println("You did not enter two floats. Try again.\n\n");
					rI.nextLine();
					continue; // keep looping until you found right one		
				
		    	} 	catch (final IllegalStateException e) {
					System.out.println("You did not enter two floats. Try again.\n\n");
					rI.nextLine();
					rI.close();
					continue; // keep looping until you found right one	
					
				}	
				float[] float_array = {value, value2};
			 // input is good so return
			 	return float_array;	
		    		    	
		    } while (true); //end of while
		}
	
}


