package com.core.examples;

public class TwoDimArray {

	public static void main(String[] args) {
		//int[][] array = new int[3][4];
		int[][] twoDArray= {{1,4,9},{56,7,2},{9,76,4},{3,6,42}};
		for(int i=0;i<twoDArray.length;i++) {
			for(int j=0;j<twoDArray[i].length;j++) {
				System.out.println(twoDArray[i][j]);
			}
		}
	}

}
