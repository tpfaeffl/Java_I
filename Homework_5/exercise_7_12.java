package Homework_5;

import java.util.InputMismatchException;
import java.lang.IllegalStateException;
import java.util.Scanner;

public class exercise_7_12 {
	public static void main(String[] args) {
		
		Scanner inputNumber = new Scanner(System.in);
		int [] number = new int[10];
		System.out.println("Enter 10 integer numbers to reverse:" );
		
		
		try {
		
		for (int i=0; i< number.length; i++) {
		number[i] = inputNumber.nextInt();
		}
		} catch (final InputMismatchException e) {
			System.out.println("You did not enter integers. Try again.\n\n");
			inputNumber.nextLine();
		} catch (final IllegalStateException e) {
			System.out.println("You did not enter two floats. Try again.\n\n");
			inputNumber.nextLine();
		
		}   
		
		
		if (number.length != 10) {
			System.out.println("You must enter10 integers. Try again");
			System.exit(1);
		
		}
		System.out.print("The original array is: ");
		for (int i=0; i<=number.length -1; i++) {
			System.out.print(number[i]);			
		}
		
		
		System.out.println(" ");
		
		
		int[] returned_array = reverse(number);
		
		System.out.print("The reversed array is ");
		for (int i=0; i<=returned_array.length -1; i++) {
			System.out.print(returned_array[i]);			
		}
		System.out.print(" ");
		
		inputNumber.close();
		}
	
	public static int[] reverse(int [] number) {
		
		int temp;
		
		for (int i = 0, j = number.length -1; i < number.length/2; i++, j--) {
			temp = number[j];
			number[j] = number[i];
			number[i] = temp;
		}
		return number;
		
//	
		
	}

}
