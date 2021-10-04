/*Ejercicio propuesto 6:
 * Programa que compara si un n�mero es capic�a o no, el cual parece que no funciona.
 * Descubre por qu� no funciona y razona tu respuesta.
 */
public class EjercicioPropuesto6 {

	public static boolean esCapicua(int dato) {
		
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		//return i.toString()==reverse.toString(); //Aqu� estaba el problema
		return i.toString().equals(reverse.toString());
		/*El fallo erradica en el uso del operador "==" de igualdad el cual compara
		 * si dos objetos son iguales, mientras que el m�todo "equals()" compara la
		 * igualdad entre valores (siendo este el adecuado para este caso).
		 */
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(esCapicua(11));
		System.out.println(esCapicua(33));
		System.out.println(esCapicua(20));
		
	}
	
}
