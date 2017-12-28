package Homework_4a;

/*
 *  Midterm project
 *  Author: Thomas Pfaeffle
 *  
 *  A simple calculator to be used with float values.
 * 
 * 
 */

import  java.util.InputMismatchException;
import java.lang.IllegalStateException;
import java.util.Scanner;


public class Calculator {


	public static void main(String[] args) {
	
	
		// Set up the replay of the calculator
		boolean keepGoing = true;
	do {
		// Display the header of the table 
	    System.out.println("Welcome to Tom Pfaeffle's Handy Calculator\n\n\t1. Addition\n\t2. Subtraction\n\t3. Multiplication\n\t4. Division\n\t5. Exit\n");
	    System.out.printf("\n");
	    
	    // Define operations list
	    String[] OPERATION_LIST = {"addition", "subtraction", "multiplication", "division", "exit"};
	    
	    
	  
	    System.out.print("Please enter a value between 1 to 5: ");
	    
	    
	    Scanner rI = new Scanner(System.in);
	    int userChoice = getUserChoice(rI);
	    System.out.print("The value you entered is " + userChoice + ", which means " + OPERATION_LIST[userChoice-1] + ".");
	    
	    // if the user chooses 5, exit the calculator.
	    if (userChoice == 5) {
	    	System.out.println("You will now exit the calculator. Goodbye.");
	    //	rI.close();
	    	System.exit(1);
	    }
	
	    
	    
	 //   get the returned two float values as an array. Extract from array.
	   
	    float[] float_array = getTwoFloats();
	    float value3 = float_array[0];
	    float value4 = float_array[1];
	    System.out.println("Float values that were entered are: " + value3 + " and " + value4);
	   
	    // Call the appropriate operation. Pass float values and operation list 
	    getOperation(userChoice, value3, value4, OPERATION_LIST);
	 
	    rI.nextLine();
	    
	    // Press enter to replay the calculator.
	    System.out.println("\n\nPress \"ENTER\" key to continue.");
	    rI.nextLine();
	  //  rI.close();
	    // keepGoing = true; Calculator stops only if user chooses 5.
	  } while (keepGoing);
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
	  
	
	
	public static int getUserChoice(Scanner rI) {
		int inputNumber;
		
		do { // Loop until we have correct input
			
			try {
			// waits for user input
			
				inputNumber = rI.nextInt();
				if (inputNumber >= 1 && inputNumber <= 5) {
					break;}
				else {
					System.out.println("Input was not an integer between 1 and 5. Try again.");
					continue;
				} 
			}
			catch (InputMismatchException e) {
				System.out.println("You have entered an invalid choice. Try again.");
				rI.nextLine();
				continue;
			}			
			
		} while (true);
		
		return inputNumber;
	}
	
	
	public static void getOperation(int choice, float value3, float value4, String[] OPERATION_LIST) {
		// Go to operation based on choice value
		
		switch (choice) {
		case 1:    System.out.print("Use the " + OPERATION_LIST[choice -1] + " operation.\n\n "); // Call addition method
					float addition_result = addTwoFloats(value3,  value4);
					String add_operation = OPERATION_LIST[choice -1];
					printResult(addition_result, add_operation);
					
			break;
			
		case 2:    System.out.print("Use the " + OPERATION_LIST[choice -1] + " operation.\n\n");// Call subtraction method
					float subtraction_result = subtractTwoFloats(value3,  value4);
					String sub_operation = OPERATION_LIST[choice -1];
					printResult(subtraction_result, sub_operation);
			break;
		
		case 3:   System.out.print("Use the " + OPERATION_LIST[choice -1] + " operation.\n\n");// Call  multiplication method
					float multiplication_result = multiplyTwoFloats(value3,  value4);
					String mult_operation = OPERATION_LIST[choice -1];
					printResult(multiplication_result, mult_operation);
			break;
			
		case 4:   System.out.print("Use the " + OPERATION_LIST[choice -1] + " operation.\n\n"); // Call division method
					float division_result = divideTwoFloats(value3,  value4);
					String div_operation = OPERATION_LIST[choice -1];
					printResult(division_result, div_operation);
			break; // wondering if this break is necessary
		
		}
		
	}
		
	
	public static float addTwoFloats(float a_value3, float a_value4){
		// Add two floats and return the results
		float result = a_value3 + a_value4;
		return result;
	
	}
	
	
	public static float subtractTwoFloats(float s_value3, float s_value4){
		// Subtract two floats and return the results
		float result = s_value3 - s_value4;
		return result;
	}
	
	
	public static float multiplyTwoFloats(float m_value3, float m_value4){
		// Multiply two floats and return the results
		float result = m_value3 * m_value4;
		return result;
	
	}
	
	public static float divideTwoFloats(float d_value3, float d_value4) {
		// Divide two floats. If denominator non-zero, we're OK
		float result = 0;
		if (d_value4 != 0) {
		result = (d_value3/d_value4);
		
		}
		else {
			// if denominator 0, get  two new floats and call divideTwoFloats again.
			System.out.println("You cannot divide by zero(0). You must enter your floats again. \n\n ");
			float[] new_float_array = getTwoFloats();
			d_value3 = new_float_array[0];
		    d_value4 = new_float_array[1];
		    divideTwoFloats(d_value3, d_value4);
			
		}
		return result;
		 
	}
	
	
	public static void printResult(float floatNumber, String operation ) {
		// Print the results
		System.out.printf("The result of your "  + operation + " operation is: " + "%12.2f", floatNumber);
		return;
	}
	
}
