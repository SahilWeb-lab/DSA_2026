package com.array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

	static  public List<Integer> majorityElement(int[] nums) {
		int n = nums.length;
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        // Majority Element:
        for(int ele : nums) {
            if(count1 == 0) {
                candidate1 = ele;
                count1 = 1;
            } else if(count2 == 0) {
                candidate2 = ele;
                count2 = 1;
            } else if(candidate1 == ele) {
                count1++;
            } else if(candidate2 == ele) {
                count2++;
            } else if(candidate2 != ele) {
            	count2--;
            } else if(candidate1 != ele) {
            	count1--;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        System.out.println(candidate1 + " " + candidate2);

        count1 = 0;
        count2 = 0;
        // Total no of occurences of majority element:
        for(int ele : nums) {
            if(candidate1 == ele) 
                count1++;
            if(candidate2 == ele)
                count2++;
        }

        List<Integer> res = new ArrayList<Integer>();
        if(count1 > n / 3) res.add(candidate1);
        if(count2 > n / 3 && candidate1 != candidate2) res.add(candidate2);

        return res;
	}
	
	public static void main(String[] args) {
		int []nums = {2,1,1,3,1,4,5,6};
		List<Integer> majorityElement = majorityElement(nums);
		majorityElement.stream().forEach(System.out::println);
	}

}
