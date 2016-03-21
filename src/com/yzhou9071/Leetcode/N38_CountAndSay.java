package com.yzhou9071.Leetcode;

public class N38_CountAndSay {
	public String countAndSay(int n) {
        if(n <= 0)
        	return "";
        
        String ret = "1";
        int count = 1;
        while(count < n){
        	ret = generateSeq(ret);
        	++count;
        }
        return ret;
    }
	private String generateSeq(String ret){
		String tmp = "";
		int len = ret.length();
		for(int i=0;i<len;){
			int index = i;
			while(i<len && ret.charAt(index) == ret.charAt(i))
				++i;
			tmp += Integer.toString(i-index) + ret.charAt(index);
		}
		return tmp;
	}
}
