/*Programa que muestra si un n�mero es vampiro*/
public class ejercicio10 {

	public static void esVampiro(int num){
		int n1 = num/1100;
		int n2 = num - (n1*1100);
		int vamp = n1*n2;
		
		if(vamp==num){
			System.out.println("El n�mero "+num+" es vampiro.");
		}else{
			System.out.println("El n�mero "+num+" no es vampiro.");
		}
	}
	
	public static void main(String[] args){
		esVampiro(8135);
	}
	
}
