package com.yzhou9071.Leetcode;

public class N223_RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = Math.abs((C-A)*(D-B)) + Math.abs((G-E)*(H-F));
        int repeatedHeight = Math.max(B, F)>Math.min(D, H) 
        		? 0 : Math.min(D, H)-Math.max(B, F);
        int repeatedWidth = Math.max(A, E)>Math.min(C, G) 
        		? 0 : Math.min(C, G)-Math.max(A, E);
        
        return area-repeatedHeight*repeatedWidth;
    }
}
