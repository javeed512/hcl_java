package com.hcl.oops;

public class LocalVarDemo {

		
	 
	public static void main(String[] args) {

			int x = 0;  // local variable
			String s1 = null; // local variable
			
			System.out.println(x);
			System.out.println(s1);
		
		 
			if(true) {
				
				
				int amount = 999;
				
				x = amount;
			}
			
			System.out.println(x);
			
			
		
	}

}
