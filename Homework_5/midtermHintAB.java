package Homework_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class midtermHintAB {
	
	
	public static int getUserChoice(Scanner readInput){
		int inputInt;
		do { // Loop until we have correct input
			System.out.print("Enter your choice between 1 and 5 only: ");
			try {
				inputInt = readInput.nextInt(); 
                        // waits for user input
				if (inputInt >= 1 && inputInt <= 5) {
					break; // Got it, done
				} else {
					System.out.println("You have not entered a number between 1 and 5. Try again.");
					continue; 
                              // continue looping as it is wrong number
				}
			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid choice. Try again.");
				readInput.nextLine(); // discard non-int input
				continue; 
                        // keep looping until you found right onee
			}
		} while (true);
		return inputInt;  
           //if you are here you got the correct choice
	}
	
	public static void getTwoFloats(float[] myFloats, Scanner readInput) {
		do { // Loop until we have correct input
			System.out.print("Enter two floats separated by a space: ");
			try {
				myFloats[0] = readInput.nextFloat();
				// waits for user input
				myFloats[1] = readInput.nextFloat();
				// waits for user input
				// if you are here, the floats were good, you
				// are done, breadk out from loop
				break;

			} catch (final InputMismatchException e) {
				System.out.println("You have entered an invalid input. Try again.");
				readInput.nextLine();
				// discard non-float input
				continue;
				// keep looping until you found right one
			}
		} while (true);
	}

	public static void main(String[] args) {
		Scanner rI = new Scanner(System.in);
		int userChoice;
		System.out.println("\nWelcome to get user choice program\n\n");
		userChoice = getUserChoice(rI);  
		System.out.printf("\nYou entered valid choice %d\n", 
                               userChoice);
		System.out.println("Thank you for giving your choice");
	//	rI.close(); 
            //you are done with scanner, now you can safely close it.
		
		
		float [] myFloats = new float[2];
		System.out.println("\nWelcome to bonus get two floats program\n\n");
		getTwoFloats(myFloats, rI); //since you are sending the 
              //array, you will receive new value in array itself
		  //you don't need to assign it on your left like you did 
              //in case of getChoice 
		System.out.printf("You entered %5.2f and %5.2f successfully!\n", 
				           myFloats[0], myFloats[1]);
		System.out.println("Thank you for giving two floats");
		rI.close(); 
            //you are done with scanner, now you can safely close it.

	}
}
