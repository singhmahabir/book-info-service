package singh.mahabir.bis.dl.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {@link BookEntity} is a pojo class
 * 
 * @author Mahabir Singh
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Book")
public class BookEntity {

	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true, nullable = false)
	private String bookId;
	private String name;
	private String desc;
	private String author;
	private Date launchedDate;
}
