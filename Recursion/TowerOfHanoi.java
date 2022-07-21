package com.Gfg.Recursion;

/* Given three towers: A, B, and C.
 * WAP to move discs from Tower A to C, using B as auxiliary tower.
 * Rules: 1. Only one disc moves at a time.
 * 2. No bigger disc should be above smaller one.
 * 3. Only the top disc of a tower can be moved.
 */

public class TowerOfHanoi {

	public static void main(String[] args) {
		MoveDiscsToTower(2, 'A', 'B', 'C');
	}

	public static void MoveDiscsToTower(int n, char a, char b, char c) {
		if (n == 1) {
			System.out.println("Move disc 1 from " + a + " to " + c);
			return;
		}
		MoveDiscsToTower(n - 1, a, c, b);
		System.out.println("Move disc " + n + " from " + a + " to " + c);
		MoveDiscsToTower(n - 1, b, a, c);
	}
}
