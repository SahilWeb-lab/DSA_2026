package com.array;

public class SumOfSubarrays {

	static int subarraySum(int[] arr) {
        
        int n = arr.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += (arr[i] * (i + 1) * (n - i));
        }

        return result;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 3, 2};
        System.out.println(subarraySum(arr));
	}

}
