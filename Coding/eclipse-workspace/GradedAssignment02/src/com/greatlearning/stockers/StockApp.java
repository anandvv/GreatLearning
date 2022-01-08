package com.greatlearning.stockers;
import java.util.Arrays;

public class StockApp {

	private Stock[] stocks;
	
	public StockApp(int numberOfCompanies) {
		this.setStocks(new Stock[numberOfCompanies]);
	}
	
	public void sortStocksAscending() {
		Arrays.sort(getStocks());
	}
	
	public void displayStocks(boolean ascending) {
		if(ascending) {
			System.out.println("Stock prices in ascending order are :");
			for(Stock stock : this.stocks) {
				System.out.print(stock.getStockPrice() + " ");
			}
		}else {
			System.out.println("Stock prices in descending order are :");
			for(int i=this.stocks.length-1; i>=0; i--) {
				System.out.print(this.stocks[i].getStockPrice() + " ");
			}
		}
	}

	public Stock[] getStocks() {
		return stocks;
	}

	public void setStocks(Stock[] stocks) {
		this.stocks = stocks;
	}
	
	public void displayUpStocks() {
		int count = 0;
		for(Stock stock : this.stocks) {
			if(stock.isPriceHigherToday) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price rose today: " + count);
	}

	public void displayDownStocks() {
		int count = 0;
		for(Stock stock : this.stocks) {
			if(!stock.isPriceHigherToday) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price declined today: " + count);
	}

	public Stock searchStockByPrice(double stockPrice) {
		for(Stock stock: this.stocks) {
			if(stock.getStockPrice() == stockPrice) {
				return stock;
			}
		}
		
		return null;
	}

}
