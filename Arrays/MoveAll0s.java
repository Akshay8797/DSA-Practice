package com.Gfg.Arrays;

public class MoveAll0s {

	public static void main(String[] args) {
		int[] a = { 0, 1, 5, 0, 3 };
		int[] res = move0sToEnd(a);
		for (int i : res)
			System.out.print(i + " ");
	}

	private static int[] move0sToEnd(int[] a) {
		int nonZeroes = 0, n = a.length; // nonZeroes represents count of nonZero element and index of 0 (if present)
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				swap(a, i, nonZeroes);
				nonZeroes++;
			}
		}
		return a;
	}

	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
