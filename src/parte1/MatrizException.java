package parte1;

import java.util.*;

public class MatrizException extends Exception {
	
	public static final int ERR_COLUMNAS_EXCEDIDAS = 0;
	public static final int ERR_FILAS_EXCEDIDAS = 1;
	public static final int ERR_DIMENSIONES_EXCEDIDAS = 2;
	public static final int ERR_FILAS_FUERA_DE_RANGO = 3;
	public static final int ERR_COLUMNAS_FUERA_DE_RANGO = 4;
	
	private static final String[] Errores = {
			"El número de columnas excede el máximo permitido", 
			"El número de filas excede el máximo permitido." ,
			"Las dimensiones de la matriz no pueden ser negativas.",
			"El índice de la fila está fuera de rango.",
			"El índice de la columna está fuera de rango."
			} ;
	
	private String name;
	
	public MatrizException(String nom){ name = nom; }
	
	public MatrizException(int numError){ name = Errores[numError] ; }
	
	public String toString() { return "ERROR MATRIZ :"+name; }	
	
}
