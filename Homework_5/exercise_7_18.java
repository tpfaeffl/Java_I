package Homework_5;

import java.util.Scanner;

public class exercise_7_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double [] myArray = new double [5];
		
		System.out.println("Enter 5 double numbers: ");
		for (int i=0; i< myArray.length; i++) {
			myArray[i] = sc.nextDouble();
		}
		
		sortArray(myArray);
		
		System.out.println("The array after sort is:");
		  for (int i = 0; i < myArray.length; i++) {
		   System.out.println(myArray[i]);
		  }
		  sc.close();
	}
		public static void sortArray(double[] array) {
			
	//		for (int j = 0; j < array.length -1; j++) {			
				for (int i = 0; i< array.length -1; i++) {
					if (array[i] > array[i+1]) {
						double temp = array[i];
						array[i] = array[i+1];
						array[i+1] = temp;					
					}
				}
			
		//	}
		}			
	}


