
public class pajaro {
	//*** atributos o propiedades ***
	private char color; //propiedad o artibuto color
	private int edad; //propiedad o artirbuto edad
	//*** m?todos de la clase ***
	public void setedad(int e) {edad = e;}
	public void printedad() {System.out.println(edad);}
	public void setcolor(char c) {color = c;}
	public void printcolor() {
		switch(color) {
		//Los p?jaros verdes, amarillos, grises, negros o blancos
		//No existen p?jaros de otros colores
		case 'v': System.out.println("Verde");break;
		case 'a': System.out.println("Amarillo");break;
		case 'g': System.out.println("Gris");break;
		case 'n': System.out.println("Negro");break;
		case 'b': System.out.println("blanco");break;
		default: System.out.println("Color no establecido");
		}
	}
	
}

