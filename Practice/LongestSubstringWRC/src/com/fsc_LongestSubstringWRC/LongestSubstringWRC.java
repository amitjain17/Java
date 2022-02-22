package com.fsc_LongestSubstringWRC;

import java.util.HashMap;



//Given a string s, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


public class LongestSubstringWRC {
	public static void main(String args[]) {
		
		//String s = "pwwkew";
		//String s = "bbbbb";
		//String s = "abcabcbb";
		//String s = " ";
		String s = "dvdf";
		int count = 0;
		int newCount = 0;
		HashMap<Character,Integer> ans = new HashMap<>();
        
        for(int i = 0; i<s.length();i++)
        {
             if(ans.containsKey(s.charAt(i)))
             { 
                 i = (ans.get(s.charAt(i)));
                 count = 0;
                 ans.clear();           
             }
            else {
                ans.put(s.charAt(i),i);
                count++;
                System.out.println(ans);

            }
            if(count > newCount)
            {
                newCount = count;
            }
        }
        System.out.println(newCount);
	}

}
