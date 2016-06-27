package com.yzhou9071.Leetcode;

public class N6_ZigZagConversion {
	public String convert(String s, int numRows) {
		if(numRows <= 1)
			return s;
		
        StringBuilder ret = new StringBuilder();
        //ret.setLength(s.length());
       
        int len = s.length();
        int step = 2*numRows - 2;
        for(int i=0;i<numRows;i++){
        	for(int j=i;j<len;j+=step){
        		ret.append(s.charAt(j));
        		if(i>0 && i<numRows-1 && j+step-2*i<len)
        			ret.append(s.charAt(j+step-2*i));
        	}
        }
        
        return ret.toString();
    }
}
