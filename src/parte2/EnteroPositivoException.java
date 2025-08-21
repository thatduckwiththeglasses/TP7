package parte2;

public class EnteroPositivoException extends Exception {

	public static final int ERR_ENTERO_NULL = 0;
	public static final int ERR_ENTERO_NEGATIVO = 1;
	
	private static final String[] Errores = {
			"no puede ser null", 
			"no puede ser negativo."
			} ;
	
	private String name;
	
	public EnteroPositivoException(String nom){ name = nom; }
	
	public EnteroPositivoException(int numError){ name = Errores[numError] ; }
	
	public String toString() { return "ERROR STRING :"+name; }
}
