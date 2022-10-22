package com.Gfg.Arrays;

public class MaxSubArraySum {

	/*- I/P: arr[] = { 2, 3, -8, 7, -1, 2, 3 }
	 *  O/P: 11 => 7-1+2+3
	 */

	public static void main(String[] args) {
		int[] sub = { -3, 8, -2, 4, -5, 6 };
		System.out.println(getMaximumSubarraySumEfficient(sub, sub.length));
	}

	// Find sum for each sub-array and store maximum sum.
	@SuppressWarnings("unused")
	private static int getMaximumSubarraySumNaive(int[] arr, int n) {
		int res = arr[0], currSum, i, j;
		for (i = 0; i < n; i++) {
			currSum = 0;
			for (j = i; j < n; j++) {
				currSum += arr[j];
				res = Integer.max(currSum, res);
			}
		}
		return res;
	}

	// Maximum sum of sub-array ending with previous element is used.
	// Result is updated if the current element needs to be considered.
	private static int getMaximumSubarraySumEfficient(int[] arr, int n) {
		int res = arr[0], maxEnding = arr[0], i;
		for (i = 1; i < n; i++) {
			maxEnding = Integer.max(maxEnding + arr[i], arr[i]);
			res = Integer.max(res, maxEnding);
		}
		return res;
	}

}
