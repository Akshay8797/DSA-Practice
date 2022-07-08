package com.Gfg.SdeChallenge;

import java.util.Arrays;

/*
 * Thief lives in a liner land where everything exists on a single-dimensional axis.
 * There are n police stations in the city. ith one being at x[i].
 * Geek lives at a coordinate a. Distance between Geek and ith police station is |a-x[i]|.
 * Thief wants to choose two distinct police stations such that,
 * The sum of the distance b/w the 1st PC and his house, and 2nd PC and his house is the maximum possible.
 * More formally return the maximum value of |a-x[i]|+|a-x[j]|, for distinct i and j.
 * 
 * Input: n=2, a=1, x={4,5}.
 * Output: 7
 * Explanation: Only way is to choose 4 and 5. |4-1|+|5-1| = 7.
 * 
 * Input: n=4, a=2, x={10,4,2,17}.
 * Output: 23
 * Explanation: Optimal way is to choose 10 and 17. |10-2|+|17-2| = 23.
 */

public class PoliceStation {

	public static void main(String[] args) {
		int[] x = { 10, 4, 2, 17 };
		System.out.println(getPoliceStation(4, 2, x));
	}

	public static int getPoliceStation(int n, int a, int[] x) {
		if (n == 2)
			return Math.abs(a - x[0]) + Math.abs(a - x[1]);
		Arrays.sort(x);
		int[] coordinates;
		if (n >= 4)
			coordinates = new int[] { x[0], x[1], x[n - 1], x[n - 2] };
		else
			coordinates = x;
		int maxVal = 0, distance = 0;
		for (int i = 0; i < coordinates.length; i++) {
			for (int j = i + 1; j < coordinates.length; j++) {
				distance = Math.abs(a - coordinates[i]) + Math.abs(a - coordinates[j]);
				if (distance > maxVal)
					maxVal = distance;
			}
		}
		return distance;
	}

}
