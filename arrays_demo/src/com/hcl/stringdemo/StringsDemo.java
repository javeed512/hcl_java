package com.hcl.stringdemo;

public class StringsDemo  extends Object {
	
	
	public static void main(String[] args) {
		
		
		Object o1 = new Object(); 
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(o1.equals(o2));
		
		
		
		String str1 = "java"; // string object
		
		String str3 = "java";
		
		System.out.println("scp data compare "+str1.equals(str3));
		
		System.out.println(str1 == str3);
		
		
		String str2 = new String("java"); //@123
		String str4 = new String("JAVA"); //@9876
		
		System.out.println("compare data "+str2.equalsIgnoreCase(str4));
		
		System.out.println("compare hashcode/ref ");
		System.out.println( str2 == str4);
		
		
		System.out.println(str1.concat(str3));
		
		
		String s1 = "B"; // 66
		String s2 = "A"; // 65
		
		System.out.println(s1.compareTo(s2)); //  1
		
		
		
	}
	

}
