package com.fsc_CountingBits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingBits {
	public static void main(String args[]) {
		
		int n =-3;
		int count = 0;
        String b_val = Integer.toBinaryString(n);
        List<String> list = new ArrayList<>(Arrays.asList(b_val.split("")));
        
        
        for(int i=0;i<list.size();i++) {
        	if(list.get(i).equals("1")) {
        		count += 1;
        	}
        }	
        System.out.println(count);

	}

}
