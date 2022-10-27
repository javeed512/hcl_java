package com.hcl.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {


		int arr[] = new int[5];
		
		arr[0] = 111;
		arr[1] = 222;
		arr[2] = 333;
		
		System.out.println(arr);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
		int ar[][] = new int[3][2];
		
		System.out.println(ar); // 2D
		
		System.out.println(ar[0]); // 1-D
		System.out.println(ar[1]); // 1-D
		System.out.println(ar[2]); // 1-D
		
		ar[0][0] = 77;
		
		
		System.out.println(ar[0][0]);
		
		ar[2][0] = 99;
		
		System.out.println(ar[2][0]);
		
		
		String names[] = {"king","tom","smith","ford"};
		
		for (String name : names) {
		
			System.out.println(name);
			
		}
		
		
		
		
		
		

	}

}
