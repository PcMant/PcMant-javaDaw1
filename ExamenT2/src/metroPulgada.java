import java.util.Scanner;

//Programa que convierte de metros a pulgadas y viceversa
//Ambos metodos conversores recogen los par�metros por pantalla
//1m = 39,3701"

public class metroPulgada {
	//Declaraci�n de variables
	private static Scanner teclado = new Scanner(System.in);
	private static double met=0, pul=0;
	
	public static double metrosToppulgadas() { //M�todo que convierte de metros a pulgadas
		System.out.print("Introdduce una cantidad de metros: ");
		met = teclado.nextDouble();
		return met*39.3701;
	}
	
	public static double pulgadasToMetro() { // M�todo que conviertre de pulgadas a metros
		System.out.print("Introdduce una cantidad de pulgadas: ");
		pul = teclado.nextDouble();
		return pul/39.3701;
	}
	
	//Ejecuci�n de los m�todos
	public static void main(String[] args) {
		metroPulgada c= new metroPulgada(); //Constructor
		System.out.println("Son: "+c.metrosToppulgadas()+" pulgadas");
		System.out.println("Son: "+c.pulgadasToMetro()+" pulgadas");
	}
}
