package ernadas.mokymai.menas;

public class FormPrepare {
	
	public static Integer IntegerOrNull ( String from ) {
		

		Integer val = null;
		
		if ( ( from != null ) &&  ( ! from.trim().equals( "" ) ) ) {
			
			val = Integer.parseInt( from );
		}
		
		return val;
		
	}

}
