/*
 *El ejercicio resuelto número 2, como podrás suponer, no es óptimo del todo. Imagínate que los números están ya
 *ordenados (cosa muy improbable utilizando números aletorios). Modifica el ejercicio para que el procedimietno
 *ordene y no dé más pasadas de las necesarias. 
 */
public class EjercicioPropuesto1 {

	private static int[] lista;
	private static int POS=50; //número de posiciones del array
	final static int LIMITE=100; //Números entre 1..Límite
	
	public static int getaleatorio() {
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void ordena(int array[]) {
		
		int aux;
		int j=0;
		boolean bandera = false;
		
		for(int i=array.length; i>0; i--) {
			
			for(j=0; j<i-1;j++) {
			
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
