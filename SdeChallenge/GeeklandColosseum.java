package com.Gfg.SdeChallenge;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * King of Geekland ordered to build a colosseum for fighting.
 * He asks his minister to bring 3*n fighters. Each fighter is denoted by a roll no. from 1 to 3*n.
 * An array a of length 3*n is given such that ith element denotes the strength of the fighter with ith roll no.
 * From these fighters, n will be removed. The remaining 2*n will be divided into two groups based on their roll nos.
 * n fighters with smallest roll nos. will be put in group 1 and other n with largest roll nos. in group 2.
 * Let sum of strength of group 1 will be s1 and other be s2. Find maximum value of s1-s2.
 * 
 * Input: n=2, a[] = {1,3,5,2,1,1}
 * Output: 6
 * Explanation: Fighter 1 and 2 will be removed. Then, s1=(3+5)=8 and s2=(1+1)=2. s1-s2=6.
 * 
 * Input:n=2, a[] = {1,1,5,3,7,7}
 * Output: -4
 * Explanation: Fighter 1 and 7 will be removed. Then, s1=(1+5)=6 and s2=(3+7)=10. s1-s2=-4. 
 */

public class GeeklandColosseum {

	public static void main(String[] args) {
		int[] a = { 1, 1, 5, 3, 7, 7 };
		System.out.println(colloseum(2, a));
	}

	public static long colloseum(int n, int[] a) {
		long[] left = new long[3 * n];
		long[] right = new long[3 * n];
		PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());
		int sum = 0;
		for (int i = 0; i < 3 * n; i++) {
			if (minQ.size() < n) {
				minQ.add(a[i]);
				sum += a[i];
			} else if (minQ.size() == n && a[i] > minQ.peek()) {
				int v = minQ.poll();
				minQ.add(a[i]);
				sum = sum + a[i] - v;
			}
			if (minQ.size() == n)
				left[i] = sum;
		}
		sum = 0;
		for (int j = 0; j < 3 * n; j++) {
			int i = (3 * n) - (j + 1);
			if (maxQ.size() < n) {
				maxQ.add(a[i]);
				sum += a[i];
			} else if (maxQ.size() == n && a[i] < maxQ.peek()) {
				int v = maxQ.poll();
				maxQ.add(a[i]);
				sum = sum + a[i] - v;
			}
			if (maxQ.size() == n)
				right[i] = sum;
		}
		long result = left[n - 1] - right[n];
		for (int x = n + 1; x <= 2 * n; x++) {
			if ((left[x - 1] - right[x]) > result)
				result = left[x - 1] - right[x];
		}
		return result;
	}

}
