package com.Gfg.Arrays;

public class FrequencyInSorted {

	// I/P: {10, 10, 10, 15, 15, 18}
	// O/P: 10:3, 15:2, 18:1

	public static void main(String[] args) {
		int[] a = { 10, 10, 10, 15, 15, 18 };
		getFrequencies(a, a.length);
	}

	private static void getFrequencies(int[] a, int n) {
		int freq = 1, i = 1;
		while (i < n) {
			while (i < n && a[i] == a[i - 1]) {
				freq++;
				i++;
			}
			System.out.println(a[i - 1] + " : " + freq);
			i++;
			freq = 1;
		}
		// If last element is not same as second last
		if (n == 1 || a[n - 1] != a[n - 2])
			System.out.println(a[i - 1] + " : " + 1);
	}
}
