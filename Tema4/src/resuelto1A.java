
/*Programa con clase que realiza número factorial de manera recursiva*/
public class resuelto1A {
	
	public static  int factorial(int num) {
		
		if (num== 0) return 1;
		return num * factorial (num - 1);
		
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
