package com.yzhou9071.Leetcode;

public class N153_FindMinRotatedSortedArr {
	public int findMin(int[] nums){
		if(nums.length <= 0)
			return 0;
		
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		while(left < right - 1){
			mid = left + (right - left)/2;
			if(nums[mid] > nums[right])
				left = mid;
			else
				right = mid;
		}
		if(nums[left] > nums[right])
			return nums[right];
		return nums[left];
	}
}
