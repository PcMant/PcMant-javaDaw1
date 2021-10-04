public class Contacto implements java.io.Serializable {

	protected String nombre;
	protected long telefono;
	
	public Contacto(String n, long t) {
		nombre = n;
		telefono = t;
	}
	
	public void print() {
		System.out.println(nombre+" -> "+telefono);
	}
	
}