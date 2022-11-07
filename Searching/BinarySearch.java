package com.Gfg.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(doBinarySearch(arr, 40));
	}

	private static int doBinarySearch(int[] arr, int x) {
		int low = 0, high = arr.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] > x)
				high = --mid;
			else if (arr[mid] < x)
				low = ++mid;
			else
				return mid;
		}
		return -1;
	}

}
