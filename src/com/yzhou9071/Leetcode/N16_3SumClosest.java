package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N16_3SumClosest {
	public int threeSumClosest(int[] nums, int target) {
        if(nums.length <= 0)
        	return -1;
        
        Arrays.sort(nums);
        int ret = 0, diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
        	for(int j=i+1,k=nums.length-1;j<k;){
        		int sum = nums[i] + nums[j] + nums[k];
        		if(sum == target){
        			return target;
        		}else if(sum > target){
        			--k;
        		}else{
        			++j;
        		}

    			if(Math.abs(sum - target) < diff){
    				diff = Math.abs(sum - target);
    				ret = sum;
    			}
        	}
        }
        
        return ret;
    }
}
