package com.dnuaimi.demorest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.dnuaimi.demorest.dao.BookRepos;
import com.dnuaimi.demorest.model.Book;

@Path("books")
public class BookControl {
    BookRepos bookRepos=new BookRepos();
    
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Book> getBooks(){
		System.out.println("in book control");
		return bookRepos.getBooks();
	}
	
	
	@GET
	@Path("{id}")
	@Produces({"application/xml", "application/json"})
	public Book getBook(@PathParam("id") int id){
		System.out.println("in book control pass ID");
		return bookRepos.getBook(id);
	}
	
	@POST
	@Consumes({"application/xml", "application/json"})
	public Book addBook(Book b){
		System.out.println("in book control Add");
		return bookRepos.addBook(b);
	}
	
	
}
