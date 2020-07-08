package ernadas.mokymai.menas;

public class FormPrepare {
	
	public static Integer integerOrNull ( String from ) {
		

		Integer val = null;
		
		if ( ( from != null ) &&  ( ! from.trim().equals( "" ) ) ) {
			
			val = Integer.parseInt( from );
		}
		
		return val;
	}	
	
	public static Double doubleOrNull ( String from ) {
		

		Double val = null;
		
		if ( ( from != null ) &&  ( ! from.trim().equals( "" ) ) ) {
			
			val = Double.parseDouble( from );
		}
		
		return val;
	}	
	
	public static Integer takeId ( String id ) {
		

		Integer val = null;
		
		if ( ( id != null ) &&  ( ! id.trim().equals( "" ) ) && ( ! id.trim().equals( "0" ) ) ) {
			
			val = Integer.parseInt( id );
		}
		
		return val;
	}	

}
