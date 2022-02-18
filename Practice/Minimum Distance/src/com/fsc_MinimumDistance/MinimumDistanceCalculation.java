package com.fsc_MinimumDistance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistanceCalculation {
	
	public void distance(List<Map<String,String>> blocks,List<String> reqs) {
		
		Map<String,Integer> count = new HashMap<>();
		Integer position = 1;
		
			for(Map<String,String> i:blocks) {
				for(String j:reqs) {
					if(i.get(j)!="true") {
						count.put(j,position);
						position++;
					}
			}
				//position = 1;
				System.out.println(count);

				
		}
		
	}

}
