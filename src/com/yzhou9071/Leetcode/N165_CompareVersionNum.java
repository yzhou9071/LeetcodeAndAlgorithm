package com.yzhou9071.Leetcode;

public class N165_CompareVersionNum {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();
        
        int tl1 = 0, tl2 = 0;        
        int num1 = 0, num2 = 0;
        
        while(tl1 < len1 || tl2 < len2){
        	while(tl1 < len1 && version1.charAt(tl1)!='.'){
        		num1 = num1*10 + (version1.charAt(tl1)-'0');
        		++tl1;
        	}
        	while(tl2 < len2 && version2.charAt(tl2)!='.'){
        		num2 = num2*10 + (version2.charAt(tl2)-'0');
        		++tl2;
        	}
        	
        	System.out.println(num1 +"++"+num2);
        	if(num1 > num2) return 1;
        	else if(num1 < num2) return -1;
        	else{
        		num1 = num2 = 0;
        		++tl1;++tl2;
        	}
        }
        
        return 0;
    }
}
