package com.yzhou9071.Leetcode;

import java.util.List;

public class N120_Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() <= 0)
        	return 0;
        if(triangle.size() == 1)
        	return triangle.get(0).get(0);
        
        int[] sum = new int[triangle.size()];
        sum[0] = triangle.get(0).get(0);
        for(int i=1;i<triangle.size();i++){
        	sum[i] = sum[i-1] + triangle.get(i).get(i);
        	for(int j=i-1;j>=1;j--)
        		sum[j] = Math.min(sum[j], sum[j-1]) + triangle.get(i).get(j);
        	sum[0] = sum[0] + triangle.get(i).get(0);
        }
        
        int minNum = sum[0];
        for(int i=0;i<sum.length;i++)
        	minNum = sum[i]<minNum?sum[i]:minNum;
        return minNum;
    }
}
