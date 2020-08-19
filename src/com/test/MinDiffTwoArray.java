package com.test;

public class MinDiffTwoArray {
	public static void main(String[] args) {
		
		int a[] = {6,11,16,19,32,40};
		int b[] = {1,14,29,39};
		
		int asize = a.length;
		int bsize =b.length;
		int min =Integer.MAX_VALUE;
		int min1=0;
		int min2=0;
		int i=0,j=0;
		int diff;
		while(i<asize && j<bsize) {
			
			diff = Math.abs(a[i]-b[j]);
			
			if(diff<min) {
				min = diff;
				min1 = a[i];
				min2 =b[j];
			}
			
			if(a[i] >b[j]) {
				j++;
			} else {
				i++;
			}
		}
		
		System.out.println( "min pair ("+min1+","+min2+")");
		
		
	}

}
