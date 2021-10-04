/*
Hacer la figura:
   *
  * *
 *   *
*     *
 *   *
  * *
   *
*/
public class ejercicio4 {
	
	public static void main(String[] args){
		
		int asterisco = 1;
		int espacio = 3;
		int linea = 1;
		
		//Parte superior de la figura
		for(linea = 1; linea <= 4; linea++){
			
			//Impirmir espacios
			for(espacio = 3; espacio>=linea; espacio--){
				System.out.print(" ");
			}
			
			//Imprimir asteriscos
			System.out.print("*");
			for(asterisco = 1; asterisco<(linea*2)-2; asterisco++){
				System.out.print(" ");
			}
			if(asterisco>1){
				System.out.print("*");
			}
			
			
			System.out.println();
	
		}
		
		//Parte inferior de la figura
		asterisco = 1;
		for(linea = 1; linea <= 3; linea++){
			
			//Impirmir espacios
			for(espacio = 0; espacio<linea; espacio++){
				System.out.print(" ");
			}
			
			//Imprimir asteriscos
			System.out.print("*");
			for(int i = 3; i>=asterisco; i--){
				System.out.print(" ");
			}
			if(asterisco<=3){
				System.out.print("*");
			}
			
			
			System.out.println();
			asterisco+=2;
		}
		
	}
}
