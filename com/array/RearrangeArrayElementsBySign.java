package com.array;

public class RearrangeArrayElementsBySign {

	public static int[] rearrangeArray(int[] nums) {
		int posIndex = 0, negIndex = 1;
		int newArr[] = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				newArr[posIndex] = nums[i];
				posIndex += 2;
			} else if(nums[i] < 0) {
				newArr[negIndex] = nums[i];
				negIndex += 2;
			}
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,1,-2,-5,2,-4};
		
		for(int i : nums)
			System.out.print(i + " ");
		
		System.out.println();
		
		int[] rearrangeArray = rearrangeArray(nums);
		for(int i : rearrangeArray)
			System.out.print(i + " ");

	}

}
