package com.hcl.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//StringBuffer(mutli-threading) or StringBuilder(synchronized /thread safe)
		
		// Mutable in nature
		
		StringBuffer sb1 = new StringBuffer("java");
		
		System.out.println(sb1.delete(0, 1));
		
		StringBuffer sb2 = new StringBuffer("lang");
		
		System.out.println(sb1);
		
			sb1.append(sb2);
			
			System.out.println(sb1);
		
		
			String str = sb1.toString();
			
			System.out.println(sb1.reverse());
			System.out.println(sb1.delete(1, 4));
			
		
	}

}
