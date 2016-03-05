package com.yzhou9071.Leetcode;

public class N198_HouseRobber {
	public int rob(int[] nums) {
		if(nums.length <= 0)
			return 0;
		if(nums.length == 1)
			return nums[0];
		
		int len = nums.length;
        int[] total = new int[len];
        total[0] = nums[0];
        total[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2;i<len;i++){
        	total[i] = Math.max(total[i-2]+nums[i], total[i-1]);
        }
        
        return total[len-1];
    }	
}
