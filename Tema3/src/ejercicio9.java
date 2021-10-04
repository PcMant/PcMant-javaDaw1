/*Programa que comprueba numeros si son Omirp esto quiere decir si a la vez de ser primo su invertido también
 * Un número es primo si es divisible entre si mismo y la unidad
 * */
public class ejercicio9 {

	public static void esOmirp(int n){
		
		//Definición de variables
		int numero = n;
		int resto;
		int invertido = 0;
		int contaNumPrimo = 0, contaInvPrimo = 0;
		boolean primoNumero = false, primoInvertido = false;
		
		//inversión del numero
		int nn = numero, div;
		while (nn>0){
			div=nn%10;
			invertido=invertido*10+div;
			nn/=10;
		}
		
		//Comprobar si numero es primo
		for(int i = 1; i<=numero; i++){
			if(numero%i == 0){
				contaNumPrimo++;
			}
		}
		if(contaNumPrimo==2){
			primoNumero = true;
		}
		
		//Comprobar si el invertido es primo
		for(int i = 1; i<=invertido; i++){
			if(invertido%i == 0){
				contaInvPrimo++;
			}
		}
		if(contaInvPrimo==2){
			primoInvertido = true;
		}
		
		//Comprobando si es numero Omirp
		if(primoInvertido==true && primoNumero==true){
			System.out.println("El número "+numero+" es Omirp");
		}else{
			System.out.println("El número "+numero+" no es Omirp");
		}
		
	}
	
	public static void main(String[] args){
		esOmirp(7951);
		esOmirp(107);
		esOmirp(250);
		esOmirp(13);
	}
}
