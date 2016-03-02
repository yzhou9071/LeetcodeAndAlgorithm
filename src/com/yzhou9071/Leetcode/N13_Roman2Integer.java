package com.yzhou9071.Leetcode;

import java.util.HashMap;

public class N13_Roman2Integer {
	public int romanToInt(String s) {
		HashMap<String,Integer> romanMap = new HashMap<String,Integer>(){{
			put("I",1);put("V",5);put("X",10);put("L",50);
			put("C",100);put("D",500);put("M",1000);put("",0);
		}};
		
		if(s.length() <= 0) return 0;
		
		int rightOne = 0, leftOne = 0;
		int sum = romanMap.get(s.charAt(s.length()-1)+"");
		for(int i=s.length()-2;i>=0;i--){
			rightOne = romanMap.get(s.charAt(i+1)+"");
			leftOne = romanMap.get(s.charAt(i)+"");
			   
			if(rightOne <= leftOne)
				sum += leftOne;
			else
				sum -= leftOne;
		}
		
		return sum;
    }
}
