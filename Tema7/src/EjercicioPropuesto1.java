/*
 *El ejercicio resuelto n�mero 2, como podr�s suponer, no es �ptimo del todo. Imag�nate que los n�meros est�n ya
 *ordenados (cosa muy improbable utilizando n�meros aletorios). Modifica el ejercicio para que el procedimietno
 *ordene y no d� m�s pasadas de las necesarias. 
 */
public class EjercicioPropuesto1 {

	private static int[] lista;
	private static int POS=50; //n�mero de posiciones del array
	final static int LIMITE=100; //N�meros entre 1..L�mite
	
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
		ordena(lista); //ordenaci�n por burbuja
		System.out.println();
		muestra(); //Se muestra el vector ordenado
		System.out.println();
		
	}
	
}
