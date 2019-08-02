package singh.mahabir.bis.sl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.bis.bl.IBookService;
import singh.mahabir.bis.sl.model.Book;
import singh.mahabir.bis.sl.model.Books;

/**
 * Implementation of book info service rest end points
 * 
 * @author MahabirSingh
 *
 */
@RestController
@Slf4j
public class BookInfoServiceEndpoint implements IBookInfoServiceEndpoint {
	
	@Autowired
	private IBookService bookservice;

	@Override
	public ResponseEntity<Book> getBookDetails(@PathVariable String bookId){
		log.info("request came for bookId {}", bookId);
		return new ResponseEntity<>(bookservice.getBookDetails(bookId),
				HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Book> saveBookDetails(Book book) {
		log.info("request for save the book entity");
		bookservice.saveBookDetails(book);
		return ResponseEntity.ok(book);
	}

	@Override
	public ResponseEntity<Book> updateBookDetails(Book book) {
		log.info("request for update the book entity");
		return ResponseEntity.ok(bookservice.updateBookDetails(book));
	}

	@Override
	public ResponseEntity<Books> getAllBookDetails() {
		log.info("request for retrieve all book entitys");
		return ResponseEntity.ok(bookservice.getAll());
	}

	@Override
	public ResponseEntity<Integer> getBooksCounts() {
		log.info("request for number of entry of book in Db");
		return ResponseEntity.ok(bookservice.getCounts());
	}
}
