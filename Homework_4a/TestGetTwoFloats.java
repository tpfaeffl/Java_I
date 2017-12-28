package Homework_4a;

import java.util.InputMismatchException;
import java.lang.IllegalStateException;
import java.util.Scanner;

public class TestGetTwoFloats {

	public static float[] testGetTwoFloats() {
		// Reads two values and ensures they are float. Keeps looping until good values are entered.
		
		System.out.println("\nEnter two floats values separated by a space: ");
		float value = 0;
		float value2 = 0;
		Scanner rI = new Scanner(System.in);
		
		
		boolean isValid = false;
		
		while (isValid == false){

	    	try {

			value = rI.nextFloat();
			// System.out.println("Input value is good.");	
	    	} catch (final InputMismatchException e) {
				System.out.println("You did not enter two floats. Try again.\n\n");
				rI.nextLine();
				//continue; // keep looping until you found right one		
			
	    	} 	catch (final IllegalStateException e) {
				System.out.println("You did not enter two floats. Try again.\n\n");
				rI.nextLine();
				
				//continue; // keep looping until you found right one	
				
			}
	    //	float n_value = value;
			
	//-------------------------------------------------------	
		try {
		 	value2 = rI.nextFloat();
		 	// System.out.println("Input value is good.");
		 	
		} catch (final InputMismatchException e) {
			System.out.println("You did not enter two floats. Try again.\n\n");
			rI.nextLine();
		//	continue; // keep looping until you found right one		
		
    	} 	catch (final IllegalStateException e) {
			System.out.println("You did not enter two floats. Try again.\n\n");
			rI.nextLine();
			rI.close();
		//	continue; // keep looping until you found right one	
			
		}	
	 	
		 	
		float[] float_array = {value, value2};
		 
		 // input is good so return
		System.out.println(value + value2);
		// 	return float_array;
		 				
	     	 
	    		    	
	    } while (true); //end of while
	}
	
}
