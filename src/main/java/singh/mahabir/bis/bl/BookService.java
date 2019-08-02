/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.bis.bl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import singh.mahabir.bis.dl.BookRepository;
import singh.mahabir.bis.dl.model.BookEntity;
import singh.mahabir.bis.exception.BookNotFoundException;
import singh.mahabir.bis.sl.model.Book;
import singh.mahabir.bis.sl.model.Books;

/**
 * Service Layer implementation
 * 
 * @author Mahabir Singh
 *
 */
@Service
public class BookService implements IBookService {

	@Autowired
	private BookRepository bookrepository;

	@Override
	public BookEntity saveBookDetails(Book book) {
		BookEntity entity = createBookEntityUsingBook(book);
		return bookrepository.save(entity);
	}

	@Override
	public Book updateBookDetails(Book book) {
		BookEntity entity = checkBookEntityForBookId(book.getBookId());
		bookrepository.save(updateBookEntityUsingBook(book, entity));
		return book;
	}

	@Override
	public Integer getCounts() {
		return (int) bookrepository.count();
	}

	@Override
	public Books getAll() {
		Books books = new Books();
		bookrepository.findAll().forEach(book -> {
			books.getBook().add(createBookUsingBookEntity(book));
		});
		return books;
	}

	@Override
	public Book getBookDetails(String bookId) {
		BookEntity findByBookId = checkBookEntityForBookId(bookId);
		return createBookUsingBookEntity(findByBookId);
	}

	private BookEntity createBookEntityUsingBook(Book book) {
		BookEntity entity = new BookEntity();
		entity.setAuthor(book.getAuthor());
		entity.setBookId(book.getBookId());
		entity.setDesc(book.getDesc());
		entity.setName(book.getName());
		entity.setLaunchedDate(java.sql.Date.valueOf(book.getLaunchedDate()));
		return entity;
	}

	private Book createBookUsingBookEntity(BookEntity entity) {
		Book book = new Book();
		book.setAuthor(entity.getAuthor());
		book.setBookId(entity.getBookId());
		book.setDesc(entity.getDesc());
		book.setName(entity.getName());

		// new way to convert java.sql.Date to java.time.LocalDate
		book.setLaunchedDate(new java.sql.Date(entity.getLaunchedDate().getTime()).toLocalDate());


//		convert java.util.Date to java.time.LocalDateTime
//		new java.sql.Timestamp(entity.getLaunchedDate().getTime()).toLocalDateTime();

//		new way to convert java.util.Date to java.time.LocalDateTime
//		entity.getLaunchedDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		return book;
	}

	private BookEntity updateBookEntityUsingBook(Book book, BookEntity entity) {
		entity.setAuthor(book.getAuthor());
		entity.setBookId(book.getBookId());
		entity.setDesc(book.getDesc());
		entity.setName(book.getName());
		entity.setLaunchedDate(Date.valueOf(book.getLaunchedDate()));
		return entity;
	}

	private BookEntity checkBookEntityForBookId(String bookId) {
		BookEntity entity = bookrepository.findByBookId(bookId);
		if (entity == null) {
			throw new BookNotFoundException("Book Not Found with bookId = " + bookId);
		}
		return entity;
	}
}
