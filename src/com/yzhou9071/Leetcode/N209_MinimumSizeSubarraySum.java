package com.yzhou9071.Leetcode;

public class N209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
    	if(nums.length <= 0)
    		return 0;
    	
    	int ret = Integer.MAX_VALUE;
    	int i = 0, j = 0, sum = nums[0];
    	while(j < nums.length){
    		if(sum >= s){
    			ret = j-i+1>ret ? ret : j-i+1;
    			if(ret == 1) return 1;
    			sum -= nums[i++];
    		}else{
    			++j;
    			if(j<nums.length)
    				sum += nums[j];
    		}
    	}
    	
    	return ret==Integer.MAX_VALUE ? 0 : ret;
    }
}
