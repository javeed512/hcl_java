package com.hcl.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
			
		// Map<K,V>  // K- HashSet , v- list
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		
		// K- LinkedHashSet ,  V- List
		//Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		
		// K- TreeSet , V-List
		//Map<Integer,String> map = new TreeMap<Integer,String>();
		
		
		
			map.put(3,"Three");
			map.put(5,"Five");
			map.put(2, "Two");
			map.put(1,"One");
			map.put(3, "Three again");
			map.put(6, "One");
			
			
			
			
			System.out.println(map);
			
		
			
			
			
			
		
	}

}
