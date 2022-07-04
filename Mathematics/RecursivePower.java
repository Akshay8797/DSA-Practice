package com.Gfg.Mathematics;

public class RecursivePower {

	// if n%2 == 0 => power(x,n) = power(x,n/2) * power(x,n/2).
	// else power(x, n-1) * x.

	public static void main(String[] args) {
		System.out.println(getPowerRecursive(2, 3));
	}

	// SC: O(log n), TC: O(log n)
	public static int getPowerRecursive(int x, int n) {
		if (n == 0)
			return 1;
		int temp = getPowerRecursive(x, n / 2);
		temp *= temp;
		if (n % 2 == 0) {
			return temp;
		} else {
			return temp * x;
		}
	}	

}
