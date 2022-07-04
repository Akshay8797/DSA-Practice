package com.Gfg.Mathematics;

public class IterativePower {

	// Every no. can be written as sum of powers of 2.
	// All bits of a no. can be traversed (From LSB to MSB) in O(log n).

	public static void main(String[] args) {
		System.out.println(getPowerIterative(2, 5));
	}

	// SC: O(1), TC: O(log n)
	public static double getPowerIterative(int x, int n) {
		int res = 1;
		while (n > 0) {
			if (n % 2 != 0)
				res *= x;
			x *= x;
			n = n >> 1;
		}
		return res;
	}

}
