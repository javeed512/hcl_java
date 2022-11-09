package com.hcl.map;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {

			String s1 = b1.getBookId() +"";
			String s2 = b2.getBookId() +"";
		
		
		
		return s1.compareTo(s2);  // keep - minus sign to reverse sorting
	}

}
