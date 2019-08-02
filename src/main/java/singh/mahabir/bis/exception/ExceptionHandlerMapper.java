/**
 * Copyright 2019. All rights reserved.
 */

package singh.mahabir.bis.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * This is the class where we can handle any exception thrown by our application
 * and we can re-send the appropriate response to consumer.
 * 
 * You can extends your class from extends ResponseEntityExceptionHandler
 * 
 * @ControllerAdvice annotation makes this class registered with spring
 *                   framework
 *
 * @author Mahabir Singh
 *
 */
@ControllerAdvice
public class ExceptionHandlerMapper {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ApiError> bookNotFoundException(BookNotFoundException ex, HttpServletRequest request) {
		final ApiError error = new ApiError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND,
				ex.getMessage(), ex.toString(),request.getRequestURI());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

	@ExceptionHandler(DataAccessException.class)
	public ResponseEntity<ApiError> springJpaExceptionHandler(DataAccessException ex,HttpServletRequest request) {
		final ApiError error = new ApiError(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(),
				HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(), ex.toString(), request.getRequestURI());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> genericExceptionHandler(Exception ex, HttpServletRequest request) {
		final ApiError error = new ApiError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND, ex.getMessage(), ex.toString(), request.getRequestURI());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

}
