package com.Gfg.Recursion;

/* Given int n, WAP to find natural nos. sum till n.
 * I/P: n=2 => O/P: 3
 * I/P: n=4 => O/P:10
 * T(n) = O(n), S(n) = O(n)
 * 
 * Optimal solution would be to use n*(n+1)/2
 */

public class NaturalNoSum {

	public static void main(String[] args) {
		System.out.println(RecursiveNaturalSum(4));
	}

	private static int RecursiveNaturalSum(int n) {
		if (n >= 0) {
			if (n == 0 || n == 1)
				return n;
			return n + RecursiveNaturalSum(n - 1);
		}
		return -1;
	}
}
