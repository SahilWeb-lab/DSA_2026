package com.array;

public class SortAnArrayAscdending {

	static public int[] sortArray(int[] nums) {
		int n = nums.length;
        for(int i = 0; i < n; i++) {
        	for(int j = i + 1; j < n; j++) {
        		if(nums[i] > nums[j]) {
        			int temp = nums[i];
        			nums[i] = nums[j];
        			nums[j]= temp;
        		}
        	}
        }
        
        return nums;
    }
	
	public static void main(String[] args) {
		int[] nums = {5,2,3,1};
		int[] sortedArray = sortArray(nums);
		for(int i : sortedArray)
			System.out.print(i + " ");
	}

}
