package com.Gfg.SdeChallenge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* Given an array of nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the window moves right by one position.
 * 
 * Input: nums = [1,3,-1,-3,5,3,6,7], k=3
 * Output: [3,3,5,5,6,7]
 * 
 * Optimal Solution is to use Deque with T(n) = O(n).
 * Approach: When inserting an element in the Deque, If already smaller element is present at the end,
 * remove that element then insert. That way we'll always have first element as highest in the window.
 */

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int[] res = GetSlidingWindowMax(a, 3);
		for (int i = 0; i < res.length; i++)
			System.out.print(res[i] + " ");
	}

	public static int[] GetSlidingWindowMax(int[] a, int k) {
		int n = a.length, i = 0;
		List<Integer> res = new ArrayList<>();
		Deque<Integer> deque = new ArrayDeque<>();

		for (i = 0; i < k; i++) {
			while (!deque.isEmpty() && a[i] >= a[deque.peekLast()])
				deque.removeLast();
			deque.addLast(i);
		}
		for (; i < n; i++) {
			res.add(a[deque.peek()]);
			while (!deque.isEmpty() && deque.peek() <= i - k)
				deque.removeFirst();
			while (!deque.isEmpty() && a[i] >= a[deque.peekLast()])
				deque.removeLast();
			deque.addLast(i);
		}

		res.add(a[deque.peek()]);
		return res.stream().mapToInt(Integer::intValue).toArray();
	}
}
