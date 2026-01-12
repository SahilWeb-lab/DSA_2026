package com.array;

public class MoveAllZerosToEnd {

//	Better Approach:
//	public static void pushZerosToEnd(int[] arr) {
//
//		int n = arr.length, count = 0;
//		
//		for(int i = 0; i < n; i++) {
//			if(arr[i] != 0) {
//				arr[count] = arr[i];
//				count++;
//			}
//		}
//		
//		while(count < n) 
//			arr[count++] = 0;
//		
//	}
	
//	Expected Approach:
	public static void pushZerosToEnd(int[] arr) {
		int n = arr.length, count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0) {
				
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		pushZerosToEnd(arr);
		for(int i : arr)
			System.out.print(i + " ");
	}

}
