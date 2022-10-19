package com.Gfg.Arrays;

public class LeftRotateByOne {

	// Left rotation: Anti-clockwise rotation
	// I/P: a[] = {1,2,3,4,5}
	// O/P: a[] = {2,3,4,5,1}

	public static void main(String[] args) {
		int[] a = { 5, 1, 6, 0, 2 };
		int[] res = leftRotate(a);
		for (int i : res)
			System.out.print(i + " ");
	}

	private static int[] leftRotate(int[] a) {
		int n = a.length, firstLoc = a[0];
		for (int i = 1; i < n; i++)
			a[i - 1] = a[i];
		a[n - 1] = firstLoc;
		return a;
	}
}
