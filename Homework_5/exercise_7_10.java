package Homework_5;

import java.util.Scanner;


public class exercise_7_10 {

	public static void main(String[] args) {
		double [] myArray = new double [10];
		
		System.out.println("Enter 10 double values: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < myArray.length; i++) {
		myArray[i] = sc.nextDouble();		
		}
		
		int smallest = indexOfSmallestElement(myArray);
		System.out.println("The index of smallest number in array is: " + smallest);
		
		sc.close();
	}
	public static int indexOfSmallestElement(double[] array) {
		double currentMin=array[0];
		int currentMinIndex = 0;
		
		for (int j = 0; j < array.length - 1; j++) {
			currentMin = array[j];
			currentMinIndex = j;
			
			for (int k = 1; k < array.length; k++) {
				if (currentMin > array[k]) {
					currentMinIndex = k;
				}
			}
			}
		return currentMinIndex;
		
	}
 
}
