import java.util.Random;

/*Ejercicio3:
 * Tenemos la siguiente clase:
 * 
 * public abstract class sorteo{
 * 	protected int posibilidades;
 * 	public abstract int lanzar();
 * }
 * 
 * Se pide:
 * -Crear la clase dado, la cual desciende de la clase sorteo. La clase dado, en la llamada lanzar() mostrará un
 * número aleatorio del 1 al 6.
 * -Crear la clase moneda, la cual desciende de la clase sorteo. Esta clase en la llamada al método lanzar mostrará
 * las palabras cara o cruz.
 */
public abstract class Ej3 {
	
	protected int posibilidades;
	public abstract int lanzar();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dado d = new dado();
		System.out.println("Lanza el dado y sale: "+d.lanzar());
		
		moneda m = new moneda();
		System.out.print("Lanza la moneda y sale: "+m.lanzar());
		
	}

}

class dado extends Ej3{
	
	int posibilidades = 6;
	
	public int lanzar(){
		return (int) (Math.random()*posibilidades+1);
	}
}

class moneda extends Ej3 {
	
	int posibilidades = 2;
	
	/*public String lanzar(){
		
		Random random = new Random();
		boolean moneda = random.nextBoolean();
		
		if(moneda) {
			return "cara";
		}else {
			return "cruz";
		}
	}*/
	
	public int lanzar() {
		int dato = (int) (Math.random()*posibilidades+1);
		
		if(dato==1) {
			System.out.println("Cara");
		}else {
			System.out.println("Cruz");
		}
		return dato;
	}
}
