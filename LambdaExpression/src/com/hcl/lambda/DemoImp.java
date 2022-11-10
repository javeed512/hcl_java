package com.hcl.lambda;

public class DemoImp implements MyFunctionalInteface{

	public static void main(String[] args) {
		
			MyFunctionalInteface mi =	new DemoImp();
		
			int result =		mi.add(5, 3);
			
				System.out.println(result);
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

}
