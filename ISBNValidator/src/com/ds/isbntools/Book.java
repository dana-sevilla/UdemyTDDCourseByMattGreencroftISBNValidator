package com.ds.isbntools;

public class Book {

	public String isbn;
	public String title;
	public String author;
	
	public Book(String isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	
}
