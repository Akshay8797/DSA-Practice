package com.Gfg.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 1, 3, 7 };
		int[] reversed = reverseArray(arr);
		for (int i : reversed)
			System.out.print(i + " ");
	}

	private static int[] reverseArray(int[] arr) {
		int n = arr.length, low = 0, high = n - 1, temp;
		while (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		return arr;
	}
}
