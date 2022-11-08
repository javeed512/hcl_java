package com.hcl.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	
	
	
	public static void main(String[] args) {


		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println(set.add(11));  //1236 hc
		set.add(44);
		set.add(33);  //1234 hc
		set.add(77);   //  insertion order is based on hashcode of elements
		set.add(22); //1235 hc
		//set.add(null);
		System.out.println(set.add(11));
		
		System.out.println(set);
		
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		set2.add(4);
		set2.add(3); 
		set2.add(7);
		set2.add(2); // insertion order is preserved
		set2.add(1);
		set2.add(3); 
		
		System.out.println(set2);
		
		
		for (Integer i : set2) {
			System.out.println(i);
		}
		
		
		
		
		Set<Integer>  set3 = new TreeSet<Integer>();
		
		set3.add(104);
		set3.add(102);
		set3.add(105);
		set3.add(101);
		set3.add(103);
		set3.add(100);
		
		System.out.println(set3);
		
		
		
		
	}

}
