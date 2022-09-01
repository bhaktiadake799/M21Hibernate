package com.cg.client;

import com.cg.service.BookServiceImpl;
import com.cg.service.Bookservice;

public class client {
	public static void main(String[] args) {
		Bookservice obj = new BookServiceImpl();
		System.out.println("Total No of Books");
		System.out.println("Total Books:  " +obj.getBookCount());
		
		System.out.println("Listing Book with Id");
		System.out.println("Total Books: " +obj.getBookById(109));
		
		System.out.println("Listing All Books");
		System.out.println("Total Books: " +obj.getAllBooks());
		
		System.out.println("Book Written by Nihal");
		System.out.println("Total Books: " +obj.getBookByAuthor("Nikhil"));
		
		System.out.println("Book by Title");
		System.out.println("Total Books: " +obj.getBookByTitle("Java"));
		
		System.out.println("Listing Books between 200 and 500");
		System.out.println("Total Books : " +obj.getBookInPriceRange(250, 300));
		
	}


}
