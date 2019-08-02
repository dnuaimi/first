package com.dnuaimi.demorest.dao;

import java.util.ArrayList;
import java.util.List;

import com.dnuaimi.demorest.model.Book;

public class BookRepos {
	List<Book> storeBook;

	public BookRepos() {
		storeBook=new ArrayList<Book>();
		Book b1=new Book();
		b1.setId(1);
		b1.setName("java");
		storeBook.add(b1);
		
		Book b2=new Book();
		b2.setId(2);
		b2.setName("C++");
		storeBook.add(b2);
	}
	
	public List<Book> getBooks(){
		return storeBook;
	}

	public Book getBook(int id) {
		for(Book b:storeBook)
			if (b.getId()==id)
				return b;
		
				return null;
	}

	public Book addBook(Book b) {
		storeBook.add(b);
		System.out.println("in add method :"+b);
		return b;
	}
	

}
