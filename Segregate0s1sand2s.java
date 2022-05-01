package com.Gfg;

public class Segregate0s1sand2s {

	static int[] segregate3(int[] arr, int len) {
		int loop = 0, cnt0 = 0, cnt1 = 0, cnt2 = 0;
		for (loop = 0; loop < len; loop++) {
			switch (arr[loop]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}
		int i = 0;
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int[] segArr = segregate3(arr, arr.length);
		for (int i : segArr)
			System.out.print(i + " ");
	}

}
