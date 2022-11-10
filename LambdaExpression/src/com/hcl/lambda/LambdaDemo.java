package com.hcl.lambda;

public class LambdaDemo {

	public static void main(String[] args) {

		MyFunctionalInteface mi = (x,y) -> x+y; // (int x,int y)-> {return x+y;}
		
		
		// Lambda Exp ()->{ any code or logic}

			
		
		int res = mi.add(5, 5);

		System.out.println(res);

		HelloFunctionalInterface hi = (String name) -> {return name.length();};

		int len = hi.findLength("javeed");

		System.out.println(len);

	}

}
