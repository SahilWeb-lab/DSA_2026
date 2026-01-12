package com.array;

public class MaxConsecutiveOnes {

	 public static int findMaxConsecutiveOnes(int[] nums) {
		 int count = 0, maxCount = 0;
		 
		 for(int i : nums) {
			if(i == 1) 
				count++;
			else {
				maxCount = Math.max(maxCount, count);
				count = 0;
			}
		 }
		 
		 return Math.max(maxCount, count);
	 }
	
	public static void main(String[] args) {
		int arr[] = {1,1,0,1,1,1};
		int maxConsecutiveOnes = findMaxConsecutiveOnes(arr);
		System.out.println(maxConsecutiveOnes);
	}

}
