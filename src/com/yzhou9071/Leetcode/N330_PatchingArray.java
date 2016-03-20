package com.yzhou9071.Leetcode;

public class N330_PatchingArray {
	public int minPatches(int[] nums, int n) {
		if (n <= 0)
			return 0;
		nums = nums.length<=0?new int[0]:nums;
		int index = 0, ret = 0;
		long miss = 1, sum = 0;
		while (miss <= n) {
			if (index < nums.length && nums[index] <= miss) {
				sum += nums[index++];
			} else {
				ret++;
				sum += miss;
			}
			miss = sum + 1;
		}
		return ret;
	}
}
