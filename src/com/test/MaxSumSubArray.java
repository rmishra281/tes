package com.test;

public class MaxSumSubArray {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,-6,5,4,-2,1};
		// 8 15 23 17 19
		// -8 7 15 2 5
		// -8 -1 7 1 4
		// -8
		
		int max =0;
		int b[] = new int [a.length];
		int prev =0;
		for(int num =0; num<a.length; num++) {
		  int sum = a[num]+prev;
			if(sum>=a[num]) {
				b[num] = sum;
			} else {
				b[num] = a[num];
			}
			prev=b[num];
			
		}
		
		for(int bb: b) {
		
			if(max<bb) {
				max = bb;
			}
		
		}
		System.out.println(max);
		
		
	}

}
