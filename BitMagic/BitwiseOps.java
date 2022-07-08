package com.Gfg.BitMagic;

public class BitwiseOps {

	public static void main(String[] args) {
		int x = 3, y = 6, z = -2;
		System.out.println(x & y); // And
		System.out.println(x | y); // Or
		System.out.println(x ^ y); // Xor
		System.out.println(~x); // Not
		System.out.println(x << 3); // Left shift
		// In general for small nos. x << n equals x * (2^n).
		System.out.println(x >> 1); // Right shift
		System.out.println(z >> 1);
		// Right shift fills leading bit with 1 for -ve and 0 for +ve nos.
		System.out.println(z >>> 1); //Unsigned right shift
		// Unsigned right shift fills the leading bit with 0 always.
	}

}
