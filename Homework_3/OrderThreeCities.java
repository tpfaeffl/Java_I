package Homework_3;

import java.util.Scanner;

public class OrderThreeCities {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two cities
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();
    System.out.print("Enter the third city: ");
    String city3 = input.nextLine();
    
    // Fords  Mateo San   OK
    if       (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) > 0)
    	System.out.println("The cities in alphabetical order are " +
    	city1 + " " + city2 + " " + city3);
    
    //Fords  San Mateo  OK
    else if  (city1.compareTo(city2) < 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) > 0)  { // 2
        System.out.println("The cities in alphabetical order are " + 
        city1 + " " + city3 + ' ' + city2);}
    
    // Mateo Fords San OK
    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) > 0) {  //3
    	System.out.println("The cities in alphabetical order are " + 
    	        city2 + " " + city1 + ' ' + city3);}
    
    // Mateo San Fords -- OK
    else if (city1.compareTo(city2) < 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) < 0) {  // 4
    	System.out.println("The cities in alphabetical order are " + 
    	        city3 + " " + city1 + ' ' + city2);}
    
    // San Fords Mateo -- OK
    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) <0 ) { // 5
    	System.out.println("The cities in alphabetical order are " + 
    	        city2 + " " + city3 + ' ' + city1);}
    
    // San Mateo Fords  --OK
    else if (city1.compareTo(city2) > 0 && city2.compareTo(city3) > 0 && city3.compareTo(city1) < 0)  { 
        	System.out.println("The cities in alphabetical order are " + 
        	        city3 + " " + city2 + ' ' + city1);}
          		
    	}   	
  }

