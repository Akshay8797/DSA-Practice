package com.Gfg.Arrays;

public class TrappingWater {

	/*-
	 * Given an array where values in the array represents heights of bars. 
	 * WAP to find the amount (area) of water that can be collected between these. 
	 * Assume each bar has width 1 unit.
	 * 
	 * I/P: arr[] = {2, 0, 2} 		=>  O/P: 2
	 * I/P: arr[] = {3, 0, 1, 2, 5} =>  O/P: 6
	 * If array is sorted in increasing or decreasing order, 0 units can be collected.
	 */

	public static void main(String[] args) {
		int[] bars = { 3, 0, 1, 2, 5 };
		System.out.println(getWaterStoredNaive(bars, bars.length));
		int[] barArr = { 5, 0, 6, 2, 3 };
		System.out.println(getWaterStoredEfficient(barArr, barArr.length));
	}

	/*-
	 * Water cannot be stored on the corner bars.
	 * lMax and rMax represents the bars between which water can be stores.
	 * The amount of water stored between lMax and rMax is min(lMax, rMax)-arr[i].
	 * T(n): O(n^2)
	 */
	private static int getWaterStoredNaive(int[] bars, int n) {
		int res = 0, i, j;
		for (i = 1; i < n - 1; i++) {
			int lMax = bars[i];
			for (j = 0; j < i; j++)
				lMax = Integer.max(lMax, bars[j]);
			int rMax = bars[i];
			for (j = i + 1; j < n; j++)
				rMax = Integer.max(rMax, bars[j]);
			res = res + Integer.min(lMax, rMax) - bars[i];
		}
		return res;
	}

	/*-
	 * lMax and rMax are pre-computed.
	 * arr[]  = {5, 0, 6, 2, 3}
	 * lMax[] = {5, 5, 6, 6, 6}
	 * rMax[] = {6, 6, 6, 3, 3} 
	 * T(n): O(n), S(n): O(n)
	 */
	private static int getWaterStoredEfficient(int[] barArr, int n) {
		int res = 0, i;
		int[] lMax = new int[n], rMax = new int[n];
		lMax[0] = barArr[0];
		for (i = 1; i < n; i++)
			lMax[i] = Integer.max(barArr[i], lMax[i - 1]);
		rMax[n - 1] = barArr[n - 1];
		for (i = n - 2; i >= 0; i--)
			rMax[i] = Integer.max(barArr[i], rMax[i + 1]);
		for (i = 1; i < n - 1; i++)
			res = res + Integer.min(lMax[i], rMax[i]) - barArr[i];
		return res;
	}

}
