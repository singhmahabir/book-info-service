/**
 * Copyright 2019 Mahabir Singh. All rights reserved.
 */

package singh.mahabir.bis.dl;

import org.springframework.data.jpa.repository.JpaRepository;

import singh.mahabir.bis.dl.model.BookEntity;

/**
 * BookRepository represents the database layer of BookEntity
 * 
 * @author Mahabir Singh
 *
 */
public interface BookRepository extends JpaRepository<BookEntity, Long> {

	/**
	 * It will retrieve the {@link BookEntity} BookEntity by bookId
	 * 
	 * @param bookId bookId
	 * @return BookEntity
	 */
	BookEntity findByBookId(String bookId);

}
