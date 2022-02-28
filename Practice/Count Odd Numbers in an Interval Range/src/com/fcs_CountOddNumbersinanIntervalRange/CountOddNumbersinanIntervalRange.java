package com.fcs_CountOddNumbersinanIntervalRange;

public class CountOddNumbersinanIntervalRange {

	public static void main(String args[]) {
		
		int low = 3;
		int high = 7;
		
		int val = high-low;
       int result = high%2!=0 || low%2!=0 ?(val/2)+1:(val/2);
       System.out.println(result);
		
		
	}
}
