package com.codegnan.oopexamples;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("Java Programming","James Gosling");
		Book book2=new Book("Python","Guido von");
		System.out.println("Initial Book Information");
		book1.displayinfo();
		System.out.println("Borrowing Operations");
	}

}
