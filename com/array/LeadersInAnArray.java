package com.array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

	static ArrayList<Integer> leaders(int arr[]) {
       int n = arr.length, prev = Integer.MIN_VALUE;
       ArrayList<Integer> leaders = new ArrayList<Integer>();
       for(int i = n - 1; i >= 0; i--) {
    	   if(arr[i] >= prev) {
    		   leaders.add(arr[i]);
    		   prev = arr[i];
    	   }
       }
       
       Collections.reverse(leaders);
       
       return leaders;
    }
	
	public static void main(String[] args) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		ArrayList<Integer> leaders = leaders(arr);
		leaders.stream().forEach(ele -> System.out.print(ele));
	}

}
