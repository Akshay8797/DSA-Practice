package com.Gfg.Mathematics;

public class PalindromeTest {
	
	static boolean checkPalindrome(int number) {
		int rev = 0, temp = number;
		while(temp != 0) {
			rev = rev * 10 + (temp%10);
			temp = temp/10;
		}
		if(rev == number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome(153351));
	}
}
