package com.Gfg.BitMagic;

/* Given an array of ints. Every int appear even no. of times except two. Find them.
 * I/P: arr[] = {3,4,3,4,5,4,4,6,7,7}
 * O/P: 5, 6
 * 
 * Approach: Xor of all elements gives Xor of the two odd occurring elements.
 * Take the last set bit in the final Xor (The two nos. should be having this bit different).
 * Based on that bit we divide our input into two groups (Both nos. will be in different groups).
 * T(n): O(n), and S(n): O(1).
 */

public class FindTwoMissing {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
		System.out.println(FindTwoOddOccurring(arr));
	}

	public static int[] FindTwoOddOccurring(int[] arr) {
		int res[] = new int[2], xor = 0, i = 0, n = arr.length, res1 = 0, res2 = 0;
		// n should be minimum 2 as 2 odd appearing elements are there.
		for (; i < n; i++)
			xor ^= arr[i];
		int xorSetBit = xor & ~(xor - 1); // (xor-1): Last set bit is turned off and all bits to the right is turned on.
		for (i = 0; i < n; i++) {
			if ((arr[i] & xorSetBit) != 0)
				res1 ^= arr[i];
			else
				res2 ^= arr[i];
		}
		res[0] = res1;
		res[1] = res2;
		return res;
	}
}
