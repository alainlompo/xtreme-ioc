package org.hypernovae.apis.domain;

import java.math.BigDecimal;

public class Book extends OrderItem {
	private String title;
	private int yearPublished;
	private String author;
	
	private String publisher;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Book(String title, int yearPublished, String author,
			BigDecimal price, String publisher) {
		super(price);
		this.title = title;
		this.yearPublished = yearPublished;
		this.author = author;
		this.publisher = publisher;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(BigDecimal price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	
}
