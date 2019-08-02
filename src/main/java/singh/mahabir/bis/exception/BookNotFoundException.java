/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.bis.exception;

import singh.mahabir.bis.dl.model.BookEntity;

/**
 * BookNotFoundException class used when {@link BookEntity} BookEntity not fount
 * in data base
 * 
 * @author Mahabir Singh
 *
 */
//@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BookNotFoundException() {
	}

	public BookNotFoundException(String message) {
		super(message);
	}

	public BookNotFoundException(Throwable cause) {
		super(cause);
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
