/*
 *Realiza un programa que cree un vector de 50 posiciones cargando con valores aleatorios. Los valores aleatorios
 *deber�an de estar entre el 1 y el 100. Una vez cargado el vector deber� de ordenarlo mediante el m�todo de la burbuja
 *y mostrarlo ordenado por pantalla.
 *
 * Truco:
 * Obserba que generar un n�mero aleatorio se utiliza el m�todo random de la clase Math el cual genera
 * un n�mero aleatorio (double) entre 0.0 y 1.0. Si este se m�ltiplica por LIMITE que es el rango de n�meros
 * a generar y se le suma 1, los n�meros generados estar�n siempre entre 1 y LIMITE.
*/
public class resuelto2 {
	
	private static int[] lista;
	private static int POS=50; //n�mero de posiciones del array
	final static int LIMITE=100; //N�meros entre 1..L�mite
	
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
		ordena(lista); //ordenaci�n por burbuja
		System.out.println();
		muestra(); //Se muestra el vector ordenado
		System.out.println();
		
	}

}
