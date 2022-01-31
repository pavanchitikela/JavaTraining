package com.core.examples;

public class SwitchCases {

	public static void main(String[] args) {
		String firstLetter = "tu";
		String day = "";
		switch (firstLetter) {
		case ("M"):
			day = "Monday";
			break;
		case ("Tu"):
			day = "Tuesday";
			break;
		case ("W"):
			day = "Wednesday";
			break;
		case ("Th"):
			day = "Thursday";
			break;
		case ("F"):
			day = "Friday";
			break;
		case ("Sa"):
			day = "Saturday";
			break;
		case ("Su"):
			day = "Sunday";
			break;
		default:
			day = "wrong day";
		}
		System.out.println(" day is " + day);
	}

}
