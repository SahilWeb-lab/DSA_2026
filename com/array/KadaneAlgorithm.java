package com.array;

public class KadaneAlgorithm {

	public static int maxSubarraySum(int[] arr) {
		
		int maxSubArraySum = arr[0], result = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			maxSubArraySum = Math.max(arr[i] + maxSubArraySum, arr[i]);
			result = Math.max(result, maxSubArraySum);
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		int maxSubarraySum = maxSubarraySum(arr);
		System.out.println(maxSubarraySum);
	}

}
