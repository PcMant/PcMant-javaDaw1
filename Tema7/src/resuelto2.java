/*
 *Realiza un programa que cree un vector de 50 posiciones cargando con valores aleatorios. Los valores aleatorios
 *deberían de estar entre el 1 y el 100. Una vez cargado el vector deberá de ordenarlo mediante el método de la burbuja
 *y mostrarlo ordenado por pantalla.
 *
 * Truco:
 * Obserba que generar un número aleatorio se utiliza el método random de la clase Math el cual genera
 * un número aleatorio (double) entre 0.0 y 1.0. Si este se múltiplica por LIMITE que es el rango de números
 * a generar y se le suma 1, los números generados estarán siempre entre 1 y LIMITE.
*/
public class resuelto2 {
	
	private static int[] lista;
	private static int POS=50; //número de posiciones del array
	final static int LIMITE=100; //Números entre 1..Límite
	
	public static int getaleatorio() {
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void ordena(int array[]) {
		
		int aux;
		
		for(int i=array.length; i>0; i--) {
			
			for(int j=0; j<i-1;j++) {
			
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
				}
				
			}
			
		}
		
	}
	
	public static void muestra() {
		
		for(int i=0; i<POS; i++) {
			System.out.print(lista[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		lista = new int [POS];
		
		for(int i=0; i<POS;i++) {
			lista[i]=getaleatorio();
		}
		
		muestra(); //Se muestra el vector desordenado
		System.out.println();
		ordena(lista); //ordenación por burbuja
		System.out.println();
		muestra(); //Se muestra el vector ordenado
		System.out.println();
		
	}

}
