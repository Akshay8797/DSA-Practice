package com.Gfg.BitMagic;

/* Given a String, generate all power sets of the string.
 * I/P: s = "abc"
 * O/P: "", "a", "b", "c", "ab", "ac", "bc", "abc"
 * 
 * Approach: For n chars there are (2^n)-1 elements in the power set.
 * Take a counter var from 0 to (2^n)-1.
 * T(n) = O((2^n)*n).
 */

public class PowerSet {

	public static void main(String[] args) {
		String[] res = GeneratePowerSet("abc");
		for (int i = 0; i < res.length; i++)
			System.out.print(res[i] + " ");
	}

	public static String[] GeneratePowerSet(String s) {
		int n = s.length(), powSize = (int) Math.pow(2, n), counter = 0, j = 0;
		String[] res = new String[powSize];
		for (counter = 0; counter < powSize; counter++) {
			StringBuilder subset = new StringBuilder();
			for (j = 0; j < n; j++) {
				if ((counter & (1 << j)) != 0)
					subset.append(s.charAt(j));
			}
			res[counter] = subset.toString();
		}
		return res;
	}
}
