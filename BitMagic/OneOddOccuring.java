package com.Gfg.BitMagic;

/* Given an array of ints all nos. occur even no. of times except one.
 * Print that one odd occurring no.
 * 
 * I/P: arr[] = {4, 3, 4, 4, 4, 5, 5}
 * O/P: 3
 * Approach: T(n) = O(n) and S(n) = O(1). Using XOR. 
 * X ^ 0 = X and X ^ X = 0, 
 */

public class OneOddOccuring {

	public static void main(String[] args) {
		int[] a = { 4, 3, 4, 4, 4, 5, 5 };
		System.out.println(GetOneOdd(a));
	}

	public static int GetOneOdd(int[] a) {
		int xorProduct = 0, n = a.length;
		for (int i = 0; i < n; i++)
			xorProduct ^= a[i];
		return xorProduct;
	}
}
