/*Matriz numérica*/
public class ejercicio1 {
	
	public static int fila, columna;
	
	public static void setCuadrado (int f){
		fila = f;
		columna = f;
	}
	

	public static int numeros(int fila, int columna){
		
		if(fila<1 || columna<1) return 0;
		if(columna == 1 || fila == 1) return 1;
		
		return numeros(fila-1,columna) + numeros(fila,columna-1);
	}
	
	public static void main(String[] args){
		
		
		for(fila = 1; fila<=5; fila++){
			
			for(columna = 1; columna<=5; columna++){
				System.out.print(" ");
				System.out.print(numeros(fila,columna));
				System.out.print("  ");
			}
			
			System.out.println();
		}
		
	}
	
}
