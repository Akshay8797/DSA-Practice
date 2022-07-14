package com.Gfg.BitMagic;

/* In general for small nos. x << n equals x * (2^n).
 * In general x >> 1 equals x /2.
 * Right shift fills leading bit with 1 for -ve and 0 for +ve nos.
 * Unsigned right shift fills the leading bit with 0 always.
 */

public class BitwiseOps {

	public static void main(String[] args) {
		int x = 3, y = 6, z = -2;
		System.out.println(x & y); // And
		System.out.println(x | y); // Or
		System.out.println(x ^ y); // Xor
		System.out.println(~x); // Not
		System.out.println(x << 3); // Left shift
		System.out.println(x >> 1); // Right shift
		System.out.println(z >> 1);
		System.out.println(z >>> 1); // Unsigned right shift
	}

}
