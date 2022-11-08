package com.hcl.map;

import java.util.Objects;

public class Book {
	
	
	private int bookId;
	private String bookName;
	private double price;
	
	
	
	
	public Book() {
		super();
	}
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(bookName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName);
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
