package com.Gfg.Arrays;

public class DeleteFirstOccurence {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 12, 9, 6 };
		System.out.println(deleteFirst(arr, 5, 12));
	}

	private static int deleteFirst(int[] arr, int n, int x) {
		int i, j;
		for (i = 0; i < n; i++)
			if (arr[i] == x)
				break;
		if (i == n)
			return n;
		for (j = i; j < n - 1; j++)
			arr[j] = arr[j + 1];
		arr[n - 1] = -1; // setting -1 to mark the last element which is moved to previous element
		return n - 1;
	}
}
