package com.array;

import java.util.ArrayList;

public class AlternatePositiveNegative {

	 public static void rearrange(ArrayList<Integer> arr) {
		int posIndex = 0, negIndex = 1, n = arr.size();
		int res[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			if(arr.get(i) >= 0) {
				res[posIndex] = arr.get(i);
				posIndex++;
			} else {
				res[negIndex] = arr.get(i);
				negIndex++;
			}
		}
	 }
	
	public static void main(String[] args) {
		int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : arr)
			list.add(i);
		rearrange(list);
	}

}
