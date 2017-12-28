package Homework_3;

import java.util.Scanner;

public class Keypad {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("This is the homework to get the number related to a letter on the telephone keypad. ");
		System.out.println(" ");
		// Ask the user for a letter
		
		System.out.println("Enter a letter between A and Z: ");
		Scanner inputLetter = new Scanner(System.in);
		String stringLetter = inputLetter.next();

		char charLetter = stringLetter.charAt(0);
		char upper_char = Character.toUpperCase(charLetter);
	//	if ('A' <= upper_char <= 'C') {  why is this syntax not accepted?
		if (upper_char >= 'A' && upper_char  <= 'C') { 
			System.out.println("The letter "  + upper_char + " corresponds to number 2" );}
		
		else if (upper_char >= 'D' && upper_char  <= 'F') { 
			System.out.println("The letter "  + upper_char + " corresponds to number 3" );}
		
		else if (upper_char >= 'G' && upper_char  <= 'I') {
			System.out.println("The letter "  + upper_char + " corresponds to number 4" );}
		
		else if (upper_char >= 'J' && upper_char  <= 'L') {
			System.out.println("The letter "  + upper_char + " corresponds to number 5" );}
		
		else if (upper_char >= 'M' && upper_char  <= 'O') {
			System.out.println("The letter "  + upper_char + " corresponds to number 6" );}
		
		else if (upper_char >= 'P' && upper_char  <= 'S') {
			System.out.println("The letter "  + upper_char + " corresponds to number 7" );}
		
		else if (upper_char >= 'T' && upper_char  <= 'V') {
			System.out.println("The letter "  + upper_char + " corresponds to number 8" );}
		
		else if (upper_char >= 'W' && upper_char  <= 'Z') {
			System.out.println("The letter "  + upper_char + " corresponds to number 9" );}
		
		}

}
