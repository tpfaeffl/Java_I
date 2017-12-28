package Homework_4a;

/*
 * Given milliseconds, returns hh:mm:ss.
 * 
 * Author: Thomas Pfaeffle
 * 
 */
import java.util.Scanner;

public class Homework_4a_6_25 {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("Enter number of milliseconds you wnat to convert to hours:minutes:seconds");
		long milliseconds = inputNumber.nextLong();
		String mill = convertMillis(milliseconds);
		System.out.println("The number of milliseconds entered: " + milliseconds + " is equal to hh:mm:ss: " + mill);
		inputNumber.close();
	}
	
	public static String convertMillis(long millis) {
		// Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = millis / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;
		
	  //  long s = millis % 6000;
	  //  long m = (millis / 6000) % 6000;
	  //  long h = (millis / (6000 * 6000)) % 24;
	    return String.format("%d:%02d:%02d", currentHour,currentMinute,currentSecond);
		
		
	}

}
