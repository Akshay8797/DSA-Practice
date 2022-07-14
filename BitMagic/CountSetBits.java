package com.Gfg.BitMagic;

/* Given a non negative integer. Count the no. of set bits in binary representation.
 * Input:5 => 0...0101 => Output:2
 * Input:7 => 0...0111 => Output:3
 * 
 * Brian Kerningam's Algorithm:
 * When subtracting 1 from n all 0s after the last set bit from the left becomes 1.
 * The last set bit becomes 0. Hence, in every iteration we turn off the last set bit.
 * T(n) = O(Set Bit Count).
 * 
 * Lookup Table Method:
 * Assuming 32 bit input initialize array containing no. of set bits from 0 to 255.
 * The for input n check in chunks of 8 (Each chunk can have at most value of 255).  
 * 0xff: 0...11111111
 * T(n) = O(1).
 */

public class CountSetBits {

	public static void main(String[] args) {
		System.out.println(CountSetBitsUsingBrianKerningamAlgo(5));
		System.out.println(CountSetBitsUsingLookupTable(7));
	}

	public static int CountSetBitsUsingBrianKerningamAlgo(int n) {
		int res = 0;
		while (n > 0) {
			n = n & (n - 1);
			res++;
		}
		return res;
	}

	public static int CountSetBitsUsingLookupTable(int n) {
		int[] table = new int[256];
		initializeLookupTill255(table);
		// Going till 4 only considering 32 bit n. for 64 bit n, should do 8 times.
		int res = table[n & 0xff];
		for (int i = 0; i < 3; i++) {
			n >>= 8;
			res += table[n & 0xff];
		}
		return res;
	}

	public static void initializeLookupTill255(int[] table) {
		for (int i = 1; i < 256; i++) {
			table[i] = (i & 1) + table[i / 2];
		}
	}
}
