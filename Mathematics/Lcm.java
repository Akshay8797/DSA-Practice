package com.Gfg.Mathematics;

public class Lcm {
	// a * b = gcd(a, b) * lcm(a, b)

	public static void main(String[] args) {
		System.out.println(getLcm(4, 6));
	}

	// O(log(min(a,b)))
	public static int getLcm(int a, int b) {
		return (a * b) / Gcd.getGcd(a, b);
	}

}
