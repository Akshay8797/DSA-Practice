package com.Gfg.Recursion;

//T(n) = O(d), S(n) = O(d). Where d = no. of digits.
public class SumOfDigits {
	
	public static void main(String[] args) {
		System.out.println(GetDigitsSum(253));
	}

	public static int GetDigitsSum(int n) {
		if (n >= 0) {
			if (n <= 9)
				return n;
			return (n % 10) + GetDigitsSum(n / 10);
		}
		return -1;
	}
}
