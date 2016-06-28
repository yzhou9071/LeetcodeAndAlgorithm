package com.yzhou9071.Leetcode;

public class N189_RotateArray {
    public void rotate(int[] nums, int k) {
    	int len = nums.length;
    	if(k <= 0 || k == len)
    		return ;
    	if(k > len)
    		k %= len;
    	
    	//method one
    	int[] tmp = new int[k];
    	System.arraycopy(nums, len-k, tmp, 0, k);
    	System.arraycopy(nums, 0, nums, k, len-k);
    	System.arraycopy(tmp, 0, nums, 0, k);
    	
    	//method two
    	rotate(nums, 0, len-1);
    	rotate(nums, 0, k-1);
    	rotate(nums, k, len-1);
    }
    
    private void rotate(int[] nums, int low, int high){
    	int tmp;
    	while(low <= high){
    		tmp = nums[low];
    		nums[low] = nums[high];
    		nums[high] = tmp;
    		++low;--high;
    	}
    }
}
