/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.bis.bl;

import singh.mahabir.bis.dl.model.BookEntity;
import singh.mahabir.bis.sl.model.Book;
import singh.mahabir.bis.sl.model.Books;

/**
 * It is service layer of 'Book info service'
 * 
 * @author Mahabir Singh
 *
 */
public interface IBookService {

	/**
	 * It will store the {@link BookEntity} BookEntity using {@link Book} Book
	 * 
	 * into database
	 * 
	 * @param book book
	 * @return {@link BookEntity} BookEntity
	 */
	BookEntity saveBookDetails(Book book);

	/**
	 * It will update the {@link BookEntity} BookEntity using {@link Book} Book
	 * 
	 * into database
	 * 
	 * @param book book
	 * @return {@link Book}
	 */
	Book updateBookDetails(Book book);

	/**
	 * It will return the number of entry in data base
	 * 
	 * @return {@link Integer}
	 */
	Integer getCounts();

	/**
	 * It will return all the entry from data base
	 * 
	 * @return {@link Books}
	 */
	Books getAll();

	/**
	 * It will return the {@link Book} Book from data base based on bookId
	 * 
	 * @param bookId bookId
	 * @return {@link Book}
	 */
	Book getBookDetails(String bookId);

}
