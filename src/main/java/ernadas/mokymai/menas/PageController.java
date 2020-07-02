package ernadas.mokymai.menas;

import java.util.Optional;

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
	    		@RequestParam(required=false) String id_men	    		
	    		, @RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String metai_gimimo
	    		, @RequestParam(required=false) String tautybe
	    		, @RequestParam(required=false) String apras
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		 	if ( irasas != null ) {
		 		
		 		Menininkai kurejai = new Menininkai( FormPrepare.takeId ( id_men ), pav, metai_gimimo, tautybe, apras );
		 	
		 		if ( irasas.equals ( "papildyti" ) || irasas.equals( "pakeisti" ) ) {
		 			
		 			menininkai_repository.save( kurejai );
		 		}
		 		
		 	}
	    	
	    	model.addAttribute("menininkai", menininkai_repository.findAll() );
	        model.addAttribute("lst_menu", Menu.values() );    	
	        return "menininkai";
	    }
	 
	 @RequestMapping("/laikytojai")
	    public String laikytojai(
	    		@RequestParam(required=false) String id
	    		, @RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String valstybe
	    		, @RequestParam(required=false) String kryptis_meno
	    		, @RequestParam(required=false) String miestas
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
			 if ( irasas != null ) { 	
			 		
			 		Laikytojai laikytojas = new Laikytojai( FormPrepare.takeId ( id ), pav, valstybe, kryptis_meno, miestas );
			 		System.out.println ( pav + " " + miestas + " " + kryptis_meno + " " + valstybe );
			 		System.out.println( laikytojas.toString() );
			 		
			 		if ( irasas.equals ( "papildyti" ) || irasas.equals( "pakeisti" )) {
			 			
			 			laikytojai_repository.save( laikytojas );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("laikytojai", laikytojai_repository.findAll());
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "laikytojai";
	 }
	 
	 @RequestMapping("/laikytojas")
	    public String laikytojas(
	    		@RequestParam(required=true) String id
	    		, @RequestParam(required=false) String idx	    		
	    		, @RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String technika	
	    		, @RequestParam(required=false) String rusis	    		
	    		, @RequestParam(required=false) String metai_sukurimo
	    		, @RequestParam(required=false) String kaina
	    		, @RequestParam(required=false) String id_menininko
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		 	Integer id_kurinio = FormPrepare.takeId ( idx );
		 	
		 	if ( irasas != null ) {
		 		
		 		System.out.println ( irasas );
		 
				if ( irasas.equals ( "papildyti" ) )  { 	
				 		
				 		Kuriniai kurinys = new Kuriniai ( 
				 				
				 				id_kurinio
				 				, pav
				 				, technika
				 				, rusis
				 				, FormPrepare.integerOrNull ( metai_sukurimo )
				 				, FormPrepare.integerOrNull( kaina )
				 				, FormPrepare.integerOrNull( id )
				 				,  FormPrepare.integerOrNull(  id_menininko ) 
				 		); 	
				 		System.out.println( "naujas: " + kurinys.toString() );
				 		kuriniai_repository.save( kurinys );
				 }
				 		 		
				 if ( irasas.equals ( "pakeisti" ) ) {
				 			
						Optional<Kuriniai> op_men = kuriniai_repository.findById( id_kurinio );
						
						Kuriniai kurinys1 = new Kuriniai();
						
						if ( op_men.isPresent() ) {
							
							kurinys1 = op_men.get(); 
							System.out.println( "pries: " + kurinys1.toString() );
							kurinys1.takeFields ( 
	
					 				pav
					 				, technika
					 				, rusis
					 				, FormPrepare.integerOrNull ( metai_sukurimo )
					 				, FormPrepare.integerOrNull( kaina )
					 				, FormPrepare.integerOrNull( id )
					 				,  FormPrepare.integerOrNull(  id_menininko ) 
					 		); 
							System.out.println( "po: " + kurinys1.toString() );
					 		kuriniai_repository.save( kurinys1 );						
						}				 		
				 }
		 	}
	        model.addAttribute("lst_menu", Menu.values() );
		 	model.addAttribute("kuriniai", kuriniai_repository.findByIdLaikytojai( FormPrepare.takeId ( id ) ) );  
	        return "kuriniai_laikytoju";
	 }
	 
	 @RequestMapping("/menininkas")
	    public String kuriniaiMenininko(
	    		@RequestParam(required=true) String id
	    		, @RequestParam(required=false) String idk	    		
	    		, @RequestParam(required=false) String pav
	    		, @RequestParam(required=false) String technika	
	    		, @RequestParam(required=false) String rusis	    		
	    		, @RequestParam(required=false) String metai_sukurimo
	    		, @RequestParam(required=false) String kaina
	    		, @RequestParam(required=false) String id_laikytojai
	    		, @RequestParam(required=false) String irasas
	    		, Model model 
	    	) {
		 
		
			 if ( irasas != null ) {
			 		
			 		Kuriniai kurinys = new Kuriniai ( 
			 				
			 				FormPrepare.takeId ( idk )
			 				, pav
			 				, technika
			 				, rusis
			 				, FormPrepare.integerOrNull ( metai_sukurimo )
			 				, FormPrepare.integerOrNull( kaina )
			 				, FormPrepare.integerOrNull( id_laikytojai )
			 				,  FormPrepare.integerOrNull(  id ) 
			 		); 				
			 		 		
			 		if ( irasas.equals ( "papildyti" ) ) {
			 			
			 			kuriniai_repository.save( kurinys );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("kuriniai", kuriniai_repository.findByIdMenininkai( FormPrepare.takeId ( id )/*, emf */ ) );
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "kuriniai_menininko";
	 }	 
	 
	 @RequestMapping("/kuriniai")
	    public String kuriniai(
	    		@RequestParam(required=false) String id	    		
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
			 		
			 		Kuriniai kurinys = new Kuriniai ( 
			 				
			 				FormPrepare.takeId ( id )
			 				, pav
			 				, technika
			 				, rusis
			 				, FormPrepare.integerOrNull ( metai_sukurimo )
			 				, FormPrepare.integerOrNull( kaina )
			 				, FormPrepare.integerOrNull( id_laikytojai )
			 				,  FormPrepare.integerOrNull(  id_menininko ) 
			 		); 				
			 		 		
			 		if ( irasas.equals ( "papildyti" ) ) {
			 			
			 			kuriniai_repository.save( kurinys );
			 		}
			 		
			 	}
		 
		 	model.addAttribute("kuriniai", kuriniai_repository.findAll() );
	        model.addAttribute("lst_menu", Menu.values() );  
	        return "kuriniai";
	 }
}
