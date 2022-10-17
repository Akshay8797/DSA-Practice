package com.Gfg.Arrays;

public class RemoveDupsFromSorted {

	public static void main(String[] args) {
		int[] a = { 3, 5, 5, 7, 8, 8 };
		System.out.println(getSizeWithoutDups(a, a.length));
	}

	private static int getSizeWithoutDups(int[] a, int n) {
		if (n > 0) {
			int resSize = 1;
			for (int i = 0; i < (n - 1); i++) {
				if (a[i] != a[resSize - 1]) {
					a[resSize] = a[i];
					resSize++;
				}
			}
			return resSize;
		}
		return 0;
	}

}
