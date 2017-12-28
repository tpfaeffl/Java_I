package Homework_4a;

import java.util.Scanner;

public class Reverse {

	public static int[] main(String[] args) {
		
		System.out.println("Enter an integer number:" );
		Scanner inputNumber = new Scanner(System.in);
		
		int number = inputNumber.nextInt();
		int length = String.valueOf(number).length();
		int [] number_array = new int[length];
		int [] numbers_reversed = new int [length];
		int i=0;
		
		
		while (number > 0) {
		  int d = number / 10;
		  int k = number - d * 10;
		  number = d;
		  
     	  number_array[i] = k;
		  System.out.println("The contents of number_array is: " + number_array[i] + " " + " index is: " + i);
		  i = i +1;	
		  
		}
		return number_array;		
//		for (int j =0; j==length-1; j++) {
//			//numbers_reversed[j] = number_array[length-1-j];
//			System.out.print("The contents of numbers is: " + number_array[j] + " ");

	}
	
	}


