/*Ejercicio resuelto 2:
 *Compilará el siguiente código:
 */
public class prueba {
	
	protected String nombre;
	protected int ID;
	public String getIdent() {return nombre;}
	public String getIdent() {return ID;}

}

/*
 *El código anterior parece que quiere hacer una especie de sobrecarga del método getIdent() pero la clase
 *no compilará dado que el compilador se va encontrar con dos métodos con el mismo nombre y la misma lista de
 *parámetros, con lo cual, para él va a ser una implmentación repetida. Concretamente con el compilador Geany dar
 *el siguiente error:
 *	prueba.java:5: getIdent() is already defined in prueba
 *
 *Recuerda que para la sobrecarga de un método era necesario cambiar la lista de argumentos del mismo.
 */