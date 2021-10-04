/*Ejercicio 2:
 * ¿Compilará el siguiente programa?
 * En caso afirmativo averigua sin ejecutar el código qué mostrará por pantalla:
 */
public class Ej2 {
	
	static void pedir(String... argumentos) {
		for(String str:argumentos) System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pedir("mama pipi", "mama caca", "mama agua");
		pedir(new String[] {"papa jugar", "mama me aburro", "papa sed", "papa dormir", "mama tengo hambre"});
	}

}
