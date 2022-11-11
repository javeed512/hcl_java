package com.hcl.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {

	public static void main(String[] args) {
		
	
		List<Number>  list = new ArrayList<Number>();
		
				list.add(101);
				list.add(4.555);
				list.add(19999L);
				list.add(3.232f);
				
				Iterator<Number> it =	list.iterator();
				
				
				while (it.hasNext()) {
					Number n = it.next();
					
					System.out.println(n);
				}
				
				
				
	}

}
