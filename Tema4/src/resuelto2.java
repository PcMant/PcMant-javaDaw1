/*Clase que realiza fibonacci recursivo*/
public class resuelto2 {
	
	public static int fibonacci (int num) {
		
		if (num == 0) return 0;
		if (num == 1) return 1;
		
		return fibonacci(num-1) + fibonacci(num-2);
		
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(fibonacci(i)+", ");
		}
		
	}

}
