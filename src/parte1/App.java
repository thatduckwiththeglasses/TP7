package parte1;

import java.util.*;

class App {
	public static void main(String args[]){
		try {
			MatrizObjetos ma = new MatrizObjetos(402,2);
			String st1 = new String(" esto es un String ");
			Integer entero = new Integer(10);
			ma.SetRowCol(0, 0, st1);
			ma.SetRowCol(1, 0, entero);
			System.out.println( ma.GetRowCol(0,0) );
			ma.SetRowCol(10,0,st1);
			System.out.println(ma);
			} catch(MatrizException e) {
				System.out.println( e );
			}
		}
}
