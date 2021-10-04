
public class ejercicio8 {
	static int dato=0;
	public void primero() {dato++;}
	public void segundo() {
		primero();
		this.primero();
	}
	public static int getdato() {return dato;}
	public static void main(String[] args) {
		ejercicio8 p = new ejercicio8();
		p.segundo();
		System.out.println(p.getdato());
	}
}
