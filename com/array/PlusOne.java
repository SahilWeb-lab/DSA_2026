package com.array;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		
		int n = digits.length, carry = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			
			digits[i] = 0;
		}
		
		int newArr[] = new int[n + 1];
		newArr[0] = 1;
		return newArr;
	}
	
	public static void main(String[] args) {
		int digits[] = {9};
		int[] plusOne = plusOne(digits);
		for(int i : plusOne)
			System.out.print(i + " ");
	}

}
