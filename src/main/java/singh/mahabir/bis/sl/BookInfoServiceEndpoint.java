package singh.mahabir.bis.sl;


import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import singh.mahabir.bis.sl.model.Book;

/**
 * Implementation of book info service rest end points
 * 
 * @author MahabirSingh
 *
 */
@RestController
@Slf4j
public class BookInfoServiceEndpoint implements IBookInfoServiceEndpoint {
	
	@Override
	public ResponseEntity<Book> getMoviesDetails(@PathVariable String bookId){
		log.info("request came for bookId {}", bookId);
		if (bookId.contentEquals("1234")) {
		return new ResponseEntity<>(
				new Book(bookId, "Head First",
						"Head First is a series of introductory instructional books to many topics",
						"O’Reilly Media, Inc., Kathy Sierra, Jonathan ",
						LocalDate.of(2009, 6, 15)),
				HttpStatus.OK);
		}
		return ResponseEntity.ok(new Book(bookId, "Half Girlfriend",
				"Half Girlfriend is an Indian English coming of age, young adult romance novel by Indian author Chetan Bhagat",
				"Chetan Bhagat", LocalDate.of(2014, 10, 15)));
	}
}
