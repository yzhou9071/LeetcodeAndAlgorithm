package com.yzhou9071.Leetcode;

public class N300_LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
        if(nums.length <= 0)
        	return 0;
        
        int len = 0;
        int[] tails = new int[nums.length];
        tails[0] = nums[0];
        
        for(int i=1;i<nums.length;i++){
        	if(nums[i] > tails[len])
        		tails[++len] = nums[i];
        	else
        		tails[binarySearch(tails,0,len,nums[i])] = nums[i];
        }
        
        return len+1;
    }
	private int binarySearch(int[] tails, int start, int end, int target){	
		int low = start, high = end;
		int mid = 0;
		while(low <= high){
			mid = low+(high-low)/2;
			if(tails[mid] == target)
				return mid;
			else if(tails[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		return low;
	}
}
