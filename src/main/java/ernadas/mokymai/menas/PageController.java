package ernadas.mokymai.menas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@Autowired
	private MenininkaiRepository menininkai_repository;
	
	 @RequestMapping("/menininkai")
	    public String menininkai(
	    		@RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String metai_gimimo
	    		, @RequestParam(required=false) String tautybe
	    		, @RequestParam(required=false) String apras
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		 	if ( irasas != null ) {
		 		
		 		Menininkai kurejai = new Menininkai( pav, metai_gimimo, tautybe, apras );
		 	
		 		
		 		if ( irasas.equals ( "papildyti" ) ) {
		 			
		 			menininkai_repository.save( kurejai );
		 		}
		 		
		 	}
	    	
	    	model.addAttribute("menininkai", menininkai_repository.findAll() );
	        model.addAttribute("lst_menu", Menu.values() );    	
	        return "menininkai";
	    }	
}
