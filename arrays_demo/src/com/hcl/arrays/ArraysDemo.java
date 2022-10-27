package com.hcl.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		int a1[];
		
		int[] a2;
		
		int  []a3;
		
		
		int arr[] = {101,102,103,104,105,106,107};
		
		System.out.println(arr.length);
		
		int len = arr.length;
		
		for(int i=0; i < len;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		for(int x : arr ) {  // for-each loop
			
			System.out.print(x+" ");
			
		}
		
		
		
		
	ArraysDemo arrObj =	new  ArraysDemo();
	
		System.out.println(arrObj);
		
		System.out.println(arr);
		

	}

}
