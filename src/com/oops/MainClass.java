package com.oops;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Addition of 2 numbers is "+Calculator.add(25, 35));
		System.out.println("Addition of 2 numbers is "+Calculator.add(25, 35));
		System.out.println("Substraction of 2 numbers is "+cal.callSubtract(70, 60));
		System.out.println("Multiplication of 2 numbers is "+cal.multiply(5, 6));
		System.out.println("Division of 2 numbers is "+cal.divide(55, 5));
		int result=cal.divide(cal.divide(55, 5), 5);
		System.out.println("Addition of 2 numbers is "+Calculator.add(2, 35));
		System.out.println(result);
		System.out.println(cal.multiply(34, 10));
	}

}
