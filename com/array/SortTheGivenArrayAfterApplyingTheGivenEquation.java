package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheGivenArrayAfterApplyingTheGivenEquation {

	public static ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
		int n = arr.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr[i] = A*(arr[i] * arr[i]) + B*arr[i] + C;
			result.add(arr[i]);
		}
		Collections.sort(result);
		return result;
    }
	
	public static void main(String[] args) {
		int arr[] = {-4, -2, 0, 2, 4};
		int A = 1, B = 3, C = 5;
		
		ArrayList<Integer> result = sortArray(arr, A, B, C);
		result.stream().forEach(System.out::print);
	}

}
