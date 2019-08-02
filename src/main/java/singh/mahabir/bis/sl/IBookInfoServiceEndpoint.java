package singh.mahabir.bis.sl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import singh.mahabir.bis.sl.model.Book;
import singh.mahabir.bis.sl.model.Books;

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
	@GetMapping(path = "/book/{bookId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Book> getBookDetails(@PathVariable String bookId);

	/**
	 * Returns the all books in the application
	 * 
	 * @return {@link Books}
	 */
	@GetMapping(path = "/books", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Books> getAllBookDetails();

	/**
	 * Return all number of entry in database
	 * 
	 * @return {@link Books}
	 */
	@GetMapping(path = "/book/count", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Integer> getBooksCounts();

	/**
	 * Method to create a record in database
	 * 
	 * @param book {@link Book} Book
	 * @return {@link Book}
	 */
	@PostMapping(path = "/book", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Book> saveBookDetails(@RequestBody Book book);

	/**
	 * Method to update the record in database
	 * 
	 * @param bookId {@link Book} Book
	 * @return {@link Book}
	 */
	@PutMapping(path = "/book", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Book> updateBookDetails(@RequestBody Book book);
}
