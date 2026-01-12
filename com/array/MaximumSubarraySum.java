package com.array;

public class MaximumSubarraySum {

	public static int maxSubarraySum(int[] arr) {
		int n = arr.length;
		int maxEnding = arr[0];
		int res = arr[0];
		for(int i = 0; i < n; i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		int maxSubarraySum = maxSubarraySum(arr);
		System.out.println(maxSubarraySum);
	}

}
