package com.greatlearning.stockers;

public class Stock implements Comparable<Stock> {
	private String ticker;
	private double stockPrice;
	boolean isPriceHigherToday;
	
	public Stock(String ticker, double stockPrice, boolean isHigherToday) {
		this.setTicker(ticker);
		this.setStockPrice(stockPrice);
		this.isPriceHigherToday = isHigherToday;
	}

	@Override
	public int compareTo(Stock o) {
		int result = this.getStockPrice() < o.getStockPrice() ? -1 : this.getStockPrice() == o.getStockPrice() ? 0 : 1;
		return result;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
}
