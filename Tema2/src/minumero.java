
public class minumero {
	
	static int numero;
	minumero(int d){
		numero = d;
	}
	
	public static int doble() {
		return numero*2;
	}
	
	public static int triple() {
		return numero*3;
	}
	
	public static int cuadruple() {
		return numero*4;
	}
	
	public static void main(String[] arg) {
		
		//Con constructor
		minumero n1 = new minumero(7);
		System.out.println(n1.doble());
		System.out.println(n1.triple());
		System.out.println(n1.cuadruple());
	}

}
