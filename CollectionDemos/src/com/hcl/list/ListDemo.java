package com.hcl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {


		List<Object>  list =	new ArrayList<Object>();
		
				list.add(50);
				list.add(new String("javeed"));
				list.add(4.99);
				list.add(null);
				list.add(50);
				
				System.out.println(list);
				
				
				for (Object element : list) {
					
					System.out.println(element);
				}				
				
		
		
				List<Integer> list2 = new LinkedList<Integer>();
				
				list2.add(44);
				list2.add(22);
				list2.add(11);
				list2.add(33);
				list2.add(55);
				list2.add(44);
				list2.add(null);
				
				System.out.println(list2);
				
				/*
				 * for (Integer i : list2) { System.out.println(i); }
				 */
				
				
	Iterator<Integer>  it =	list2.iterator(); // XYZImp
				
			while(it.hasNext()) {
				
			Integer i =	it.next();
				
			System.out.println(i);
			}
				
			
			
			/*
			 * ListIterator<Integer> lit = list2.listIterator();
			 * 
			 * lit.next(); lit.next(); lit.next();
			 * 
			 * while(lit.hasPrevious()) {
			 * 
			 * 
			 * Integer j = lit.previous();
			 * 
			 * System.out.println(j); }
			 */
			
			
			
	List<Integer> list3 = new Vector<Integer>();
				
				list3.add(404);
				list3.add(202);
				list3.add(101);
				list3.add(303);
				list3.add(505);
				list3.add(404);
				list3.add(null);
				
				System.out.println(list3);
				
				
				
	Stack<Integer> stack = new Stack<Integer>();// LIFO			
				
				stack.push(101);
				stack.push(102);  
				
				
				System.out.println(stack);
				
				System.out.println(stack.pop());
				//System.out.println(stack.peek());
				
				System.out.println(stack);
				

	}

}
