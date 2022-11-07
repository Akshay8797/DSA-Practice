package com.Gfg.Arrays;

public class MaxAppearingElement {

	/*- Given n ranges in two arrays left[n] and right[n]. 
	 * left[i] and right[i] represents the starting and ending points of a range.
	 * WAP to find the maximum appearing element in all the ranges.
	 * Note: 0 <= left[i] <= right[i] < 100,   and   0 <= i < 10^5
	 * 
	 * I/p: left = [1, 2, 5, 15], right = [5, 8, 7, 18]
	 * O/p: 5
	 * [1, 2, 3, 4, 5], [2, 3, 4, 5, 6, 7, 8], [5, 6, 7], [15, 16, 17, 18] => 5
	 */

	public static void main(String[] args) {
		int left[] = { 1, 2, 5, 15 }, right[] = { 5, 8, 7, 18 };
		System.out.println(getMaxElement(left, right));
	}

	// Using Prefix Sum => T(n) = O(n + 100)
	private static int getMaxElement(int[] left, int[] right) {
		int n = left.length, i, res = 0;
		if (right.length == n) {
			// 101 to avoid check if making 101 as -1
			int[] freq = new int[101];
			// Traverse and mark beginning and ending in freq[]
			for (i = 0; i < n; i++) {
				freq[left[i]]++;
				freq[right[i] + 1]--;
			}
			// Prefix Sum and get max
			for (i = 1; i < 100; i++) {
				freq[i] += freq[i - 1];
				if (freq[i] > freq[res])
					res = i;
			}
			// Return index of max
			return res;
		}
		return -1;
	}

}
