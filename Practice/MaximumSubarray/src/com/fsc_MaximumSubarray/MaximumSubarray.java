package com.fsc_MaximumSubarray;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


/*Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [5,4,-1,7,8]
Output: 23
*/
 

public class MaximumSubarray {
	
	public static void main(String args[]) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		//int nums[]  = {5,4,-1,7,8};
		//int[] nums = {-2,1};
		//int[] nums = {-2,-1};
		int value;
		Double max_value;

		/* Brut Force Approch
		int array_max_value = Arrays.stream(nums).max().getAsInt();
		max_value = array_max_value;
		if(nums.length>1) {
			for(int i=0 ; i<nums.length;i++) {
				value = nums[i];
				for(int j=i+1;j<nums.length;j++) {
					value = value + nums[j];
					if(value>max_value ) {
						max_value = value;
					}
				}
			}	
				System.out.println(max_value);
		}else {
			System.out.println(nums[0]);
		}
	}*/
	        int local_max = 0;
	        Double global_max = Double.NEGATIVE_INFINITY;
	        
	        for(int i = 0 ; i<nums.length;i++){		
	            if(nums[i]>nums[i]+local_max){		
	                local_max = nums[i];
	            }
	            else{
	                local_max = nums[i]+local_max;  
	            }
	            if(local_max>global_max){
	                global_max = Double.valueOf(local_max);
	            }                
	        }
	    System.out.println((int)Math.round(global_max));

	}
}
