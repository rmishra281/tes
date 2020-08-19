package com.test;

public class MinDiffrence {

	public static void main(String[] args) {
		
		int a[] = {1,5,9,14,18,22,25};
		int b[] = {3,12,16,21,23};
		int asize = a.length;
		int bsize= b.length;
		int lsize= asize>bsize? asize:bsize;
		int prev = 0;
		int min =0;
		boolean isA = false;
		for( int i =0 ;i<lsize; i++) {
			if(i< bsize) {
			if(i==0) {
				if(a[i]>b[i]) {
					prev=a[i];
					min=a[i]-b[i];
					isA= true;
				} else {
					prev =b[i];
					min=b[i]-a[i];
				}
			} else {
				
				if(a[i]>b[i]) {
				  if(isA && min > b[i]- prev ) {
					  if(prev>b[i]) {
						   min = prev -b[i];
						 } else {
							 min = b[i]-prev;
						 }
				   }
				   prev=a[i];
				  
				 if(min>a[i]-b[i]) {
					min = a[i]-b[i];
				 }
					
					isA= true;
				} else {
					 if(!isA && min >  a[i]- prev ) {
						 if(prev>a[i]) {
						   min = prev- a[i];
						 } else {
							 min = a[i]-prev;
						 }
					   }
					   prev=b[i];
					  
					 if(min>b[i]-a[i]) {
						min = b[i]-a[i];
					 }
						
						isA= false;
				}
				
			}
			
			
		}
		}
		System.out.println(min);
		
	}
}
