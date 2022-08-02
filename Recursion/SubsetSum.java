package com.Gfg.Recursion;

/* Given a set as an array and a sum. Count subsets of the array with sum equal to given sum.
 * I/P: arr[] = [10, 5, 2, 3, 6] , sum = 8
 * O/P: 2
 * I/P: arr[] = [1, 2, 3] , sum = 4
 * O/P: 1
 * 
 * T(n) = O(2^n)
 */

public class SubsetSum {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15 };
		System.out.println(GetSubsetSumCount(arr, arr.length, 25));
	}

	// Sum is a variable to store the sum required.
	public static int GetSubsetSumCount(int[] arr, int n, int sum) {
		if (n == 0)
			return (sum == 0) ? 1 : 0;
		return GetSubsetSumCount(arr, n - 1, sum) + GetSubsetSumCount(arr, n - 1, sum - arr[n - 1]);
	}

}
