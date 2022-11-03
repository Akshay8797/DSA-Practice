package com.Gfg.Arrays;

import java.util.Arrays;

public class PartitionSum {

	/*- Given an array, check if it can be partitioned into three different parts with equal sum.
	 * 
	 * I/p: arr = [5, 2, 6, 1, 1, 1, 1, 4]	=>	O/p: true [(5,2), (6,1), (1,1,1,4)].
	 * I/p: arr = [3, 2, 5, 1, 1, 5]		=>	O/p: false.
	 */

	public static void main(String[] args) {
		int[] arr = { 5, 2, 6, 1, 1, 1, 1, 4 };
		System.out.println(partitionSumExists(arr));

	}

	private static boolean partitionSumExists(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		if (sum != 0 && sum % 3 == 0) {
			int partitionSum = sum / 3, currPartitions = 0, currSum = 0, i;
			for (i = 0; i < arr.length; i++) {
				currSum += arr[i];
				if (currSum == partitionSum) {
					currPartitions++;
					currSum = 0;
				}
			}
			if (currPartitions == 3)
				return true;
		}
		return false;
	}

}
