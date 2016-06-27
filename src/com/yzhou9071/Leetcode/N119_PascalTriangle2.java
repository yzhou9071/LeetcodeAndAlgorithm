package com.yzhou9071.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class N119_PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> cur = null, pre = null;
        for(int i=0;i<=rowIndex;i++){
        	cur = new ArrayList<Integer>();
        	for(int j=0;j<=i;j++){
        		cur.add((j==0 || i==j)?1:(pre.get(j)+pre.get(j-1)));
        	}
        	pre = cur;
        }
        
        return cur;
    }
}
