package Homework_5;

import java.util.Scanner;

public class exercise_7_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter list 1: ");
		int[] list1 = new int[sc.nextInt()];
		for (int i = 0; i< list1.length; i++) {
			list1[i] = sc.nextInt();
		}
		
		System.out.print("Enter list 2: ");
		int[] list2 = new int[sc.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = sc.nextInt();
		}
		
		int[] list3 = merge(list1, list2);
		
		System.out.println("The merged list is" );
		for (int i=0; i < list3.length; i++) {
			System.out.print(list3[i] + " " );
		}
		sc.close();
	}
	
	public static int [] merge(int[] list1, int[] list2) {
		int [] list3 = new int [list1.length + list2.length];
		
		int j = 0, k=0;
		for (int i=0; i < list3.length; i++ ) {
			if (k < list2.length && list1[j] > list2[k]) {
				list3[i] = list2[k];
				k++;				
			} else if (j < list1.length) {
				list3[i] = list1[j];
				j++;
			}
		}
		return list3;
	}

}
