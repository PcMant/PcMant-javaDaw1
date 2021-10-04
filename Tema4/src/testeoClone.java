
public class testeoClone {

	public static void main(String[] args) {
		
		rectangulo r1 = new rectangulo(5,7);
		rectangulo r2 = (rectangulo) r1.clone();
		r2.incrementarAncho();
		r1.incrementarAncho();
		r1.setNombre("Chiquito");
		r2.setNombre("Grande");
		System.out.println("Alto: "+r1.getAlto());
		System.out.println("Ancho: "+r1.getAncho());
		System.out.println("Alto: "+r2.getAlto());
		System.out.println("Ancho: "+r2.getAncho());
		System.out.println("Nombre: "+r1.getNombre());
		System.out.println("Nombre: "+r2.getNombre());
	}

}
