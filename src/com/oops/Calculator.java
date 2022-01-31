package com.oops;

public class Calculator {
	//global variable
	int globalNumber=10;
	static int add(int number1,int number2){
		int result=number1+number2;
		return result;
	}
	public int callSubtract(int number1,int number2) {
		return substract(number1,number2);
	}
	private int substract(int number1,int number2){
		int result=number1-number2;
		return result;
	}
	int multiply(int number1,int number2){
		//local variable
		int localNumber=90;
		int result=number1*number2;
		return result;
	}
	int divide(int number1,int number2){
		int result=number1/number2;
		return result;
	}
	double multiply(double number1,double number2){
		double result=number1*number2;
		return result;
	}
}
