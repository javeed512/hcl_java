package com.hcl.lambda;

@FunctionalInterface
public interface MyFunctionalInteface {
	
		public int  add(int a, int b);
		
		
		public static void m1() {
			
			System.out.println("static m1() called from interface");
			
		}
		
		

}
