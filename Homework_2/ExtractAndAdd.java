package Homework_2;

import java.util.Scanner;

public class ExtractAndAdd {
	public static void main(String[] args){
		
		System.out.print("Enter a three-digit integer: ");
		Scanner  input = new Scanner(System.in);
		int number = input.nextInt();
		int thirdDigit = number % 10;
		number = number/10;
		System.out.println("The third digit is: " + thirdDigit + " the new number is:  " +  number);
	
		int secondDigit = number %10;
		number = number/10;
		System.out.println("The second digit is: " + secondDigit + " the new number is:  " +  number);
		System.out.println("The sum of the three digits is: " +  (thirdDigit + secondDigit +number));
	
	}
}


