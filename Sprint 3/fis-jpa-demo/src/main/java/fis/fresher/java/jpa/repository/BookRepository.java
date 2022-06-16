package fis.fresher.java.jpa.repository;

import java.io.Serializable;
import fis.fresher.java.jpa.entity.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends 
		CrudRepository<Book, Serializable> {
	
	public Book findByBookId(int bookId);//Domain Specification Language (DSL)
}