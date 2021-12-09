package com.book.info.bookinfo.entity;

public class Book {

	private String id;
	private String name;
	private String authorName;
	private float price;

	public Book() {
		
	}

	public Book(String id, String name, String authorName, float price) {
		this.id = id;
		this.name = name;
		this.authorName = authorName;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + ", price=" + price + "]";
	}

}
