package com.fsc_LargestPerimeterTriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {
	public static void main(String args[]) {
		int[] nums = {1,2,1,10,4,3};
		//int[] nums = {1,2,1};
		Arrays.sort(nums);
		
		for(int i=nums.length-3;i>=0;i--)
        {
			if((nums[i]+nums[i+1]) > nums[i+2] ) {
				System.out.println(nums[i]+nums[i+1]+nums[i+2]);
				break;
			}else {
				System.out.println(0);
			}
        }
	}

}
