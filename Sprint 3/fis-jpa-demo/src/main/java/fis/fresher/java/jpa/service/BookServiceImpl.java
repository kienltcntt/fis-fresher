package fis.fresher.java.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fis.fresher.java.jpa.entity.Book;
import fis.fresher.java.jpa.entity.Story;
import fis.fresher.java.jpa.repository.BookRepository;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {

		Story story = book.getStory();
		story.setBook(book);
		book = bookRepository.save(book);
		return book;

	}

	public Book findByBookId(int bookId) {
		Book book = bookRepository.findByBookId(bookId);
		return book;
	}
}
