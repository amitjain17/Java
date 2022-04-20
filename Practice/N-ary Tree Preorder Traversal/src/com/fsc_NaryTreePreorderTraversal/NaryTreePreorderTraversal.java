package com.fsc_NaryTreePreorderTraversal;


//Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
//
//Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,3,5,6,2,4]

public class NaryTreePreorderTraversal {
	public static void main(String args[]) {
		//int[] nums1 = {4,1,2};
		//int[] nums2 = {1,3,4,2};
		int[] nums1 = {1,3,5,2,4};
		int[] nums2 = {6,5,4,3,2,1,7};		
//		List<Integer> list = new ArrayList<>();
//		for(int e:root) {
//			list.add(e);			
//		}
		int temp = 0;
        int found = 0;
		int[] nums3= new int[nums1.length];
		
        for(int i:nums1){
            int count = 0;
            found = 0;
            for(int j:nums2){ 
                if(i==j){
                    for(int k=count+1;k<=nums2.length;k++){
                    	if(k<nums2.length) {
                    		if(j<nums2[k]){
                                nums3[temp] = nums2[k];
                                temp++;
                                found = 1;
                                break;
                            }
                    	}   
                    }if(found == 0){
                            nums3[temp] = -1;
                            temp++;                          
                    }           
                }
                count++;
            }
        }
		for(int i:nums3) {
			System.out.println(i);
		}	
	}
}
