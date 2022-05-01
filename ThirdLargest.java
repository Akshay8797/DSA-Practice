package com.Gfg;

public class ThirdLargest {
	// Given an array of distinct elements. Find the third largest element in it.

	int thirdLargest(int a[], int n) {
		int max1 = a[0], max2 = a[n - 1], max3 = a[(int) n / 2];
		max1 = (max1 > max2) ? (max1 > max3 ? max1: max3) : (max2 > max3 ? max2 : max3);
		System.out.println(max1);
		
//		for(int i=1; i<((int) n / 2); i++) {
//			if(a[i] > )
//				
//		}
		return max1;
	}

	public static void main(String[] args) {
		ThirdLargest third = new ThirdLargest();
		int[] a = {7,6,5};
		System.out.println(third.thirdLargest(a, 3));
	}

}
