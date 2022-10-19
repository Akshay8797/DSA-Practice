package com.Gfg.Arrays;

public class LeftRotateByD {

	// I/P: a[] = {1,2,3,4,5} , d=2
	// O/P: a[] = {3,4,5,1,2}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] res = leftRotateUsingAux(a, 2);
		for (int i : res)
			System.out.print(i + " ");
	}

	// T(n) = O(n+d) => O(n), S(n) = O(d)
	private static int[] leftRotateUsingAux(int[] a, int d) {
		int n = a.length, index = 0;
		int[] elemBack = new int[d];
		for (int i = 0; i < d; i++)
			elemBack[i] = a[i];
		for (int j = 0; j < n; j++) {
			if (j >= n - d) {
				a[j] = elemBack[index];
				index++;
			} else
				a[j] = a[j + d];
		}
		return a;
	}

	// T(n) = O(d+(n-d)+n) => O(n), S(n) = O(1)
	// Steps: Reverse first d elements, then the remaining elements, then the complete Array.
	@SuppressWarnings("unused")
	private static int[] leftRotateWithoutAux(int[] a, int d) {
		int n = a.length;
		reverse(a, 0, d - 1);
		reverse(a, d, n - 1);
		reverse(a, 0, n - 1);
		return a;
	}

	private static void reverse(int[] a, int low, int high) {
		while (low < high) {
			swap(a, low, high);
			low++;
			high--;
		}
	}

	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
