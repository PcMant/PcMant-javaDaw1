
public class probandoRecursividad {
	
	public static int potencia(int x, int y) {
		if(y==1) { //caso base
			return x;
		}else { //reduci�n de la complejidad
			return x * potencia(x,y-1);
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println(potencia(2,4));
		
	}

}
