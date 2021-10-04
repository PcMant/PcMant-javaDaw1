package java1;

//import com.sun.java_cup.internal.runtime.Scanner;
//import java.until.Scanner;
import java.util.Scanner; //Poner arriba del todo si da fallo

public class Main {
	
	public static void main(String[] argumentos) {
	//int num; //lo usa valores de números enteros
	int numero=90;
	System.out.println(numero);
	
	int numeroF = 10/3;
	System.out.println(numeroF);
	
	double numeroD = 10.1; //valores decimales tipo double
	System.out.println(numeroD);
	
	String cadena="Beny Blanco"; //Cadenas de texto
	System.out.println(cadena);
	
	String cadenaN="9452416541";
	System.out.println(cadenaN);
	
	String cadenak="$&%´{}";
	System.out.println(cadenak);
	
	String cadenaO = "\"\""; //Las barras invertidas \ anulan caracteres especiales
	System.out.println(cadenaO);
	
	//Pidiendo parámetros a introducir
	System.out.println("Escribir nombre");
	Scanner leer = new Scanner(System.in);
	//int nombre = leer.nextInt();
	String nombre = leer.next();
	System.out.println(nombre);
	
	//Suma
	int numA,numB;
	numA = 9;
	numB = 8;
	
	int R = numA+numB;
	System.out.println(R);
	/*
	 * Suma +
	 * Resta -
	 * Multiplicación *
	 * Dividir /
	 * Resto % -Solo sirve para valores enteros
	 * En Java no hay operador para exponentes*/
	//Para concatenar se usa usualmente string y se concatena con +
	System.out.println("Hola "+"55 "+nombre);
	
	//Incrementación
	int i=1;
	i++; //incrementando
	//i--; //decrementando
	System.out.println(i);
	i+=5;
	System.out.println(i);
	}
}
