package com.hcl.stringdemo;

public class StringImmutable {

	public static void main(String[] args) {


		
		String s1 = "java";
		
		System.out.println(s1);
		
		String s2 = "lang";
		
		s1  = s1.concat(s2); // java+lang

		System.out.println(s1);
		
		s1 = s1 + "programming";
		
		
	}

}
