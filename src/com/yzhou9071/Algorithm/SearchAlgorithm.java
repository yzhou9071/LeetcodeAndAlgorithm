package com.yzhou9071.Algorithm;

public class SearchAlgorithm {
	public static int sequentialSearch(int[] nums, int target){
		if(nums.length <= 0)
			return 0;
		
		int ret = 0;
		for(;ret<nums.length;ret++){
			if(nums[ret] == target)
				return ret;
		}
		
		return ret;
	}
	
	public static int binarySearch(int[] nums, int target){
		if(nums.length <= 0)
			return 0;
		
		int low = 0, high = nums.length - 1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		return -1;
	}
	
	public static int blockingSearch(int[] index, int[] nums, int target, int m){
		if(nums.length <= 0 || index.length <= 0)
			return -1;
		
		int blockIndex = _blockSearch(index,target);
		if(blockIndex >= 0){
			int blockStart = (blockIndex>0) ? (blockIndex*m) : blockIndex;
			for(int i=blockStart;i<((++blockIndex)*m);i++){
				if(target == nums[i])
					return i;
			}
		}
		
		return -1;
	}
	private static int _blockSearch(int[] index, int target){
		if(index[0] >= target)
			return 0;
		
		for(int i=1;i<index.length;i++){
			if(index[i-1]<target
					&& index[i] >= target)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] argc){
		int[] nums = {1,2,5,3,4,6,8,7,9,10,11,13,12,15,14};
		int[] index = {5,10,15};
		System.out.println(blockingSearch(index,nums,4,5));
	}
}
