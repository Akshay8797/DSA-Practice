package com.Gfg.BitMagic;

/* Given a non negative integer. Check if it is a power of 2.
 * Powers of 2 have only one bit set. 
 * Hence, Optimal solution would be to use Brian Kerningam's Algorithm.
 * T(n) = O(1). (since only 1 bit is set).
 */

public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println(CheckPowerOfTwoWithBK(16));
	}

	public static boolean CheckPowerOfTwoWithBK(int n) {
		return (n != 0) && ((n & (n - 1)) == 0);
	}
}
