
public class pez implements Cloneable {
	
	pez(String nom){
		nombre = nom;
	}
	
	pez(pez p){ //Método para el constructor de copia
		this.nombre = p.getNombre();
	}
	
	protected String nombre;
	public String getNombre() {return this.nombre;}
	public void setNombre(String s) {this.nombre=s;}
	public Object clone() {
		Object objeto = null;
		try {
			objeto=super.clone();
		}catch(CloneNotSupportedException ex){
			System.out.println("Error al duplicar");
		}
		return objeto;
	}
	public boolean equals(pez ese){
		if (ese.getNombre()==this.getNombre()) {return true;}
		return false;
	}
	
	public static void main (String[] args) {
		pez p1 = new pez("Gulli");
		p1.setNombre("Gulli");
		pez p2 = new pez("Gulli");
		p2.setNombre("Escalar");
		pez p3 = (pez) p2.clone();
		System.out.println(p1.getNombre());
		System.out.println(p2.getNombre());
		System.out.println(p3.getNombre());
		System.out.println(p3.equals(p2));
		
		//Con constructor copia
		pez p4 = new pez(p1);
		System.out.println(p4.getNombre());
	}
	
}
