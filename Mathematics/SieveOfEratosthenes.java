package com.Gfg.Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenes {

/* Divisors always occur in pairs. 
 * Find prime nos. less than or equal to given no. 
 * T(n) = O(n(log(log(n))))
 * 
 * Note: Last loop can be merged to 1st for changing to i <= n.
 * 		 Since inner loop will execute Sqrt(num) times only.
 */

	public static void main(String[] args) {
		System.out.println(getLessOrEqualPrimes(23));
	}

	private static List<Integer> getLessOrEqualPrimes(int num) {
		List<Integer> primesList = new ArrayList<>();
		boolean[] primeArr = new boolean[num + 1];
		Arrays.fill(primeArr, true);
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (primeArr[i])
				for (int j = i * i; j <= num; j += i)
					primeArr[j] = false;
		}
		for (int i = 2; i <= num; i++) {
			if (primeArr[i])
				primesList.add(i);
		}
		return primesList;
	}

}
