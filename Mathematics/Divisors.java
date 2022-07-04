package com.Gfg.Mathematics;

import java.util.ArrayList;
import java.util.List;

public class Divisors {

	public static void main(String[] args) {
		System.out.println(getDivisors(100));
	}

	private static List<Integer> getDivisors(int num) {
		List<Integer> divisors = new ArrayList<>();
		if (num >= 1) {
			divisors.add(1);
			int i = 2;
			for (; i < Math.sqrt(num); i++) {
				if (num % i == 0)
					divisors.add(i);
			}
			for (; i > 1; i--) {
				if (num % i == 0)
					divisors.add(num / i);
			}
			divisors.add(num);
		}
		return divisors;
	}

}
