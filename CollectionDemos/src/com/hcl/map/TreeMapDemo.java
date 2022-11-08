package com.hcl.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		
		// K- HashSet , V- List
		Map<Book,String>  map = new  TreeMap<Book,String>(new BookComparator());
		
		
		Book book1 = new Book(102, "C++", 500.0);
		Book book2 = new Book(101, "Let Us C", 400.0);
		Book book3 = new Book(104, "Java Black Book", 600.0);
		Book book4 = new Book(103, "Python", 200.0);
		

		
		
		
			map.put(book1, "Tom");
			map.put(book2, "Smith");
			map.put(book3, "Javeed");
			map.put(book4, "Anil");
		
			System.out.println(map);
			
		Set<Book> keys =	map.keySet();
			
				for (Book book : keys) {
					
					System.out.println(book +" "+map.get(book) );
					
					
				}
			
		
	}

}
