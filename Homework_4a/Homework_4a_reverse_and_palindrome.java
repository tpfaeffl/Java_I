package Homework_4a;

/*
 * Reverse program and the isPalindrome program.
 * Author: Thomas Pfaeffle
 * 
 */
import java.util.Scanner;

public class Homework_4a_reverse_and_palindrome {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter an integer number for the reverse:" );
		int number = inputNumber.nextInt();
		
		int[] returned_array = reverse(number);
		
		System.out.print("The reversed number is ");
		for (int i=0; i<=returned_array.length -1; i++) {
			System.out.print(returned_array[i]);			
		}
		System.out.print(" ");
	//	inputNumber.close();
		
	//	Scanner inputNumber_2 = new Scanner(System.in);
		System.out.println("\n\nEnter an integer number for the palindrome: ");
		int number_2 = inputNumber.nextInt();
		boolean isPalindrome_2 = isPalindrome(number_2);
		if (isPalindrome_2) {
						System.out.println(number + " is a palindrome.");
					}
					else {
						System.out.println(number + " is NOT a palindrome.");
				}	
		inputNumber.close();
	}
	
	public static int[] reverse(int number) {
	
	
		int length = String.valueOf(number).length();
		int [] number_array = new int[length];
	//	int [] numbers_reversed = new int [length];
		int i=0;
		
		
		while (number > 0) {
		  int d = number / 10;
		  int k = number - d * 10;
		  number = d;
		  
     	  number_array[i] = k;
	//	  System.out.println("The contents of number_array is: " + number_array[i] + " " + " index is: " + i);
		  i = i +1;	
		  
		}
		return number_array;
		
	}

		public static boolean isPalindrome(int number) {
			
			int length = String.valueOf(number).length();
		//	int[] palindrome = new int[length];
			int[] returned_list = reverse(number);
			//put the number into a array
	//		for (int i=0; i<=length-1; i++) {
	//		}
			
			int low =0;
			int high = length -1;
			boolean isPalindrome = true;
			while (low <= high) {
				if (returned_list[low] != returned_list[high]) {
					isPalindrome =false;
					break;
				}
				low++;
				high--;
			}
			
			return isPalindrome;
			
		}
	

}
