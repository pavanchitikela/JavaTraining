package com.oops;

public class Car {
	String brand;
	int price;
	int yearOfRelease;
	
	public Car(String brand,int price,int yearOfRelease) {
		this.brand=brand;
		this.price=price;
		this.yearOfRelease=yearOfRelease;
	}
	
	public void drive() {
		System.out.println("Driving "+brand+" car");
	}
}
