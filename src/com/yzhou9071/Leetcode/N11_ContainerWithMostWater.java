package com.yzhou9071.Leetcode;

public class N11_ContainerWithMostWater {
	public int maxArea(int[] height) {
        int square = 0;
        int len = height.length;
        int low = 0;
        int high = len-1;
        while(low<high){
        	int lowVal = height[low];
        	int highVal = height[high];
        	square = Math.max(square, 
        			(high-low)*(lowVal<highVal ? lowVal : highVal));
        	if(height[low] <= height[high]){
        		while(low<high && height[low]<=lowVal)
        			++low;
        	}else{
        		while(low<high && height[high]<=highVal)
        			--high;
        	}
        }      
        return square;
    }
}
