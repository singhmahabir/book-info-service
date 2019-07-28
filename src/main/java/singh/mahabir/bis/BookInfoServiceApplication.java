package singh.mahabir.bis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main class to start the book info service
 * 
 * @author Mahabir Singh
 *
 */
@SpringBootApplication

/**
 * The below annotation is required to make this application as client of eureka
 * but this annotation is not required when we added the eureka dependency
 */
@EnableDiscoveryClient
public class BookInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoServiceApplication.class, args);
	}

}
