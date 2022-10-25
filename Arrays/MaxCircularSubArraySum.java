package com.Gfg.Arrays;

public class MaxCircularSubArraySum {

	/*-
	 * Circular sub-array includes all the normal sub-arrays and
	 * the sub-arrays formed by connecting the last element back to the first.
	 * 
	 * I/P: {5, -2, 3, 4} => O/P: 12
	 * I/P: {8, -4, 3, -5, 4} => O/P: 12
	 * I/P: {3, -4, 5, 6, -8, 7} => O/P: 17
	 */

	public static void main(String[] args) {
		int[] arr = { -3, 8, -2, 4, -7, 6 };
		System.out.println(getMaximumCircularSumEfficient(arr, arr.length));
	}

	// Consider every array element as beginning element and find maximum sum for
	// every element
	@SuppressWarnings("unused")
	private static int getMaximumCircularSumNaive(int[] arr, int n) {
		int res = arr[0], i, j;
		for (i = 0; i < n; i++) {
			int currMax = arr[i];
			int currSum = arr[i];
			for (j = 1; j < n; j++) {
				int index = (i + j) % n;
				currSum += arr[index];
				currMax = Integer.max(currMax, currSum);
			}
			res = Integer.max(res, currMax);
		}
		return res;
	}

	/*- Maximum of:
	 * Maximum Normal sub-array sum => Kadane's algorithm
	 * Maximum Circular sub-array sum => Sum of the array - minimum sub-array sum (using Kadane's algorithm)
	 */
	private static int getMaximumCircularSumEfficient(int[] arr, int n) {
		if (n > 0) {
			int maxSubArraySum = getMaximumSubArraySum(arr, n);
			/*- If max sub-array sum is -ve then only 1 element should have been taken in the sub-array
			 * logic breaks for -ve if removed
			 */
			if (maxSubArraySum < 0)
				return maxSubArraySum;

			// Calculating circular sum
			int arrSum = 0;
			for (int i = 0; i < n; i++) {
				arrSum += arr[i]; // complete array sum
				arr[i] = -arr[i]; // Invert array elements
			}
			// array sum - minimum sub-array sum
			int maxCircularSubArraySum = arrSum + getMaximumSubArraySum(arr, n);
			return Integer.max(maxSubArraySum, maxCircularSubArraySum);
		}
		return -1;
	}

	private static int getMaximumSubArraySum(int[] arr, int n) {
		int res = arr[0], maxEnd = arr[0], i;
		for (i = 0; i < n; i++) {
			maxEnd = Integer.max(maxEnd + arr[i], arr[i]);
			res = Integer.max(maxEnd, res);
		}
		return res;
	}

}
