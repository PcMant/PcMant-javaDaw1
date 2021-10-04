/*Ejercicio resuelto 2:
 *Compilar� el siguiente c�digo:
 */
public class prueba {
	
	protected String nombre;
	protected int ID;
	public String getIdent() {return nombre;}
	public String getIdent() {return ID;}

}

/*
 *El c�digo anterior parece que quiere hacer una especie de sobrecarga del m�todo getIdent() pero la clase
 *no compilar� dado que el compilador se va encontrar con dos m�todos con el mismo nombre y la misma lista de
 *par�metros, con lo cual, para �l va a ser una implmentaci�n repetida. Concretamente con el compilador Geany dar
 *el siguiente error:
 *	prueba.java:5: getIdent() is already defined in prueba
 *
 *Recuerda que para la sobrecarga de un m�todo era necesario cambiar la lista de argumentos del mismo.
 */