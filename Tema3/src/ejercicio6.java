/*Programa que muestra las tablas de multiplicar del 1 al 10*/
public class ejercicio6 {
	
	public static void main(String[] args){
		
		for(int i=1; i<11; i++){
			System.out.println("Tabla del "+i);
			System.out.println("************");
			
			for(int por=1; por<11; por++){
				System.out.println(i+" X "+por+" = "+i*por);
			}
			
			System.out.println("");
		}
	
	}

}
