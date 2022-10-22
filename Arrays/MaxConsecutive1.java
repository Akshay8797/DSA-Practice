package com.Gfg.Arrays;

public class MaxConsecutive1 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 0, 1 };
		System.out.println(getMaximumConsecutive1s(arr, arr.length));
	}

	private static int getMaximumConsecutive1s(int[] arr, int n) {
		int ones = 0, count = 0, i;
		for (i = 0; i < n; i++) {
			if (arr[i] == 0)
				count = 0;
			else {
				count++;
				ones = Integer.max(ones, count);
			}
		}
		return ones;
	}

}
