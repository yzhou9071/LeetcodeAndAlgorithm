package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N164_MaximumGap {
	public int maximumGap(int[] nums) {
        if(nums.length < 2)
        	return 0;
        
        int len = nums.length;
        int ret = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for(int num: nums){
        	min = num<min ? num : min;
        	max = num>max ? num : max;
        }
        if(min == max)
        	return ret;
        
        int bucketGap = (max - min) / (len - 1);
        bucketGap = (bucketGap==0) ? 1 : bucketGap;
        int bucketNum = (max - min) / bucketGap + 1;
        
        int[] minBucket = new int[bucketNum];
        int[] maxBucket = new int[bucketNum];
        Arrays.fill(minBucket, -1);
        Arrays.fill(maxBucket, -1);
        
        for(int i=0;i<len;i++){
        	int bucketIndex = (nums[i] - min) / bucketGap;
        	if(minBucket[bucketIndex] == -1){
        		minBucket[bucketIndex] = nums[i];
        		maxBucket[bucketIndex] = nums[i];
        	}else{
        		minBucket[bucketIndex] = (minBucket[bucketIndex]>nums[i]) ? nums[i] : minBucket[bucketIndex];
        		maxBucket[bucketIndex] = (maxBucket[bucketIndex]<nums[i]) ? nums[i] : maxBucket[bucketIndex];
        	}
        }
        
        ret = Integer.MIN_VALUE;
        int minVal = -1, maxVal;
        for(int i=0;i<bucketNum;i++){
        	if(minBucket[i] != -1 && minVal == -1){
        		minVal = maxBucket[i];
        	}else if(minBucket[i] != -1 && minVal != -1){
        		maxVal = minBucket[i];
        		ret = (ret>(maxVal-minVal)) ? ret : (maxVal-minVal);
        		minVal = maxBucket[i];
        	}
        }
        
        return ret;
    }
}
