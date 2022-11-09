package com.hcl.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();

		map.put(101, "Smith");
		map.put(103, "Tom");
		map.put(102, "Ford");
		map.put(105, "King");
		map.put(106, "Scott");

		Set<Integer> keys = map.keySet();

		for (Integer k : keys) {

			

			System.out.println(k + "  " + map.get(k));
			
			map.put(107	,"Javeed");	
			
			map.remove(103);

		}

	}

}
