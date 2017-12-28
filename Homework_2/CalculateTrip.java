package Homework_2;

import java.util.Scanner;

public class CalculateTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  ");
		System.out.println("This is the homework to calculate a trip");
		System.out.println("  ");
		
		System.out.println("Enter the distance you need to drive: ");
		Scanner inputDistance = new Scanner(System.in);
		double distance = inputDistance.nextDouble();
		
		System.out.println("Enter the miles per gallon for your car: ");
		Scanner inputMpg = new Scanner(System.in);
		double mpg = inputMpg.nextDouble();
		
		System.out.println("Enter the price per gallon of gasoline: ");
		Scanner inputGasPrice = new Scanner(System.in);
		double gasPrice = inputGasPrice.nextDouble();
		
		// calculate price of trip
		double priceOfTrip = (distance/mpg) * gasPrice;
		
		double roundedPriceOfTrip = (int)(priceOfTrip * 100)/100.0;
		
		System.out.println("The price of the trip is:" + priceOfTrip + " the rounded price of Trip is: $"+roundedPriceOfTrip );
		
	}

}
