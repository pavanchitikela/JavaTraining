package com.core.examples;

public class Conditions {

	public static void main(String[] args) {

		// condition
		int num1 = 12;
		int num2 = 12;
		if (num1 == num2) {
			// body
			System.out.println(num1 + " is greater than " + num2);
		} else {
			System.out.println(num1 + " is less than " + num2);
		}
		String name = "Sai";
		if (!name.isEmpty()) {
			// body
			System.out.println("Name is empty..pls give some name");
		} else {
			System.out.println("Name is " + name);
		}
		String str = "ai";
		if (name.contains(str)) {
			// body
			System.out.println(name + " contains " + str);
		} else {
			System.out.println(name + " not contains " + name);
		}
		String name2 = "sai";
		if (name.equalsIgnoreCase(name2)) {
			// body
			System.out.println(name + " equlas " + name2);
		} else {
			System.out.println(name + " not equals " + name2);
		}

		if (!(!name.contains(str)) && !(!name.equalsIgnoreCase(name2))) {
			System.out.println("Both are true");
		}
		if (!name.contains(str) || !name.equalsIgnoreCase(name2)) {
			System.out.println(name);
		}
		int a = 3;
		int b = 10;
		int x;
		if (b % a == 0) {
			x = a + b;
			System.out.println(x);
		} else if (b % a == 1) {
			x = b / a;
			System.out.println(x);
		} else {
			x = a - b;
			System.out.println(x);
		}

	}

}
