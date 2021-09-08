package com.ust.day3;

public class Address {
	
	int houseNumber;
	String locality;
	String city;
	String country;
	
	public Address() {
		
	}
	
	public Address(int houseNumber, String locality, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
		this.country = country;
	}



	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + ", country="
				+ country + "]";
	}
	
	

}
