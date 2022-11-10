package com.hcl.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>  list = new ArrayList<Integer>();
		
			list.add(-10);
			list.add(20);
			list.add(-30);
			list.add(40);
			list.add(50);
			
			Predicate<Integer> predicate =	(Integer i)->{return i>0;};
		
					
					for (Integer i : list) {
						
			boolean isPositive =	predicate.test(i);
			
				System.out.println(i + " is positive "+isPositive);
						
					}
				
		
		
		
	}

}
