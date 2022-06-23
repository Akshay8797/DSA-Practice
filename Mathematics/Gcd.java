package com.Gfg.Mathematics;

public class Gcd {
	// Optimized Euclidean Algorithm

	static int getGcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return getGcd(y, x % y);
	}

	public static void main(String[] args) {
		System.out.println(getGcd(7, 13));
	}

}
