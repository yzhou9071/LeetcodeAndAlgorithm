package com.yzhou9071.Leetcode;

public class N80_RemoveDuplicateFromSortedArr2 {
	public int removeDuplicates(int[] nums) {
        int len = nums.length;
		if(len <= 2)
        	return len<=0?0:len;
		
		int index = 2;
        for(int i=2;i<len;i++){
        	if(nums[i] != nums[index-2])
        		nums[index++] = nums[i];
        }
        
        return index;
    }
}
