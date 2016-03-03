package com.yzhou9071.Leetcode;

public class N75_SortColors {
	public void sortColors(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        int cur = 0;
        
        while(cur <= tail){
        	if(nums[cur] == 0){
        		swap(head,cur,nums);
        		head++;
        		cur++;
        	}else if(nums[cur] == 1){
        		cur++;
        	}else{
        		swap(tail,cur,nums);
        		tail--;
        	}
        }
    }
	private void swap(int i, int j, int[] nums){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
