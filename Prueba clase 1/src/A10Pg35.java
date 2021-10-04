/*Dentro de una clase joven tenemos las varibles
 * enteras edad, nivel_de_estudios e ingresos.
 * Necesitamos almacenar en la variable booleana
 * jasp el valor:
 * Verdadero. Si la edad menos o igual a 28 y el
 * nivel_de_estudios mayor que 3 o bien la menor
 * de 30 y los ingresos superan los 28k euros
 * Falso. En contrario
 */
public class A10Pg35 {
	public static void main(String[] arg) {
		int edad, nivel_de_estudios, ingresos;
		edad = 28;
		nivel_de_estudios = 4;
		ingresos = 28000;
		boolean jasp = false;
		
		jasp = ((edad<=28) && (nivel_de_estudios > 3)) || ((edad<30) && (ingresos > 28000));
		System.out.println(jasp);
	}

}
