import java.util.HashMap;

/* Ejercicio propuesto 9:
 * Realiza un programa que cree un vector de 100 posiciones con n�meros aleatorios entre 10 y 80. Una vez creado
 * el vector el programa deber� mostrar el mayor, el menor, el valor que m�s se repite y la media.
 */
public class EjercicioPropuesto9 {
	
	public static void main(String[] args) {
		
		//variables
		int mayor = 0;
		int menor = 0;
		int salt = 0;
		int moda = 0, mayorr=0;
		int suma = 0, media = 0;
		
		//Inicializaci�n del array
		int []array = new int[100];

		//Generando los 100 n�meros aleatorios para el array desordenado
		for(int i=0; i<100; i++) {
			array[i] = (int) (Math.random() *(80 - 10) + 10);
		}
		
		//Mostrando por pantalla la lista de n�meros
		System.out.println("N�meros que contiene el array: ");
		for(int e:array) {
			System.out.print(e+" ");
			salt++;
			if(salt>49) {
				System.out.println();
				salt=0;
			}
		}
		System.out.println();
		
		//Obteniendo el n�mero mayor y menor del array
		for(int m : array){
	        if (menor>m || menor==0) menor = m;
	        if(mayor<m)mayor = m;
	    }
		System.out.println("El n�mero mayor del array es: "+mayor);
		System.out.println("El n�mero menor del array es: "+menor);
		System.out.println();
		
		//Obteniendo el valor que m�s se repite en el array
		/*Comenzamos recorriendo el arreglo y agregando dos cosas a un diccionario o mapa:
		 * 	-El n�mero
		 *	- Un 1
		 * 
		 * Es decir, por cada que encontremos un n�mero, lo asignamos al diccionario. Si ya existe, 
		 * entonces aumentamos su conteo.
		 * 
		 * Despu�s de eso, simplemente obtenemos el n�mero que m�s se repiti�. As� que en resumen
		 * contamos cu�ntas veces aparece un n�mero y luego obtenemos el m�s repetido.
		 */
		/*CONTANDO N�MEROS:
		 * Para contar la frecuencia con la que se repiten los n�meros voy a usar un HashMap de 
		 * Java de tipo Integer, Integer; pues tanto la clave como el valor ser�n de tipo entero.
		 *
		 * La clave ser� el n�mero y el valor ser� el conteo, es decir, las veces que se repite. 
		 */
		HashMap<Integer, Integer> mapa = new HashMap<>();
		for (int x = 0; x < array.length; x++) {
		  int numero = array[x];
		  if (mapa.containsKey(numero)) {
		    mapa.put(numero, mapa.get(numero) + 1);
		  } else {
		    mapa.put(numero, 1);
		  }
		}
		
		/*-OBTENIENDO LA MODA:
		 * Ahora que tenemos el mapa simplemente lo recorremos y usamos el algoritmo para obtener el 
		 * n�mero mayor. Despu�s de todo eso, imprimimos los resultados.
		 */
		for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
			  if (entry.getValue() > mayorr) {
			    mayorr = entry.getValue();
			    moda = entry.getKey();
			  }
			}
		System.out.printf("La moda es %d: porque se repite %d veces",moda , mayorr);
		System.out.println();
		System.out.println();
		
		//Media de los valores del array
		for(int i=0; i<array.length; i++) {
			suma+=array[i];
		}
		media = suma/array.length;
		System.out.println("La media del array es: "+media);
		System.out.println();
		
	}

}
