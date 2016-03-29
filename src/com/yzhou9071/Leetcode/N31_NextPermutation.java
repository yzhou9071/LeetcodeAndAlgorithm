package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N31_NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 0)
        	return ;
        int len = nums.length;
        int pos = len - 1;
        while(pos > 0){
        	if(nums[pos-1] < nums[pos])
        		break;
        	--pos;
        }
        if(pos == 0){
        	Arrays.sort(nums);
        	return ;
        }
        
        Arrays.sort(nums, pos, len);
        for(int i=pos;i<=len-1;i++){
        	if(nums[i] > nums[pos-1]){
        		int tmp = nums[i];
        		nums[i] = nums[pos-1];
        		nums[pos-1] = tmp;
        		break;
        	}
        }
    }
}
