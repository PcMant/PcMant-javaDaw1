/*Ejercicio 2:
 * �Compilar� el siguiente programa?
 * En caso afirmativo averigua sin ejecutar el c�digo qu� mostrar� por pantalla:
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
