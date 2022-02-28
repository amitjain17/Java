package com.fsc_AverageSalaryExcludingtheMinimumandMaximumSalary;

import java.util.Arrays;



public class AverageSalaryExcludingtheMinimumandMaximumSalary {

	public static void main(String args[]) {
		System.out.println(System.currentTimeMillis());
		int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

		int sum = Arrays.stream(salary).reduce((int x,int y)-> x+y).getAsInt();
		int max = Arrays.stream(salary).max().getAsInt();
		int min = Arrays.stream(salary).min().getAsInt();
		Integer.M
		int size = salary.length;
		Double avg =  ((double)(sum-(max+min))/(size-2));
		System.out.println(avg);	
		System.out.println(System.currentTimeMillis());
	}
}
