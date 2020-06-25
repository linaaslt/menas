package ernadas.mokymai.menas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/ajax") // This means URL's start with /demo (after Application path)
public class AjaxController {

	// @Autowired
	// private LaikytojaiRepository laikytojai_repository; 
	
	@Autowired
	private MenininkaiRepository menininkai_repository; 
	
	@Autowired
	private LaikytojaiRepository laikytojai_repository; 
	
	
	@GetMapping(path="/lst-menininkai")
	public @ResponseBody Iterable<Menininkai> getAllMenininkai() {
		// This returns a JSON or XML with the users
		return menininkai_repository.findAll();
	}
	
	@GetMapping(path="/lst-laikytojai")
	public @ResponseBody Iterable<Laikytojai> getAllLaikytojai() {
		// This returns a JSON or XML with the users
		return laikytojai_repository.findAll();
	}
}
