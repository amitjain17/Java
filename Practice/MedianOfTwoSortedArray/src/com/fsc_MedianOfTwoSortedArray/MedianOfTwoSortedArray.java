package com.fsc_MedianOfTwoSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;



//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

public class MedianOfTwoSortedArray {
	
	public static void main(String args[]) {
		
		int[] num1 = {1,3};
		int[] num2 = {2,3,4,5,6,7,9};
		List<Integer> list = new ArrayList<>();


		List<Integer> num3 = new ArrayList<>(Arrays.stream(num1).boxed().toList());
		List<Integer> num4 = new ArrayList<>(Arrays.stream(num2).boxed().toList());
		
		
		num3.forEach((e)-> num4.add(e));
		num4.sort(null);
		
		int val = num4.size()/2;

		if((num4.size())%2 == 0) {
			double result = (double)(num4.get(val)+num4.get(val-1))/2;
			System.out.println(result);
		}else {
			System.out.println(num4.get(val));
		}
			
				
	}

}
