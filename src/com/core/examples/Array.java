package com.core.examples;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		// array
		// declaration
//		int[] numbersArray = new int[4];
//		// initialization
//		numbersArray = new int[4];
//		int numbersArray1[] = { 45, 65, 85, 95 };
		String numbersArray2[] = new String[3];
//		// adding values in array
//		numbersArray[0] = 10;
//		numbersArray[1] = 20;
//		numbersArray[2] = 30;
//		numbersArray[3] = 40;
//		System.out.println(numbersArray);
//		System.out.println(numbersArray1);
//		for (int i = 0; i < numbersArray1.length; i++) {
//			System.out.println(numbersArray1[i]);
//		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numbersArray2.length; i++) {
			String value=sc.nextLine();
			numbersArray2[i]=value;
		}
//		for (int i = 0; i < numbersArray2.length; i++) {
//			System.out.println(numbersArray2[i]);
//		}
//		int x=0;
//		while(x<4) {
//			System.out.println("in while loop");
//			x++;
//		}
		int y=0;
		while(y < numbersArray2.length) {
			System.out.println(numbersArray2[y]);
			y++;
			break;
		}
		int z=4;
		do{
			int k=z+5;
			System.out.println(k);
			z++;
			continue;
		}while(z<6);
		
}
}
