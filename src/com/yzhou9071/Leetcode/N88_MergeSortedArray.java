package com.yzhou9071.Leetcode;

public class N88_MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        --m;--n;
        while(m >= 0 && n >= 0)
        	nums1[len--] = (nums1[m]>nums2[n]) ? nums1[m--] : nums2[n--];
        while(n>=0)
           	nums1[len--] = nums2[n--];
    }
}
