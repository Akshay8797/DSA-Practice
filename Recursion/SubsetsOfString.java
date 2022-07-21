package com.Gfg.Recursion;

/* Given a String, generate all subsets or subsequences of the given string.
 * Note: For a String of length n, there will be 2^n subsets.
 * Assume all characters in the string are different.
 * 
 * I/P: "AB"   =>  O/P: "", "A", "B", "AB"
 * I/P: "ABC"  =>  O/P: "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 * Approach: Take String curr with initially empty. For each char we can either add it or ignore it, till level of the String length.
 */

public class SubsetsOfString {

	public static void main(String[] args) {
		GenerateSubsets("AB", "", 0);
	}

	public static void GenerateSubsets(String s, String curr, int index) {
		if (index == s.length()) {
			System.out.println(curr);
			return;
		}
		GenerateSubsets(s, curr, index + 1);
		GenerateSubsets(s, curr + s.charAt(index), index + 1);
	}
}
