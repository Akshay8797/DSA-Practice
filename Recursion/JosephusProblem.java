package com.Gfg.Recursion;

/* There are n peoples in a circle. We need to kill kth person in every iteration in a circular manner.
 * Find the position of the last survivor.
 * 
 * I/P: n=7, k=3
 * O/P: 3
 * 
 * I/P: n=4, k=2
 * O/P: 0
 * 
 * T(n): O(n)
 * Note: If positions in the circle begins from 1 instead of 0. Add 1 to the main call.
 */

public class JosephusProblem {

	public static void main(String[] args) {
		System.out.println(KillKthCircularly(7, 3));
	}

	public static int KillKthCircularly(int n, int k) {
		if (n == 1)
			return 0;
		return (KillKthCircularly(n - 1, k) + k) % n;
	}

}
