/*Programa con clase que realiza número factorial de manera iterativa*/
public class resuelto1B {
	
	public static  int factorial(int num) {
		
		int factorial = 1;
		
		while (num > 0) {
			factorial *= num;
			num--;
		}
		
		return factorial;
	}
	
	public static void main(String[] args) {
		System.out.println("El factorial de 0 es: "+factorial(0));
		System.out.println("El factorial de 1 es: "+factorial(1));
		System.out.println("El factorial de 2 es: "+factorial(2));
		System.out.println("El factorial de 3 es: "+factorial(3));
		System.out.println("El factorial de 4 es: "+factorial(4));
		System.out.println("El factorial de 5 es: "+factorial(5));
	}

}