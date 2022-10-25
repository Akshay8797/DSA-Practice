package com.Gfg.Arrays;

public class MaxLengthEvenOddSubArray {

	/*-
	 * Given an array. WAP to find the length of the longest subarray
	 * having alternating even-odd elements or vice versa
	 * 
	 * I/P: {10, 12, 14, 7, 8} => O/P: 3
	 * I/P: {7, 10 ,13, 14} => O/P: 4
	 * I/P: {10, 12, 8, 4} => O/P: 1
	 */

	public static void main(String[] args) {
		int[] arr = { 10, 12, 14, 7, 8 };
		System.out.println(getMaximumLengthEvenOddSubArrayEfficient(arr, arr.length));
	}

	// Based on Kadane's algorithm
	private static int getMaximumLengthEvenOddSubArrayEfficient(int[] arr, int n) {
		int res = 1, countEvenOdd = 1, i;
		for (i = 1; i < n; i++) {
			// Checking alternate even-odds
			if ((isEven(arr[i]) && !isEven(arr[i - 1])) || (!isEven(arr[i]) && isEven(arr[i - 1]))) {
				countEvenOdd++;
				res = Integer.max(res, countEvenOdd);
			} else
				// Start a new sub-array
				countEvenOdd = 1;
		}
		return res;
	}

	@SuppressWarnings("unused")
	private static int getMaximumLengthEvenOddSubArrayNaive(int[] arr, int n) {
		int res = 1, countEvenOdd = 0, i = 0, j;
		for (i = 0; i < n; i++) {
			countEvenOdd = 1;
			for (j = i + 1; j < n; j++) {
				// Checking alternate even-odds
				if ((isEven(arr[j]) && !isEven(arr[j - 1])) || (!isEven(arr[j]) && isEven(arr[j - 1])))
					countEvenOdd++;
				else
					break;
			}
			res = Integer.max(res, countEvenOdd);
		}
		return res;
	}

	private static boolean isEven(int a) {
		if (a % 2 == 0)
			return true;
		return false;
	}

}
