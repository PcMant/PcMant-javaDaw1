import java.util.*;

public class ejercicio7 {

	public static void main(String[] args){
		Random rnd = new Random();
		int valor = rnd.nextInt(200-100)+100;
		
		if(valor%2==0){
			System.out.println("El número "+valor+" es par.");
		}else{
			System.out.println("El número "+valor+" es impar.");
		}
	}
	
}
