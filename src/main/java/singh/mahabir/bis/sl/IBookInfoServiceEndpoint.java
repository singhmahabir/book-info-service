package singh.mahabir.bis.sl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import singh.mahabir.bis.sl.model.Book;

/**
 * Contains the rest endpoint of book info services
 * 
 * @author Mahabir Singh
 *
 */
public interface IBookInfoServiceEndpoint {

	/**
	 * A generic method which sends the response for any bookId
	 * 
	 * @param bookId bookId
	 * @return {@link Book}
	 */
	@GetMapping(path = "/book/{bookId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Book> getMoviesDetails(@PathVariable String bookId);
}
