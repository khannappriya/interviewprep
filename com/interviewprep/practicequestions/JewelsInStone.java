package com.interviewprep.practicequestions;

import java.util.HashMap;
import java.util.Map;

public class JewelsInStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JewelsInStone testoutput = new JewelsInStone();
    int countTestOutput= testoutput.numJewelsInStones("PriyA", "ShreejyaPripRIYAaA");
    System.out.println(countTestOutput);
	}

	
    public int numJewelsInStones(String J, String S) {
    	int countJewels=0;
    	
    	Map<Character, Integer> myMap = new HashMap<Character, Integer>();
    	for(int i=0;i<=J.length()-1;i++){
    		myMap.put(J.charAt(i), 0);
    		
    	}
    	
    	for(int i=0;i<=S.length()-1;i++){
    		if(myMap.containsKey(S.charAt(i))) {
    			countJewels=countJewels+1;
    		}
    	}
    	
	return countJewels;
        
    }
}
