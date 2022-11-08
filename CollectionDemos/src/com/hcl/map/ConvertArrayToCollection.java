package com.hcl.map;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {

static	Book books[] = new Book[4];
	
	public static void main(String[] args) {
		
		Book book1 = new Book(102, "C++", 500.0);
		Book book2 = new Book(101, "Let Us C", 400.0);
		Book book3 = new Book(104, "Java Black Book", 600.0);
		Book book4 = new Book(103, "Python", 200.0);
		
		
		
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;
		
		
		
		
	
		
		
		
		
		
		
	}
	
	
	public List<Book>  getAllBooks() {
		
		
		List<Book> bookList =	Arrays.asList(books);
		
		return  bookList;
		
		
	}
	
	
	
	
}
