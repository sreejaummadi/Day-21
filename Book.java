package com.codegnan.oopexamples;

public class Book {
	String title;
	String author;
	boolean isAvailable;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	public void borrowBook() {
		if(isAvailable) {
			isAvailable=false;
			System.out.println(title+"Has been borrowed");
		}else {
			System.out.println(title+" is alredy borrowed . Not available");
		}
	}
	public void returnBook() {
		if(!isAvailable) {
			isAvailable=true;
			System.out.println(title+"has been returned");
		}else {
			System.out.println(title+"was not borrowed cannot return");
		}
	}
	public void displayinfo() {
		System.out.println("Title of the book "+title);
		System.out.println("Author of the book "+author);
		System.out.println("Availability Status"+(isAvailable? "yes":"No"));
		
	}

}
