package com.yzhou9071.Leetcode;

public class N287_FindDuplicateNumber {
	//http://www.cnblogs.com/grandyang/p/4843654.html
	public int findDuplicate(int[] nums) {
		if(nums.length <= 0) 
			return 0;
		
		int low = 1, high = nums.length-1;
		int mid, count;
		
		while(low < high){
			count = 0;
			mid = low + (high - low)/2;
			
			for(int i=0;i<nums.length;i++){
				if(nums[i] <= mid)
					count++;
			}
			
			if(count > mid)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
    }
}
