package com.fsc_largestElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		int arr[] = {4,2,9,7,5,6,7,1,3};
		
		List<Integer> val = new ArrayList<>();
		for(int j: arr) {
			val.add(j);
		}
		
		//Sorting Using Collections
		Collections.sort(val);
		//Reverse the List
		Collections.reverse(val);
		
		//Print Each List Items
		for(int p:val) {
			System.out.println(p);	
		}	
		//Print All Values in a list
		System.out.println(val);
	}

}
