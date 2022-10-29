package com.Gfg.Arrays;

public class MinConsecutiveFlips {

	/*- Given a binary array. 
	 * WAP to make all the elements of the array same by flipping 0s or 1s.
	 * Note: Consecutive elements can be flipped in one go.
	 * 
	 * I/P: arr[] = {1, 1, 0, 0, 0, 1}
	 * O/P: From 2 to 4
	 * I/P: arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1}
	 * O/P: From 1 to 3
	 * 		From 5 to 6
	 * I/P: arr[] = {0, 1}
	 * O/P: From 0 to 0 or From 1 to 1
	 */

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };
		getMinimumConsecutiveFlips(arr, arr.length);
	}

	/*- There are only two types of groups 0s and 1s.
	 * Either both have the same count or there is a difference of 1.
	 * 2nd group will always have same or one less count.
	 * 1st element is always part of 1st group
	 */
	private static void getMinimumConsecutiveFlips(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0])
					System.out.print("From " + i + " to ");
				else
					System.out.println(i - 1);
			}
		}
		// Explicitly handling the end of last interval. Ex. {1, 0, 1, 0}
		if (arr[n - 1] != arr[0])
			System.out.println(n - 1);

	}
}
