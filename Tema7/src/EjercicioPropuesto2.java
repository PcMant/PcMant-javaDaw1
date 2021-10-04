/*Ejercicio propuesto 2:
 *Realiza un programa que cree dos vectores de 100 elementos. El primero almacenará una serie de datos numéricos
 *desordenados. Dichos datos serán datos generados aleatoriamente. El segundo array contendrá los mismos datos
 *pero ordenados por el método insertion sort. 
 */
public class EjercicioPropuesto2 {

	public static void main(String[] args) {
		
		//variables
		int aux; //auxiliar
		int cont1, cont2, salt=0; //contadores
		
		//Inicialización de arrays
		int []desordenado = new int[100];
		int []ordenado = new int[100];
		
		//Generando los 100 números aleatorios para el array desordenado
		for(int i=0; i<100; i++) {
			desordenado[i] = (int) (Math.random() *(99 - 10) + 10);
		}
		ordenado = desordenado;
		//Imprimiendo por pantalla los valores desordenados
		System.out.println("Valores desordenados:");
		for(int e:desordenado) {
			System.out.print(e+" ");
			salt++;
			if(salt>49) {
				System.out.println();
				salt=0;
			}
		}
		System.out.println();
		
		//Ordenando los valores mediante el algoritmo insertion sort
		for(cont1 = 1; cont1<ordenado.length; cont1++) {
			
			aux = ordenado[cont1];
			
			for(cont2=cont1-1;cont2 >=0 && ordenado[cont2]>aux; cont2--) {
				
				ordenado[cont2+1]=ordenado[cont2];
				ordenado[cont2]=aux;
			}
			
		}
		
		//Imprimiendo por pantalla los valores ordenados
		salt=0;
		System.out.println("Valores ordenados:");
		for(int e:ordenado) {
			System.out.print(e+" ");
			salt++;
			if(salt>49) {
				System.out.println();
				salt=0;
			}
		}

	}

}
