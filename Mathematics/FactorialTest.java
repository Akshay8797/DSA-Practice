package com.Gfg.Mathematics;

public class FactorialTest {

	static long getFactorial(int number) {
		if (number >= 0) {
			long res = 1;
			for (int i = 2; i <= number; i++) {
				res = res * i;
			}
			return res;
		} else
			return -1;
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(13));
	}

}
