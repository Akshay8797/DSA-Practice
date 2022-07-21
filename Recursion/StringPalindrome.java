package com.Gfg.Recursion;

// T(n) = O(n), S(n) = O(n)
public class StringPalindrome {
	
	public static void main(String[] args) {
		String input = "abbcbba";
		int start = 0, end = input.length() - 1;
		System.out.println(IsStringPalindrome(input, start, end));
	}

	public static boolean IsStringPalindrome(String str, int start, int end) {
		if (start >= end)
			return true;
		return (str.charAt(start) == str.charAt(end)) && IsStringPalindrome(str, ++start, --end);
	}
}