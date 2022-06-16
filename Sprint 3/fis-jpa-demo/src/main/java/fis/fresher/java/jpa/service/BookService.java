package fis.fresher.java.jpa.service;

import org.springframework.stereotype.Component;

import fis.fresher.java.jpa.entity.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);
	public Book findByBookId(int bookId);
}
