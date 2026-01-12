package com.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static int majorityElement(int arr[]) {
		int n = arr.length, candidate = arr[0], count = 0;
		
		for(int i = 0; i < n; i++) {
			if(count == 0) {
				candidate = arr[i];
				count = 1;
			} else if(candidate == arr[i]) {
				count++;
			} else {
				count--;
			}
		}
		
		for(int val : arr) {
			if(val == candidate) {
				count++;
			}
		}
		
		if(count > n / 2)
			return candidate;
		else
			return -1;
    }
	
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 1, 3, 5, 1};
		int majorityElement = majorityElement(arr);
		System.out.println(majorityElement);
	}

}
