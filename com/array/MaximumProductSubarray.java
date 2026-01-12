package com.array;

public class MaximumProductSubarray {

	public static int maxProduct(int[] arr) {
		int maxSubArrayProduct = arr[0], result = arr[0];
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			maxSubArrayProduct = Math.max(maxSubArrayProduct * arr[i], result);
			result = Math.max(maxSubArrayProduct, result);
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {-2, 6, -3, -10, 0, 2};
		int maxProduct = maxProduct(arr);
		System.out.println(maxProduct);
	}

}
