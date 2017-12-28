package Homework_4a;

/*
 * 
 * Exercise 6-6. 
 * Author: Thomas Pfaeffle
 * The solution is hokey, but it works (?) 

 *
 * 
 */

import java.util.Scanner;

public class Homework_4a_6_6 {

	public static void main(String[] args) {
		System.out.println("Enter a number to display a pattern: ");
		Scanner inputNumber = new Scanner(System.in);
		int number = inputNumber.nextInt();
		displayPattern(number);
		inputNumber.close();

	}

	public static void displayPattern(int n) {
		int iteration = n+1;
	//	System.out.println("iteration is: " +  iteration );
		int [] array = new int [iteration];
		int length = array.length;
		System.out.println("array length = " + length);
		array[iteration-1]= (iteration -1);
	//	System.out.println(array[iteration-1]);
		array[0]=iteration;
		int k = 1;
	while (k <= iteration-1){
		System.out.print(" ");
		k=k+1;
		
	}
		int i = 1;
	while (iteration-1 >= i)  {	
			array[iteration-i-1] = i; 
			i= i+1;
		}
	// System.out.println("The series at line 5 is: ");
	for (int j=0; j< iteration -1; j++) {		
		System.out.print(array[j]);	
		}
		
	}
}
