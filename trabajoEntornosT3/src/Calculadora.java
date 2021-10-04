import java.util.Scanner;
//import junit.runner.Version;

/*Esta es una clase que hace de calculadora entre dos números*/

public class Calculadora {
	
	//Declaración e inicialización de variables
	private double num1=0, num2=0, resultado=0;
	private Scanner teclado = new Scanner(System.in);
	
	Calculadora(){}
	Calculadora(double n1, double n2){
		num1 = n1;
		num2 = n2;
	}
	
	/*Introducir los valores para la calculadora*/
	public void setNumeros(double n1, double n2){//Método que recoge valores como parámetro
		num1 = n1;
		num2 = n2;
	}
	public void setNumerosTeclado(){//Método que recoge valores como parámetro
		System.out.print("Introduce un primer número: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce un segundo número: ");
		num2 = teclado.nextDouble();
	}
	public double resetResultado() {//Resetea el resultado a 0
		resultado = 0;
		return resultado;
	}
	
	/*Métodos para visualizar números*/
	public double getNumero1(){//Devuelve el valor de num1
		return num1;
	}
	public double getNumero2(){//Devuelve el valor de num2
		return num2;
	}
	public double getResultado(){//Devuelve el valor de resultado
		return resultado;
	}
	
	
	/*Métodos de operaciones aritméticas*/
	public double suma() {//Método que suma entre dos números
		resultado = num1+num2;
		return resultado;
	}
	
	public double resta() {//Método que resta entre dos numeros
		resultado = num1-num2;
		return resultado;
	}
	
	public double multiplicar() {//Método que multiplica dos números
		resultado = num1*num2;
		return resultado;
	}
	
	public double dividir() {//Método que divide dos números
		resultado = num1/num2;
		return resultado;
	}
	
	public double modulo() {//Método que calcula el módulo entre dos números
		resultado = num1%num2;
		return resultado;
	}
	
	public int time () throws InterruptedException{
		Thread.sleep(3000);
		return 1;
	}

	public static void main(String[] args) {
		//System.out.println("Pureba");
		//System.out.println("JUnit version is: " + Version.id());
	}

}
