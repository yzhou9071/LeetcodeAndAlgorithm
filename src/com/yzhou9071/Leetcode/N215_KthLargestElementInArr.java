package com.yzhou9071.Leetcode;

public class N215_KthLargestElementInArr {
	public int findKthLargest(int[] nums, int k) {
        if(nums.length <= 0)
        	return -1;
        int len = nums.length;
        int low = 0, high = len - 1;
        while(true){
        	if(low == high)
        		return nums[low];
        	
        	int mid = partition(nums,low,high);
        	if(mid == (len-k))
        		return nums[mid];
        	else if(mid > (len-k))
        		high = mid - 1;
        	else 
        		low = mid + 1;
        }   
    }
	private int partition(int[] nums, int low, int high){
		int val = nums[low];
		while(low < high){
			while(low < high && nums[high] >= val)
				--high;
			swap(nums,low,high);
			while(low < high && nums[low] <= val)
				++low;
			swap(nums,low,high);
		}
		return low;
	}
	private void swap(int[] nums, int left, int right){
		int tmp = nums[left];
		nums[left] = nums[right];
		nums[right] = tmp;
	}
}
