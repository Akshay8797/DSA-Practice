package com.Gfg.Arrays;

public class WindowSliding {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 30, -5, 20, 7 };
		System.out.println(maxSumWindowSliding(arr, 3));
		int[] a = { 1, 4, 20, 3, 10, 5 };
		System.out.println(checkSubArrayWithSum(a, 33));
	}

	/*- Given an int array and an int k.
	 * Find the maximum sum of k consecutive elements.
	 * T(n): O(n).
	 */
	private static int maxSumWindowSliding(int[] arr, int k) {
		int currSum = 0, i;
		for (i = 0; i < k; i++)
			currSum += arr[i];
		int maxSum = currSum;
		for (i = k; i < arr.length; i++) {
			currSum += arr[i] - arr[i - k];
			maxSum = Integer.max(currSum, maxSum);
		}
		return maxSum;
	}

	/*- Given a non-negative int array.
	 * Find if there is a sub-array with the given sum.
	 * Note: Works only when array has non negative integers.
	 * T(n): O(n) => Every item of the array goes at most once in and out of the window.
	 */
	private static boolean checkSubArrayWithSum(int[] a, int sum) {
		int start = 0, curr = 0;
		for (int end = 0; end < a.length; end++) {
			curr += a[end];
			while (sum < curr) {
				curr -= a[start];
				start++;
			}
			if (curr == sum)
				return true;
		}
		return false;
	}

}
