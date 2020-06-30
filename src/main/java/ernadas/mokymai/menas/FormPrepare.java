package ernadas.mokymai.menas;

public class FormPrepare {
	
	public static Integer IntegerOrNull ( String from ) {
		

		Integer val = null;
		
		if ( ( from != null ) &&  ( ! from.trim().equals( "" ) ) ) {
			
			val = Integer.parseInt( from );
		}
		
		return val;
	}
	
	public static Integer TakeId ( String id ) {
		

		Integer val = null;
		
		if ( ( id != null ) &&  ( ! id.trim().equals( "" ) ) && ( ! id.trim().equals( "0" ) ) ) {
			
			val = Integer.parseInt( id );
		}
		
		return val;
	}	

}
