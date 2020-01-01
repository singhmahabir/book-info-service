/**
 *
 */
package singh.mahabir.bis.zipkin;

import java.util.Hashtable;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahabir Singh
 *
 */
@RestController
public class CustomerContactDetails {

    @GetMapping(value = "/customer/{cid}/contactdetails")
    public @ResponseBody String getCustomerContactDetails(@PathVariable Integer cid) throws InterruptedException {

	// add arbitrary latency
	final Random r = new Random();
	final int multiplier = r.nextInt(5) * 1000;
	System.out.println("multiplier: " + multiplier);
	Thread.sleep(multiplier);

	final Hashtable<Integer, String> customers = new Hashtable<>();
	customers.put(100, "Beverly Goldberg");
	customers.put(101, "Dave Kim");
	customers.put(102, "Lainey Lewis");

	final String result = customers.get(cid);

	return result;
    }
}
