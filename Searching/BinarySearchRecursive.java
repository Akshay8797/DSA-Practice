package com.Gfg.Searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(doRecBinarySearch(arr, 20, 0, arr.length - 1));
	}

	// T(n): O(log(n)), S(n): O(log(n)) 
	private static int doRecBinarySearch(int[] arr, int x, int low, int high) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == x)
			return mid;
		else if (arr[mid] > x)
			return doRecBinarySearch(arr, x, low, --mid);
		else
			return doRecBinarySearch(arr, x, ++mid, high);
	}

}
