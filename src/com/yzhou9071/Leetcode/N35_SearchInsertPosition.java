package com.yzhou9071.Leetcode;

public class N35_SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		if(nums.length <= 0)
			return 0;
		
        int index = 0;
        while(index<nums.length && (nums[index] < target))
        	index++;
		
		return index;
    }
}
