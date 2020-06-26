package ernadas.mokymai.menas;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@Autowired
	private MenininkaiRepository menininkai_repository;
	@Autowired
	private LaikytojaiRepository laikytojai_repository;
	@Autowired
	private KuriniaiRepository kuriniai_repository;
	
	@Autowired 
	EntityManagerFactory  emf;		
	
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
	 
	 @RequestMapping("/laikytojai")
	    public String laikytojai(
	    		@RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String valstybe
	    		, @RequestParam(required=false) String kryptis_meno
	    		, @RequestParam(required=false) String miestas
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
			 if ( irasas != null ) { 	
			 		
			 		Laikytojai laikytojas = new Laikytojai( pav, valstybe, kryptis_meno, miestas );
			 		System.out.println ( pav + " " + miestas + " " + kryptis_meno + " " + valstybe );
			 		System.out.println( laikytojas.toString() );
			 		
			 		if ( irasas.equals ( "papildyti" ) ) {
			 			
			 			laikytojai_repository.save( laikytojas );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("laikytojai", laikytojai_repository.findAll() );
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "laikytojai";
	 }
	 
	 @RequestMapping("/menininkas")
	    public String kuriniaiMenininko(
	    		@RequestParam(required=false) Integer id
	    		, @RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String technika	
	    		, @RequestParam(required=false) String rusis	    		
	    		, @RequestParam(required=false) String metai_sukurimo
	    		, @RequestParam(required=false) String kaina
	    		, @RequestParam(required=false) String id_laikytojai
	    		, @RequestParam(required=false) String id_menininko
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		
			 if ( irasas != null ) {
			 		
			 		Kuriniai kurinys = new Kuriniai ( pav, technika, rusis, FormPrepare.IntegerOrNull ( metai_sukurimo ), FormPrepare.IntegerOrNull( kaina ), FormPrepare.IntegerOrNull( id_laikytojai ),  FormPrepare.IntegerOrNull(  id_menininko ) ); 				
			 		 		
			 		if ( irasas.equals ( "papildyti" ) ) {
			 			
			 			kuriniai_repository.save( kurinys );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("kuriniai", kuriniai_repository.findByIdMenininkai( id/*, emf */ ) );
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "kuriniai";
	 }	 
	 
	 @RequestMapping("/kuriniai")
	    public String kuriniai(
	    		@RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String technika	
	    		, @RequestParam(required=false) String rusis	    		
	    		, @RequestParam(required=false) String metai_sukurimo
	    		, @RequestParam(required=false) String kaina
	    		, @RequestParam(required=false) String id_laikytojai
	    		, @RequestParam(required=false) String id_menininko
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		
			 if ( irasas != null ) {
			 		
			 		Kuriniai kurinys = new Kuriniai ( pav, technika, rusis, FormPrepare.IntegerOrNull ( metai_sukurimo ), FormPrepare.IntegerOrNull( kaina ), FormPrepare.IntegerOrNull( id_laikytojai ),  FormPrepare.IntegerOrNull(  id_menininko ) ); 				
			 		 		
			 		if ( irasas.equals ( "papildyti" ) ) {
			 			
			 			kuriniai_repository.save( kurinys );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("kuriniai", kuriniai_repository.findAll() );
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "kuriniai";
	 }
}
