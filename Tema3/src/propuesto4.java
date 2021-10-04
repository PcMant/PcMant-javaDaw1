/*Dando tres cifras tiene que averiguar el número Armstrong
 
Número Amstrong: es cuando la suma de cada uno de los números que lo componen
elevado al número de digitos de dicho número da como resultado el propio número.
 
 */
public class propuesto4 {
	
	public static int potencia(int base, int exponente) {
		int res=base;
		for(int i=0;i<exponente-1;i++) {
			res = res * base;
		}
		return res;
	}
	
	public static int amstrong(int numero) {
		int port=0;
		
		int cifra1 = numero/100;
		int cifra2 = (numero - 100*cifra1)/10;
		int cifra3 = numero - (100*cifra1) - (10*cifra2);
		int dat = potencia(cifra1, 3)*potencia(cifra2,3)+potencia(cifra3,3);
		if (dat == numero) {
			port=0;
		}else{
			port=1;
		}
		
		return port;
		
		/*if (dat == numero) return 1;
		return 0;*/
		
	}
	
	public static void main(String[] args) {
		System.out.println(amstrong(153));
		if(amstrong(371)==1) {
			System.out.println("El número 371 es un número Armstrong");
		}else {
			System.out.println("El número 371 No es un número Amstrong");
		}
		
		if(amstrong(423)==1) {
			System.out.println("El número 423 es un número Amstrong");
		}else {
			System.out.println("El número 423 No es un número Amstrong");
		}
	}

}