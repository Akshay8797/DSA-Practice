package com.Gfg;

public class Replace0With5 {
	// You are given an integer N. You need to convert all zeroes of N to 5.

	int convertfive(int num) {
		return num += calculateAddedValue(num);
	}

	private int calculateAddedValue(int num) {
		int result = 0, decimalPlace = 1;
		if (num == 0)
			return 5 * decimalPlace;
		else {
			while (num > 0) {
				if (num % 10 == 0)
					result += 5 * decimalPlace;
				num /= 10;
				decimalPlace *= 10;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Replace0With5 testReplace = new Replace0With5();
		int changedNum = testReplace.convertfive(2502);
		System.out.println("Result is " + changedNum);
	}

}
