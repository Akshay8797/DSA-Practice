package com.Gfg.Arrays;

public class Leaders {

	// I/P: {7, 10, 4, 3, 6, 5, 2}
	// O/P: 10, 6, 5, 2

	// An element of an array is a Leader if there is no greater element than it on the RHS.

	public static void main(String[] args) {
		int[] a = { 7, 10, 4, 3, 6, 5, 2 };
		getLeaders(a, a.length);
	}

	private static void getLeaders(int[] a, int n) {
		// Last element will always be leader
		int currMax = a[n-1];
		System.out.print(currMax + " ");
		for (int i = n - 2; i >= 0; i--) {
			if (a[i] > currMax) {
				currMax = a[i];
				System.out.print(currMax + " ");
			}
		}
	}
}
