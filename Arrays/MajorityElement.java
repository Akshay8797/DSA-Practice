package com.Gfg.Arrays;

public class MajorityElement {

	/*- An element is called majority if it appears more than n/2 times.
	 * I/P: arr[] = {8, 3, 4, 8, 8} => O/P: 0 or 3 or 4 (Any index of 8).
	 * I/P: arr[] = {3, 7, 4, 7, 7, 5} => O/P: -1 (No majority element).
	 * I/P: arr[] = {20, 30, 40, 50, 50, 50, 50} => O/P: 3 or 4 or 5 or 6 (Any index of 50).
	 */

	public static void main(String[] args) {
		int arr[] = { 8, 3, 4, 8, 8 };
		System.out.println(getMajorityIndex(arr, arr.length));
	}

	/*- Boyer-Moore voting algorithm.
	 * Works in two phases: 
	 * 1. Finds a candidate if it exists
	 * 2. Checks if the candidate is the majority 
	 * 		(required only if majority present is not confirmed. may not give the first index),
	 */
	private static int getMajorityIndex(int[] arr, int n) {
		int res = 0, count = 1, i;
		// Find a candidate
		for (i = 1; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;
			if (count == 0) {
				res = i;
				count = 1;
			}
		}
		count = 0;
		// Check if the candidate is actually a major
		for (i = 0; i < n; i++) {
			if (arr[res] == arr[i])
				count++;
		}
		if (count > n / 2)
			return res;
		return -1;
	}
}
