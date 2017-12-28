package Homework_3;

import java.util.Scanner;

public class ValidSsNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter two cities
	    System.out.print("Enter a Social Security Number: ");
		
		String SsNumber = input.nextLine();
		String testSsNumber = SsNumber; 
		
		int intLength = String.valueOf(SsNumber).length();
		System.out.println("The length is : " +  intLength);
		
		
		final int CORRECT_LENGTH = 11;

		
		if (intLength != CORRECT_LENGTH) {
			System.out.println(SsNumber + " is NOT a valid Social Security number. Try again.");
			System.exit(1);
		}
		
		for (int i =0; i < CORRECT_LENGTH; i++) {
			if ((i == 3 || i == 6)  && SsNumber.charAt(i) == '-'){
				continue;
			}
			if (!Character.isDigit(SsNumber.charAt(i) )) {
				System.out.println(SsNumber + " is NOT a valid Social Security number. Try again.");
				System.exit(0);
			}
		}
				
		System.out.println(SsNumber + " IS a valid Social Security number.");		
							

  }
			
}


/*
int j = 1;	
while (valid) {
for (int i = 0; i < CORRECT_LENGTH; i++){
if (i <= 2){
//these must be digits, otherwise return false
if (!Character.isDigit(testSsNumber.charAt(i))){
  System.out.println(testSsNumber + " is NOT a valid Social Security number.");
  valid = false;
  j = 1;
}
}
else if (i == 3 || i == 6){
//these must be dashes, otherwise return false
if (testSsNumber.charAt(i) != '-'){
  System.out.println(testSsNumber + " is NOT a valid Social Security number."); 
  valid = false;
  j = 1;
}
}
else if (i > 6){
//these must be digits, otherwise return false
if (!Character.isDigit(testSsNumber.charAt(i))){
  System.out.println(testSsNumber + " is NOT a valid Social Security number.");
  valid = false;
  j = 1;
}
}
        	 
//	System.out.println(testSsNumber + " IS a valid Social Security number.");
        
}

} //end of while loop
if (j == 1) {
System.out.println(SsNumber + " IS a valid Social Security number.");
}
*/

