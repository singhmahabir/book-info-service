package singh.mahabir.bis.sl.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * {@link Books} is response class
 * 
 * @author Mahabir Singh
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	private List<Book> book = new ArrayList<>();
}
