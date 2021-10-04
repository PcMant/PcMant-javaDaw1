/*Ejercicio resuelto 4:
 * Tenemos una clase con un método metodox() que debe devolver un valor entero y da problemas al compilar.
 * Parte del cuerpo de la clase es el siguiente:
 * 	int dato;
 * 	.......
 * 	public int metodox(){
 * 		return dato * 1.1;
 * 	}
 * Se pide la reescritura del método utilizando un wrapper Double que solvente el problema de compilación.
 */
public class Resuelto4 {

	int dato;
	
	public int metodox() {
		Double d = new Double(dato*1.1);
		return d.intValue();
	}

}
