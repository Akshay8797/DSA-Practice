package com.Gfg.Mathematics;

import java.util.ArrayList;
import java.util.List;

/* Fundamental theorem of Arithmetic states: 
 * Every Composite no. can be factored uniquely into a product of prime factors.
 * TC: O(Math.sqrt(n))
*/

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println(getPrimeFractors(21));
	}

	private static List<Integer> getPrimeFractors(int n) {
		List<Integer> factors = new ArrayList<>();
		if (n > 1) {
			while (n % 2 == 0) {
				factors.add(2);
				n /= 2;
			}
			while (n % 3 == 0) {
				factors.add(3);
				n /= 3;
			}
			int i = 5;
			while (i <= Math.sqrt(n)) {
				if (n % i == 0) {
					n /= i;
					factors.add(i);
				} else if (n % i + 2 == 0) {
					n /= i + 2;
					factors.add(i + 2);
				} else
					i += 6;
			}
			if (n > 3)
				factors.add(n);
		}
		return factors;
	}

}
