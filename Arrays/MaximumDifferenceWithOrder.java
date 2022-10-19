package com.Gfg.Arrays;

/* Given an int[] , find the maximum value of arr[j] - arr[i]
 * such that j>i
 * I/P: {2, 3, 10, 6, 4, 8, 1}
 * O/P: 8 (for the scenario 10-2)
 */

public class MaximumDifferenceWithOrder {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		System.out.println(maxDiffEfficient(arr, arr.length));
	}

	// O(n^2)
	@SuppressWarnings("unused")
	private static int maxDiffNaive(int[] arr, int n) {
		if (n > 1) {
			int res = arr[1] - arr[0];
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++)
					res = Integer.max(res, arr[j] - arr[i]);
			}
			return res;
		}
		return -1;
	}

	// Each element is considered as J.
	// We store the min element and subtract it from J to see if its the max diff.
	// O(n)
	private static int maxDiffEfficient(int[] arr, int n) {
		if (n > 1) {
			int res = arr[1] - arr[0], minVal = arr[0], j;
			for (j = 1; j < n; j++) {
				res = Integer.max(res, arr[j] - minVal);
				minVal = Integer.min(minVal, arr[j]);
			}
			return res;
		}
		return -1;
	}
}
