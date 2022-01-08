package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.stockers.*;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of companies");
		int numberOfCompanies = sc.nextInt();
		
		StockApp stockApp = new StockApp(numberOfCompanies);
		Stock[] stocks = stockApp.getStocks();
		
		for(int i=0; i<numberOfCompanies; i++) {
			System.out.println("Enter stock ticker for company " + (i+1));
			String ticker = sc.next();
			System.out.println("Enter current stock price of the company " + (i+1));
			double stockPrice = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compared to yesterday?");
			boolean isPriceHigherToday = sc.nextBoolean();
			stocks[i] = new Stock(ticker, stockPrice, isPriceHigherToday);
		}
		
		//set the stock prices
		stockApp.setStocks(stocks);
		stockApp.sortStocksAscending();
		
		while(true) {
			displayOperations();
			int operation = sc.nextInt();
			switch(operation) {
			case 1:
				stockApp.sortStocksAscending();
				stockApp.displayStocks(true);
				continue;
			case 2:
				stockApp.displayStocks(false);
				continue;
			case 3: 
				stockApp.displayUpStocks();
				continue;
			case 4:
				stockApp.displayDownStocks();
				continue;
			case 5:
				System.out.println("Enter a key value (stock price):");
				double stockPrice = sc.nextDouble();
				
				if (null != stockApp.searchStockByPrice(stockPrice)) {
					System.out.println("Stock of value " + stockPrice + " is present");
				}
			case 6:
				sc.close();
				System.exit(1);
				break;
				
			}
		}
	}

	private static void displayOperations() {
		// TODO Auto-generated method stub
		System.out.println("\n\n-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------\n");
	}
}
