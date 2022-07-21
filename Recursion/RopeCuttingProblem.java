package com.Gfg.Recursion;

/* Given a rope of length n. WAP to cut this rope into maximum no. of pieces, such that every piece has length a, b, or c.
 * Optimal solution would be to use Dynamic Programming.
 * 
 * I/P: n=5, a=2, b=5, c=1.
 * O/P: 5 => We make 5 pieces of length 1 each.
 * I/P: n=23, a=12, b=9, c=11.
 * O/P: 2 => We make 2 pieces of lengths 11 and 12.
 * 
 * T(n) = O(3^n)
 */

public class RopeCuttingProblem {

	public static void main(String[] args) {
		System.out.println(GetMaximumPieces(5, 2, 5, 1));
	}

	public static int GetMaximumPieces(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		int res = Integer.max(GetMaximumPieces(n - a, a, b, c),
				Integer.max(GetMaximumPieces(n - b, a, b, c), GetMaximumPieces(n - c, a, b, c)));
		if (res == -1)
			return -1;
		return res + 1;
	}
}
