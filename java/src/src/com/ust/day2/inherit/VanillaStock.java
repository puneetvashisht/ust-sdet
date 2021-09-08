package com.ust.day2.inherit;

public class VanillaStock extends Stock {
	
	

	public VanillaStock() {
		super();
	}

	public VanillaStock(int id, String name, String exchange, double price, double alpha, double beta) {
		super(id, name, exchange, price, alpha, beta);
	}

	

	@Override
	public void buy(int quantity) {
		System.out.println("Buying stock: " + (quantity * this.price));

	}

	@Override
	public String toString() {
		return "VanillaStock [id=" + id + ", name=" + name + ", exchange=" + exchange + ", price=" + price + ", alpha="
				+ alpha + ", beta=" + beta + "]";
	}
	
	

}
