package com.Gfg.Mathematics;

public class TrailingZeros {

	// Zeroes are generated if prime factors have 2 and 5
	// Factorial have 5s less than 2s. Time Complexity: O(log n)

	static int CountTrailingZeroes(int number) {
		int count = 0, i = 0;
		for (i = 5; i <= number; i *= 5) {
			count += number / i;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(CountTrailingZeroes(251));
	}

}
