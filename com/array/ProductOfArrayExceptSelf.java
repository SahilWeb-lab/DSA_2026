package com.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

//	Naive Approach:
//	public static int[] productExceptSelf(int arr[]) {
//       int newArr[] = new int[arr.length];
//       Arrays.fill(newArr, 1);
//       
//       for(int i = 0; i < arr.length; i++) {
//    	   for(int j = 0; j < arr.length; j++) {
//    		   if(i != j)
//    			   newArr[i] *= arr[j];
//    	   }
//       }
//       
//       return newArr;
//    }
	
//	Expected Approach:
	public static int[] productExceptSelf(int arr[]) {
		int prod = 1, n = arr.length, zeros = 0, idx = -1;
		int res[] = new int[n];
		Arrays.fill(res, 0);
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0)		
				prod *= arr[i];
			else {				
				idx = i;
				zeros++;
			}
		}
		
		if(zeros == 0) {
			for(int i = 0; i < n; i++) {
				res[i] = prod / arr[i];
			}
		} else if(zeros == 1) {
			res[idx] = prod;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {10, 3, 0, 5, 6, 2, 0};
		int[] productArr = productExceptSelf(arr);
		for(int i : productArr)
			System.out.print(i + " ");
	}

}
