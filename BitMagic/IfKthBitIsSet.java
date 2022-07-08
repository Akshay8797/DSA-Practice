package com.Gfg.BitMagic;

public class IfKthBitIsSet {

	// Check if kth bit is set or not
	// Ex: n = 5, k = 3
	// 000...101 => Yes

	public static void main(String[] args) {
		System.out.println(IfkthBitIsSetWithLeftShift(5, 3));
		System.out.println(IfkthBitIsSetWithRightShift(13, 3));
	}

	public static boolean IfkthBitIsSetWithLeftShift(int n, int k) {
		if ((n & (1 << (k - 1))) != 0)
			return true;
		else
			return false;
	}

	public static boolean IfkthBitIsSetWithRightShift(int n, int k) {
		if (((n >> (k - 1)) & 1) != 0)
			return true;
		else
			return false;
	}

}
