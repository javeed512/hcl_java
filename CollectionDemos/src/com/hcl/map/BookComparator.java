package com.hcl.map;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {

			String s1 = b1.getBookName();
			String s2 = b2.getBookName();
		
		
		
		return s1.compareTo(s2);
	}

}
