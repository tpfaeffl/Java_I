package Homework_1;

/*
 * Author: Thomas Pfaeffle
 * 
 * Since only one public class can be written per file in Java, it becomes difficult to manage 
 *writing homework.  You may have to write one class for one problem.
 *
 * Instead, you could write the solution for one problem in one method.  Method is a 
 * construct which allows you to write bulk of code(instructions) as a group.  So, 
 * you could simply write one public class per homework and create multiple methods, one
 * method for one exercise.
 * 
 * You can use the following template.
 * 
 * Later, when you learn Object Oriented Programming, then you can write multiple classes
 * and zip them together when you submit your work.
 *
 */

import java.util.Scanner; //you need this for your reading the input from keyboard
                          //do not worry about "!" icon with warning for now...Stay curious though!

public class Homework_1 {
	// Here you write the complete code for exercise# 1
	public static void exercise_1_0() {
		// For homework#1, this exercise is for you to do at home, there is not submission needed 
		// You could say like this:
		
		System.out.println("I completed all questions and got 90% right in first try");
	}

	// Here you write the complete code for exercise# 2
	public static void exercise_1_1() {
		// For homework#1, this exercise is for you to do at home, there is not submission needed 
		// You could say like this:
		
		System.out.println("My Eclipse is running perfect and I am able to get started with my homework");
	}

	// Here you write the complete code for exercise# 3
	public static void exercise_1_3() {
		System.out.println("  ");
		System.out.println("This is the solution to exercise 1-3");
		System.out.println("      J     A    V     V   A");
		System.out.println("      J    A A    V   V   A A");
		System.out.println("  J   J   AAAAA    V V   AAAAA");
		System.out.println("   J J   A     A    V   A     A");
		
	}

	// Here you write the complete code for exercise# 4
	public static void exercise_1_5() {
		System.out.println("  ");
		System.out.println("This is the solution to exercise 1-5");
		System.out.println("The solution is " + ((9.5*4.5)-(2.5*3))/(45.5-3.5));
		
		final int MAX=45;
		System.out.println("int MaX = 45 is: " + MAX);
		
		double b= 15.0/2;
		System.out.println("double b= 15.0/2 is: " + b);
		
		int c=15/2;
		System.out.println("int c=15/2 is: " + c);
		
		int d=15 % 2;
		System.out.println("int d=15 % 2 is: " + d);
		
		int e= (int)1.7;
		System.out.println("int e=1.7 is: " + e);
		
		System.out.println((int)(24.768*100)/100.0);
		
		System.out.println((int)(24.768*100)/100);
		
	}

	// Here you write the complete code for exercise# 5
	public static void exercise_1_9() {
		double width = 4.5;
		double height = 7.9;
		double area = width * height;
		double perimeter = 2.0 * (height + width);
		System.out.println("  ");
		System.out.println("This is the solution to exercise 1-9");
		System.out.println("The area is: " + area);
		System.out.println("  ");
		System.out.println("The perimeter is: " + perimeter);
		
	}

	// Here you write the complete code for exercise# 6
	public static void exercise_1_11() {
		System.out.println("  ");
		System.out.println("This is the solution to exercise 1-11");
		System.out.println("  ");
		double seconds_in_year = (60.0 * 60.0 * 24.0 * 365.0);
		double new_immigrant = (seconds_in_year / 45.0);
		double one_death = (seconds_in_year / 13.0);
		double one_birth = (seconds_in_year / 7.0);
		double population = 312032486;
		System.out.println("Number of new immigrants/year:  " + new_immigrant + " Number of deaths/year:  " + one_death + " Number of births/year:" + one_birth);
			for(int i=1; i<6; i++) {
				System.out.println("  ");
				System.out.println("This is the population for year: " + i);
				Double new_population = population + new_immigrant + one_birth - one_death;
				
				System.out.println("This is new population for year "  + new_population);
				population = new_population;
				}

		
	}

	
	////more exercises more methods
	
	public static void main(String[] args) {

		// now call these methods
		exercise_1_0(); 
		exercise_1_1(); 
		exercise_1_3(); 
		exercise_1_5(); 
		exercise_1_9(); 
		exercise_1_11(); 

		////add as many as you need
	}
}
