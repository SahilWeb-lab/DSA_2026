package com.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {

//	static ArrayList<Integer> findTwoElement(int arr[]) {	
//		ArrayList<Integer> result = new ArrayList<Integer>();
//		
//		int n = arr.length;
////		Create a frequency array:
//		int freq[] = new int[n + 1];
//		int missingElement = -1;
//		int repeatingElement = -1;
//		
//		for(int i = 0; i < n; i++) {
//			freq[arr[i]]++;
//		}
//		
//		for(int i = 1; i <= n; i++) {
//			if(freq[i] == 0) missingElement = i; 
//			else if(freq[i] == 2) repeatingElement = i;
//		}
//		
//		result.add(missingElement);
//		result.add(repeatingElement);
//		
//		return result;
//    }
	
//	Another Approach: Using array marking
	static ArrayList<Integer> findTwoElement(int arr[]) {
		int n = arr.length;
        int repeating = -1;

        // traverse the array and mark visited indices
        // by negating the value at index arr[i] - 1
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);

            // if the value at index val - 1 is already negative
            // it means we've seen this value before
            if (arr[val - 1] > 0) {
                arr[val - 1] = -arr[val - 1]; 
            } else {
                // if it's already negative, this value is 
                // the repeating one
                repeating = val;
            }
        }

        int missing = -1;

        // after marking, the index with a positive value
        // corresponds to the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        
        // return result: first repeating, then missing
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {6, 5, 8, 7, 1, 4, 1, 3, 2};
		 ArrayList<Integer> twoElement = findTwoElement(arr);
		 twoElement.stream().forEach(t -> System.out.print(t + ", "));
	}
	
}
