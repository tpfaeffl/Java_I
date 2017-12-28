package Homework_5;

import java.util.Scanner;

public class exercise_7_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		
		int n = sc.nextInt();
		double [] scores = new double[n];
		String [] names = new String[n];
		
		System.out.println("Enter student names and score: ");
		
		for (int i = 0; i < scores.length; i++) {
			names[i] = sc.next();
			scores[i] = sc.nextDouble();
		}
		
		selectionSort(scores, names);
		
		System.out.println("Student names and scores in decreasing order: ");
		// using i-- because we want highest to lowest order
		for (int i = names.length - 1; i>=0; i--) {
			System.out.println(names[i] + ":\t" + scores[i]);
		}
		sc.close();

	}
	
	public static void selectionSort(double [] list, String[] names) {
		// this puts the list in lowest to highest order
		for (int i =0; i <= list.length -1; i++) {
			// find the minimum in the list[i...list.length]
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j =i+1; j < list.length; j++) {
				// replace currentMin with list[j] if currentMin is greater than list[j]
				// record the currentMinIndex
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			// swap list[i] with list[CurrentMinIndex] if necessary 
			if (currentMinIndex != 1) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				// swap names
				String temp = names[currentMinIndex];
				names[currentMinIndex] = names[i];
				names[i] = temp;
			}
		}
	}

}
