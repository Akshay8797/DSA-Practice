package com.Gfg.Arrays;

public class EquilibriumPoint {

	/*- A point is called equilibrium point if sum of elements before it and after it are same.
	 * WAP to check if equilibrium point exists in an array.
	 * 
	 * I/p: arr = [3, 4, 8, -9, 20, 6]	=>		O/p: true (20).
	 * I/p: arr = [4, 2, -2]			=>		O/p: true (4).
	 */

	public static void main(String[] args) {
		int[] arr = { 3, 4, 8, -9, 20, 6 };
		System.out.println(equilibriumExists(arr));
	}

	private static boolean equilibriumExists(int[] arr) {
		int n = arr.length, startSum = 0, endSum = 0, i;
		for (i = 1; i < n; i++)
			endSum += arr[i];
		if (endSum == startSum)
			return true;
		for (i = 1; i < n; i++) {
			startSum += arr[i - 1];
			endSum -= arr[i];
			if (endSum == startSum)
				return true;
		}
		return false;
	}
	
}
