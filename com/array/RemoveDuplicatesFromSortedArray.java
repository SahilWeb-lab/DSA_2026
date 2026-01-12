package com.array;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

	static int removeDuplicates(int[] arr) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i : arr) {
			if(!nums.contains(i)) {
				nums.add(i);
			}
		}
		return nums.size();
	}

	public static void main(String[] args) {
		int arr[] = {2, 2, 2, 2, 2};
		int removeDuplicates = removeDuplicates(arr);
		System.out.println(removeDuplicates);
	}

}
