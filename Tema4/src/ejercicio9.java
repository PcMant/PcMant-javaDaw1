
public class ejercicio9 {
	
	ejercicio9(int i){
		this ("Soy un bebe consentido");
		System.out.println("Hola, tengo "+i+" meses");
	}

	public ejercicio9(String s) {
		System.out.println(s);
	}
	
	void berrea() {
		System.out.println("Buaaaaaaaaaaaaaaaa");
	}
	
	public static void main(String[] args) {
		new ejercicio9(8).berrea();
	}
	
}
