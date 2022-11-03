package com.hcl.exceptions;

public class Main {

	public static void main(String[] args) {

		System.out.println("Open file");
		System.out.println("Read file");
		System.out.println("Process file Data");
		
		try {
			String name = null;
			
			System.out.println(name.length());
			
			
		int result = div(4,4);
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
			System.err.println("Sorry you can't div number by zero");
			
	//System.out.println(e);
		}
		catch (NullPointerException ne) {
			ne.printStackTrace();
			System.err.println("Object is null");
		
		}
		catch (Exception e) {
			
			
			e.printStackTrace();
			System.err.println("something went wrong");
		}
		
		
		finally {
		System.out.println("Close file");
		}
	}

	//@Author: Javeed
	public static int div(int a, int b)throws ArithmeticException{

		return a / b;

	}

}
