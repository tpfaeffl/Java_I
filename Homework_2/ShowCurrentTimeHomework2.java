package Homework_2;

import java.util.Scanner;

public class ShowCurrentTimeHomework2 {
	  public static void main(String[] args) {
		// Define milliseconds in an hour as a constant
		final long MILLISECS_IN_HOUR = 3600000;
		
		// Obtain the  offset from GMT
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for offset: ");
		long offset = input.nextLong();
		
		// Obtain offset in milliseconds
		long newOffsetSeconds = offset * MILLISECS_IN_HOUR;
		System.out.println("new_offset_seconds is: " + newOffsetSeconds);
		  
	    // Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();
	    
	    // Calculate new milliseconds with offset
	    long totalMillisecondsWithOffset = totalMilliseconds + newOffsetSeconds;

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMillisecondsWithOffset / 1000;

	    // Compute the current second in the minute in the hour
	    long new_offset_totalSeconds = totalSeconds + newOffsetSeconds;
	    long currentSecond = new_offset_totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;

	    // Display results
	    System.out.println("Current time is " + currentHour + ":"
	      + currentMinute + ":" + currentSecond);
	  }
	}
