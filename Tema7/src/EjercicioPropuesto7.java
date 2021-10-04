import java.util.Arrays;

/* Ejercicio propuesto 7:
 * Realiza un método que tome como parámetros de entrada dos arrays de enteros y devuelva como salida un único
 * array con los elementos de los anteriores arrays ordenados de forma ascendente.
*/
public class EjercicioPropuesto7 {
	
	public static int[] fusionaDosArray_OrdenAsc(int []array1, int []array2) {
		
		//Se inicializa y se le da el tamaño a un array donde se van a fusionar
		int fusion[] = new int[array1.length+array2.length];
				
		//Se copian ambos arrays en el array fusion
		System.arraycopy(array1, 0, fusion, 0, array1.length);
		System.arraycopy(array2, 0, fusion, array1.length, array2.length);
				
		//Ordena		
		Arrays.sort(fusion);
		
		return fusion;
		
	}

	public static void main(String[] args) {
		
		//Iniciación de arrays
		int[] a1 = {8,6,1,3,5};
		int[] a2 = {9,7,2,4,10};
		
		//Se invoca al método que funsiona a ambos arays y ordena asc, lo guardo en otro array
		int[] juntos = fusionaDosArray_OrdenAsc(a1,a2);
		
		//Imprimo por pantalla el array fusionado y ordenado asc
		for (int n : juntos) {
		     System.out.print(n+" ");                                                                                       
		}
		
	}

}
