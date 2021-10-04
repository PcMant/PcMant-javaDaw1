/*
 * En el programa se leen las temperaturas de una serie de ciudades por teclado y luego se muestra la media
 * de temperaturas. Como se puede obserbar, se crea la constante POS, la cual contiene el n�mero de temperaturas
 * a registrar. En el ejemplo est� definida con valor 10 pero se puede aumentas o disminuir su valor y el programa
 * funcionar� sin modificar m�s el c�digo.
 * 
 */

public class temperaturas {

	private static int[] temperaturas1;
	final static int POS=10; //n�mero de posiciones del array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dato=0;
		int media=0;
		temperaturas1 = new int[POS];
		
		for(int i=0; i<POS; i++) { //leer los valores de temperatura
			
			try {
				System.out.println("Introduzca temperatuda:");
				String sdato = System.console().readLine();
				dato = Integer.parseInt(sdato);
			}catch(Exception e) {
				System.out.println("Error en la introducci�n de datos");
			}
			temperaturas1[i]=dato;
			
		}
		
		/*for (int i=0; i<POS; i++) { //hacer la media
			
			media = media + temperaturas1[i];
			
		}
		media = media/POS;
		System.out.println("La media de temperaturas es "+media);*/

	}

}
