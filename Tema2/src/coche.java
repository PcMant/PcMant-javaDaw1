
public class coche {
	private static int velocidad;
	
	coche () {velocidad=0;}
	
	public static int getVelocidad() {
		return velocidad;
	}
	
	public void acelera(int mas) {
		velocidad+=mas;
	}
	
	public void frena(int menos) {
		velocidad-=menos;
	}
	
	public static void main(String[] args) {
		coche coche1 = new coche();
		System.out.println("Velocidad: "+getVelocidad());
		coche1.acelera(5);
		System.out.println("Velocidad: "+getVelocidad());
	}
}
