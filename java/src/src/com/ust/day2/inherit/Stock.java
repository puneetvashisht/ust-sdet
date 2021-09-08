package com.ust.day2.inherit;

public abstract class Stock implements FinancialInstrument{
	
	int id;
	String name;
	String exchange;
	double price;
	double alpha;
	double beta;
	
	@Override
	public void sell(int quantity) {
		System.out.println("Selling stock: " + (quantity * this.price));

	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}
	public double getBeta() {
		return beta;
	}
	public void setBeta(double beta) {
		this.beta = beta;
	}
	public Stock(int id, String name, String exchange, double price, double alpha, double beta) {
		super();
		this.id = id;
		this.name = name;
		this.exchange = exchange;
		this.price = price;
		this.alpha = alpha;
		this.beta = beta;
	}
	
	public Stock() {
		
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", exchange=" + exchange + ", price=" + price + ", alpha=" + alpha
				+ ", beta=" + beta + "]";
	}
	
	
	
	
	
//	Broker [] brokers;
	
	
	
}
