
public class numero {
	
	private static int num = 0;
	
	numero(int i) {
		num = i;
	}
	
	public static int aniade(int n) {
		num += n;
		return num;
	}
	
	public static int resta(int n) {
		num -= n;
		return num;
	}

	public static int getValor() {
		return num;
	}
	
	public static int getDoble() {
		return num*2;
	}
	
	public static int getTriple() {
		return num*3;
	}
	
	public static int setNumero() {
		num = 0;
		return num;
	}
	
	public static void main(String[] args) {
		numero p= new numero(5); //Constructor
		
		p.resta(5);
		p.aniade(3);
		System.out.println(p.getValor());
		System.out.println(p.getDoble());
		System.out.println(p.getTriple());
		//System.out.println(p.setNumero());
		p.setNumero();
		System.out.println(p.getValor());
	}
}
