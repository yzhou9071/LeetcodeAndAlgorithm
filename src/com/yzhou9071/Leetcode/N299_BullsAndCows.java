package com.yzhou9071.Leetcode;

public class N299_BullsAndCows {
	public String getHint(String secret, String guess) {
		if(secret.length() <= 0
				|| guess.length() <= 0
				|| secret.length() != guess.length())
			return "";
        
		int bullNum = 0, cowNum = 0;
        int[] secretNum = new int[10];
        int[] guessNum = new int[10];
        String ret = "";
        for(int i=0;i<secret.length();i++){
        	char tmpGuess = guess.charAt(i);
        	char tmpSecret = secret.charAt(i);
        	if(tmpSecret == tmpGuess)
        		++bullNum;
        	else{
        		++secretNum[tmpSecret-'0'];
        		++guessNum[tmpGuess-'0'];
        	}
        }
        for(int i=0;i<10;i++)
        	cowNum += Math.min(secretNum[i], guessNum[i]);
        ret = bullNum + "A" + cowNum + "B";
        return ret;
    }
}
