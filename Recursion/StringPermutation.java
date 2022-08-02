package com.Gfg.Recursion;

/* Given String s, Print all permutations of s.
 * I/P: s = "ABC"
 * O/P: ABC, ACB, BAC, BCA, CAB, CBC
 * 
 * For String of length n, there are n! permutations
 */

public class StringPermutation {

	public static void main(String[] args) {
		GeneratePermutations("ABC", 0);
	}

	public static void GeneratePermutations(String s, int index) {
		if (index == s.length() - 1) {
			System.out.println(s);
			return;
		}
		for (int i = index; i < s.length(); i++) {
			s = SwapChars(s, index, i);
			GeneratePermutations(s, index + 1);
			s = SwapChars(s, i, index);
		}
	}

	public static String SwapChars(String s, int i, int j) {
		StringBuilder swappedStr = new StringBuilder(s);
		char iChar = swappedStr.charAt(i), jChar = swappedStr.charAt(j);
		swappedStr.setCharAt(i, jChar);
		swappedStr.setCharAt(j, iChar);
		return swappedStr.toString();
	}

}
