package com.cg.service;

import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.enetitie.Book;

public class BookServiceImpl implements Bookservice {
	private BookDao dao;
	public BookServiceImpl() {
		dao = new BookDaoImpl(); 
	}


	@Override
	public Book getBookById(int Id) {
		// TODO Auto-generated method stub
		return dao.getBookById(Id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.getBookByAuthor(author);
	}

	@Override
	public List<Book> getBookInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookInPriceRange(low, high);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}
	
	

}
