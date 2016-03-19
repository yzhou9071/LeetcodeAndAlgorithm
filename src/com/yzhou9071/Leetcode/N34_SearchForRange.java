package com.yzhou9071.Leetcode;

public class N34_SearchForRange {
	public int[] searchRange(int[] nums, int target) {
		int[] ret = new int[]{-1,-1};
        if(nums.length <= 0)
        	return ret;
        
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
        	if(nums[mid] == target){
        		ret[0] = findPre(mid,nums,target,start);
        		ret[1] = findNext(mid,nums,target,end);
        		break;
        	}else if(nums[mid] < target){
        		start = mid + 1;
        	}else{
        		end = mid - 1;
        	}
        }        
        return ret;
    }
	private int findPre(int pos,int[] nums,int target, int start){
		int ret = -1;
		while(pos >= start){
			if(nums[pos] == target)
				ret = pos--;
			else break;
		}
		return ret;
	}
	private int findNext(int pos,int[] nums,int target,int end){
		int ret = -1;
		while(pos <= end){
			if(nums[pos] == target)
				ret = pos++;
			else break;
		}
		return ret;
	}
}
