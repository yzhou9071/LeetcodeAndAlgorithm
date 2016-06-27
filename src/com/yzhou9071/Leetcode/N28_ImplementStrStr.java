package com.yzhou9071.Leetcode;

public class N28_ImplementStrStr {
	public int strStr(String haystack, String needle) {
		int lenH = haystack.length();
		int lenN = needle.length();
		if(lenN <= 0
				|| (lenH <= 0 && lenN <= 0)
				|| haystack.equals(needle))
			return 0;
		
        int pos = -1;
		for(int i=0;i<lenH-lenN+1;i++){
			if(haystack.charAt(i) == needle.charAt(0)){
				if(haystack.substring(i, i+lenN).equals(needle)){
					pos = i;
					break;
				}
			}
		}

        return pos;
    }
}
