package com.Gfg.Recursion;

public class NTo1 {

	public static void main(String[] args) {
		// T(n) = O(n) and S(n) = O(n)
		printNTo1(5);
		System.out.println();
		print1ToN(6);
	}

	// Non tail recursive
	private static void print1ToN(int n) {
		if (n == 0)
			return;
		print1ToN(n - 1);
		System.out.print(n + " ");

	}

	// Tail recursive
	private static void printNTo1(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		printNTo1(n - 1);
	}
}
