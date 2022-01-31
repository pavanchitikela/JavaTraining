package com.oops;

public class Restaurant {
	// attributes or global variables
	public int tables=10;
	public int chairs=30;

	//method
	//public - access modifier, float - return type, calaculateBill- name of method,
	// float Bill1, float Bill2 - method arguments or method parameters
	public float calaculateBill(float Bill1,float Bill2) {
		// body
		float TotalBill = Bill1 + Bill2;
		return TotalBill;
	}

}
