package com.Gfg.Arrays;

/*- int[] a = { 2, 3, 5, 4, 6, 1 }
 * 	getSum(0,2)  => 2+3+5 = 10 ,    		getSum(1,3)  => 3+5+4 = 12
 * 	getWSum(0,2) => 1*2+2*3+3*5 = 23 ,		getWSum(1,3) => 2*3+3*5+4*4 = 37
 */
public class PrefixSum {

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 4, 6, 1 };
		System.out.println(getSum(a, 1, 3));
		System.out.println(getWeightedSum(a, 1, 3));
	}

	private static int getSum(int[] a, int l, int r) {
		int[] prefixSum = getPrefixSumArray(a);
		// Query in O(1)
		if (l == 0)
			return prefixSum[r];
		return prefixSum[r] - prefixSum[l - 1];
	}

	private static int getWeightedSum(int[] a, int l, int r) {
		int[] prefixWeightedSum = getPrefixWeightedSumArray(a);
		// Query in O(1)
		if (l == 0)
			return prefixWeightedSum[r];
		return prefixWeightedSum[r] - prefixWeightedSum[l - 1];
	}

	// Pre-processing in O(n)
	private static int[] getPrefixSumArray(int[] a) {
		int n = a.length, i;
		if (n > 0) {
			int[] prefixSum = new int[n];
			prefixSum[0] = a[0];
			for (i = 1; i < n; i++)
				prefixSum[i] = prefixSum[i - 1] + a[i];
			return prefixSum;
		}
		return new int[0];
	}

	// Pre-processing in O(n)
	private static int[] getPrefixWeightedSumArray(int[] a) {
		int n = a.length, i;
		if (n > 0) {
			int[] prefixWeightedSum = new int[n];
			prefixWeightedSum[0] = 1 * a[0];
			for (i = 1; i < n; i++)
				prefixWeightedSum[i] = prefixWeightedSum[i - 1] + ((i + 1) * a[i]);
			return prefixWeightedSum;
		}
		return new int[0];
	}

}
