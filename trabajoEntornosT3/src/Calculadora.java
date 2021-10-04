import java.util.Scanner;
//import junit.runner.Version;

/*Esta es una clase que hace de calculadora entre dos n�meros*/

public class Calculadora {
	
	//Declaraci�n e inicializaci�n de variables
	private double num1=0, num2=0, resultado=0;
	private Scanner teclado = new Scanner(System.in);
	
	Calculadora(){}
	Calculadora(double n1, double n2){
		num1 = n1;
		num2 = n2;
	}
	
	/*Introducir los valores para la calculadora*/
	public void setNumeros(double n1, double n2){//M�todo que recoge valores como par�metro
		num1 = n1;
		num2 = n2;
	}
	public void setNumerosTeclado(){//M�todo que recoge valores como par�metro
		System.out.print("Introduce un primer n�mero: ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce un segundo n�mero: ");
		num2 = teclado.nextDouble();
	}
	public double resetResultado() {//Resetea el resultado a 0
		resultado = 0;
		return resultado;
	}
	
	/*M�todos para visualizar n�meros*/
	public double getNumero1(){//Devuelve el valor de num1
		return num1;
	}
	public double getNumero2(){//Devuelve el valor de num2
		return num2;
	}
	public double getResultado(){//Devuelve el valor de resultado
		return resultado;
	}
	
	
	/*M�todos de operaciones aritm�ticas*/
	public double suma() {//M�todo que suma entre dos n�meros
		resultado = num1+num2;
		return resultado;
	}
	
	public double resta() {//M�todo que resta entre dos numeros
		resultado = num1-num2;
		return resultado;
	}
	
	public double multiplicar() {//M�todo que multiplica dos n�meros
		resultado = num1*num2;
		return resultado;
	}
	
	public double dividir() {//M�todo que divide dos n�meros
		resultado = num1/num2;
		return resultado;
	}
	
	public double modulo() {//M�todo que calcula el m�dulo entre dos n�meros
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
