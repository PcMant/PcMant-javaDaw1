import java.util.Scanner;

//Programa que convierte de metros a pulgadas y viceversa
//Ambos metodos conversores recogen los parámetros por pantalla
//1m = 39,3701"

public class metroPulgada {
	//Declaración de variables
	private static Scanner teclado = new Scanner(System.in);
	private static double met=0, pul=0;
	
	public static double metrosToppulgadas() { //Método que convierte de metros a pulgadas
		System.out.print("Introdduce una cantidad de metros: ");
		met = teclado.nextDouble();
		return met*39.3701;
	}
	
	public static double pulgadasToMetro() { // Método que conviertre de pulgadas a metros
		System.out.print("Introdduce una cantidad de pulgadas: ");
		pul = teclado.nextDouble();
		return pul/39.3701;
	}
	
	//Ejecución de los métodos
	public static void main(String[] args) {
		metroPulgada c= new metroPulgada(); //Constructor
		System.out.println("Son: "+c.metrosToppulgadas()+" pulgadas");
		System.out.println("Son: "+c.pulgadasToMetro()+" pulgadas");
	}
}
