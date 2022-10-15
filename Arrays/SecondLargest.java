package com.Gfg.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
//		int[] arr = { 2, 6, 8, 1, 9, 7 };
		int[] arr = { 12, 12, 7 };
		System.out.println(secLargestElemIndex(arr));
	}

	private static int secLargestElemIndex(int[] arr) {
		int lar1 = 0, lar2 = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[lar1]) {
				lar2 = lar1;
				lar1 = i;
			}
			/* a[i] < a[lar1] : if lar2 == -1 	   => lar2 = i. 
			 * 					if a[i] <= a[lar2] => Ignore.
			 * 					if a[i] > a[lar2]  => lar2 = i. */
			else if (arr[i] != arr[lar1]) {
				if (lar2 == -1 || arr[i] > arr[lar2])
					lar2 = i;
			}
		}
		return lar2;
	}
}
