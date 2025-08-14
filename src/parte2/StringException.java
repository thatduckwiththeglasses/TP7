package parte2;

public class StringException extends Exception {
	
	public static final int ERR_NOM_NULL = 0;
	public static final int ERR_NOM_TRESLETRAS = 1;
	
	private static final String[] Errores = {
			"El nombre no puede ser null", 
			"El nombre debe tener mas de 3 letras."
			} ;
	
	private String name;
	
	public StringException(String nom){ name = nom; }
	
	public StringException(int numError){ name = Errores[numError] ; }
	
	public String toString() { return "ERROR STRING :"+name; }
}
