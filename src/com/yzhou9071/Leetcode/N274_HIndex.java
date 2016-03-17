package com.yzhou9071.Leetcode;

import java.util.Arrays;

public class N274_HIndex {
	public int hIndex(int[] citations) {
		if(citations.length <= 0)
        	return 0;
        Arrays.sort(citations);
        int hIndex = 0;
        int len = citations.length;
        for(int i=0;i<len;i++){
        	int curIndex = Math.min(citations[i], len-i); 
        	hIndex = curIndex>hIndex?curIndex:hIndex;
        }
        return hIndex;
    }
}
