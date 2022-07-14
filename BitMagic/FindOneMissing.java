package com.Gfg.BitMagic;

/* Given an array of n nos. that has values in range [1...n+1].
 * Every no. appears exactly once and hence one no. is missing. Find it
 * 
 * I/P: a[] = {1,4,3}
 * O/P: 2
 * 
 * I/P: a[] = {1,5,3,2}
 * O/p: 4
 */

public class FindOneMissing {
	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 2 };
		System.out.println(FindTheOneMissing(a));
	}

	public static int FindTheOneMissing(int[] a) {
		int n = a.length, i, arrayXor = 0, rangeXor = 0;
		for (i = 1; i <= n + 1; i++)
			rangeXor ^= i;
		for (i = 0; i < n; i++)
			arrayXor ^= a[i];
		return rangeXor ^ arrayXor;
	}
}
