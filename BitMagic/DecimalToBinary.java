package com.Gfg.BitMagic;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(GenerateBinary(10));
	}

	// Assuming 32 bit integer
	@SuppressWarnings("unused")
	private static void GetBinaryWithBitwise(int n) {
		int i = 31, k = 0;
		boolean firstOneFound = false;
		for (; i >= 0; i--) {
			k = n >> i;
			if ((k & 1) > 0) {
				firstOneFound = true;
				System.out.print("1");
			} else if ((k & 1) == 0 && firstOneFound)
				System.out.print("0");
			// 0 found but not printing to format the result.
		}
	}

	private static int GenerateBinary(int n) {
		int num = 0, rem = 0, cnt = 0;
		while (n != 0) {
			rem = n % 2;
			num += rem * Math.pow(10, cnt);
			cnt++;
			n /= 2;
		}
		return num;
	}
}
