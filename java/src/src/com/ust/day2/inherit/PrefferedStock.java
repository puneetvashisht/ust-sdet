package com.ust.day2.inherit;

public class PrefferedStock extends Stock {
	
	int capitalCost;

	public PrefferedStock() {
		super();
	}

	public PrefferedStock(int id, String name, String exchange, double price, double alpha, double beta ,int capitalCost) {
		super(id, name, exchange, price, alpha, beta);
		this.capitalCost = capitalCost;
	}

	public void shareCaptitalCost() {
		System.out.println("Distributing captital cost");
	}

	@Override
	public void buy(int quantity) {
		System.out.println("Buying a preffered stock: " + (quantity * this.price));

	}

	@Override
	public String toString() {
		return "PrefferedStock [id=" + id + ", name=" + name + ", exchange=" + exchange + ", price=" + price + ", alpha="
				+ alpha + ", beta=" + beta + "]";
	}
	
	

}
