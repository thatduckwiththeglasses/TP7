package parte1;

import java.util.*;

public class MatrizObjetos {
	
	static int max_rows = 200;
	static int max_cols = 200;
	
	private Vector cuerpo[];
	
	MatrizObjetos(int columnas, int filas) throws MatrizException {
		if (columnas > max_cols) {
			throw new MatrizException(4);
		} else if (filas > max_rows){
			throw new MatrizException(3);
		} else {
			cuerpo = new Vector[filas];
			for(int i=0; i<filas; i++) cuerpo[i]= new Vector(2);
			}
	}
	
	public void SetRowCol(int row, int col, Object obj) throws MatrizException {
		
		if ((row < 0) || (col < 0)) {
			throw new MatrizException(3);
		}else
			cuerpo[row].add(col,obj);
		
		
	}
	
	public Object GetRowCol(int row, int col){
		
		Object obj = new Object();
		
		obj = cuerpo[row].elementAt(col);
		return obj;
	}
		
	public String toString(){
		String staux = new String("");
		for(int i=0;i<cuerpo.length;i++)
			for(int j=0;j< cuerpo[i].size();j++){
				staux = staux + cuerpo[i].elementAt(j);
			}
			return staux;
		}

}
