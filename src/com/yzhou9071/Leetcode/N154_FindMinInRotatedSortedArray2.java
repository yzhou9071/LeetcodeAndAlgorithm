package com.yzhou9071.Leetcode;

public class N154_FindMinInRotatedSortedArray2 {
	public int findMin(int[] nums) {
        if(nums.length <= 0)
        	return 0;
        int len = nums.length;
        int low = 0, high = len - 1;
        int mid = 0;
        
        while(low != high){
        	mid = low + (high - low)/2;
        	if(nums[mid] > nums[high])
        		low = mid + 1;
        	else if(nums[mid] < nums[high])
        		high = mid;
        	else
        		--high;
        }
        
        return nums[high];
    }
}
