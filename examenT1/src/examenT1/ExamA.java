package examenT1;

public class ExamA { //Se define la clase
	public static void main(String[] args) { //Este metodo permite la ejecución ya que main es el bloque principal
		int n1=10,n2=30,suma=0; //Se defienen variables dandoles valores
		int n3 = n1+n2; //Se define la variable n3 dando como valor la suma de n1 y n2
		suma = n1+n2; //Sele da por valor a la variable suma la suma de n1 y n2 
		System.out.println("La suma es: "+suma); //Se imprime por pantalla el resultado de suma
		suma=suma+n3; //Se le asigna un nuevo valor a suma incrementandose con n3
		System.out.println(suma); //Se imprime por pantalla el resultado de suma
	}
}
