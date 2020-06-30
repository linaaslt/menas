package ernadas.mokymai.menas;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path="/menininkas")
	public @ResponseBody Menininkai getMenininkais1(
			
    		@RequestParam(required=true) Integer id
			) {
		// This returns a JSON or XML with the users
		Optional<Menininkai> op_men = menininkai_repository.findById( id );
		
		Menininkai menininkai1 = new Menininkai();
		
		if ( op_men.isPresent() ) {
			
			menininkai1= op_men.get(); 
		}
		
		return menininkai1;
	}	
	
	@GetMapping(path="/lst-laikytojai")
	public @ResponseBody Iterable<Laikytojai> getAllLaikytojai() {
		// This returns a JSON or XML with the users
		return laikytojai_repository.findAll();
	}
	
	@GetMapping(path="/laikytojas")
	public @ResponseBody Laikytojai getLaikytojai1(
			
    		@RequestParam(required=true) Integer id
			) {
		// This returns a JSON or XML with the users
		Optional<Laikytojai> op_men = laikytojai_repository.findById( id );
		
		Laikytojai laikytojai1 = new Laikytojai();
		
		if ( op_men.isPresent() ) {
			
			laikytojai1= op_men.get(); 
		}
		
		return laikytojai1;
	}	
}
