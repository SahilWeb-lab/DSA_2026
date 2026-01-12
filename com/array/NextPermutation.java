package com.array;

public class NextPermutation {

	static void nextPermutation(int[] arr) {
		int n = arr.length, idx = -1; 
		
//		Longer prefix match:
		for(int i = n - 2; i >= 0; i--) {
			if(arr[i] < arr[i + 1]) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			reverse(arr, 0, n - 1);
			return;
		}
		
//		Swap:
		for(int i = n - 1; i > idx; i--) {
			if(arr[i] > arr[idx]) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				break;
 			}
		}
		
//		Reverse Rest Array Element:
		int left = idx + 1, right = n - 1;
		reverse(arr, left, right);
	}
	
	// Helper method to reverse array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		nextPermutation(arr);
		for(int val : arr)
			System.out.print(val + " ");
	}

}
