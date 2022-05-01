package com.Gfg;

// Given an array in random order containing only 0s and 1s, segregate 0s on the left and 1s on the right

public class Segregate0sand1s {

	static int[] segregate(int[] arr, int len) {
		int left = 0, right = len - 1;
		while (left < right) {
			// Increment left while we have 0
			while (arr[left] == 0)
				left++;

			// Decrement left while we have 0
			while (arr[right] == 1)
				right--;

			// If after iterating still left < right means
			// there is 1 at the left and 0 at the right
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		int[] segArr = segregate(arr, arr.length);
		for (int i : segArr)
			System.out.print(i + " ");
	}
}
