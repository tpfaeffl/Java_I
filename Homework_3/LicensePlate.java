package Homework_3;

public class LicensePlate {

	public static void main(String[] args) {
		  char letter1 = (char) ((int)(Math.random()*26+65));
		  char letter2 = (char) ((int)(Math.random()*26+65));
		  char letter3 = (char) ((int)(Math.random()*26+65));
		  
		  String string1 = (Character.toString(letter1) + Character.toString(letter2) + Character.toString(letter3));
				  
		
		   
		  int numbers =  (int)(Math.random()*10000);
		  //Zeros padding using format method
		  String sNumbers = String.format("%04d" ,numbers );
		   
		  System.out.println("The license plate number is " + string1 + sNumbers);
		   

	}

}
