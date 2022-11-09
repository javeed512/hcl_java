package com.hcl.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		
		List<String>  namesList = new ArrayList<String>();
		
				namesList.add("Dog");
				namesList.add("Cat");
				namesList.add("Ant");
				namesList.add("Bull");
				namesList.add("Cat");
				
				System.out.println(namesList);
		
				Collections.sort(namesList);
				
				System.out.println(namesList);
				
			Collections.reverse(namesList);
			int  index =	Collections.binarySearch(namesList, "Dog");
			
			System.out.println(index);
			
			
			System.out.println("Reverser Order");
			System.out.println(namesList);
				
				
				
		
			 List<Book> list =  getAllBooks();
		
		
			Collections.sort(list,new BookComparator());
		
			System.out.println(list);
			
			Book searchBook = new Book();
					searchBook.setBookId(103);
			
	int  bookIndex =Collections.binarySearch(list,searchBook,new BookComparator());
			
	System.out.println("Book available at index "+bookIndex);
			
			
			
			
		
		
		
	}
	
	
	public static List<Book>  getAllBooks() {
		
		
		List<Book> bookList =	Arrays.asList(books);
		
		return  bookList;
		
		
	}
	
	
	
	
}
