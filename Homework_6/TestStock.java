package Homework_6;

public class TestStock {

	public static void main(String[] args) {
		Stock myStock = new Stock("ORCL", "Oracle");
		myStock.setCurrentPrice(36.56);
		myStock.setPreviousClosingPrice(34.50);
		System.out.println("Previous closing price: " + myStock.getPreviousClosingPrice());
		System.out.println("Current Price: " + myStock.getCurrentPrice());
		System.out.printf("Price Change:  %.2f%-1s", myStock.getChangePercent(),"%");
		
	}

}
