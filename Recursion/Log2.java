package com.Gfg.Recursion;

/* Actually returns floor of Log(n) base 2.
 * When n is multiplied by 2 then only result is incremented by 1.
 * Ex. f(16) == f(17) == ... f(20) ... == f(31) 
 */

public class Log2 {

	public static void main(String[] args) {
		System.out.println(calculateLog(4));
	}

	private static int calculateLog(int n) {
		if (n == 1)
			return 1;
		return 1 + calculateLog(n / 2);
	}
}
