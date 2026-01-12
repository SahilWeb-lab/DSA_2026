package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRangesOfNumbers {

	public static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = arr.length;
        
        if(lower < arr[0]) {
        	result.add(Arrays.asList(lower, arr[0] - 1));
        }
        
        for(int i = 0; i < n - 1; i++) {
        	if(arr[i + 1] - arr[i] > 1) {
    			result.add(Arrays.asList(arr[i] + 1, arr[i + 1] - 1));
    		}
        }
        
        if(upper > arr[n - 1]) {
        	result.add(Arrays.asList(arr[n - 1] + 1, upper));
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {14, 15, 20, 30, 31, 45};
		int lower = 10, upper = 50;
		List<List<Integer>> missingRanges = missingRanges(arr, lower, upper);
	
		missingRanges.stream().forEach(list -> {
			list.stream().forEach(val -> System.out.print(val + " "));
		});
	}

}
