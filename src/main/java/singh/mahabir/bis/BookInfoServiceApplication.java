package singh.mahabir.bis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class to start the book info service
 * 
 * @author Mahabir Singh
 *
 */
@SpringBootApplication
/**
 * By having "spring-cloud-starter-netflix-eureka-client" on the classpath your
 * application will automatically register with the Eureka Server
 * without @EnableDiscoveryClient
 * 
 * since 1.4.7.RELEASE
 * 
 * Upto 1.3.6.RELEASE we required @EnableDiscoveryClient
 */
//@EnableDiscoveryClient
public class BookInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoServiceApplication.class, args);
	}

}
