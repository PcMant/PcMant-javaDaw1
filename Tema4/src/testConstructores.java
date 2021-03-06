
public class testConstructores {
	
	public static void main(String[] args) {
		
		//Ejemplo de sobrecarga de constructores
		 /*-Cuando existe m?s de un constructor para una clase se dice que este est? sobrecargado. Cuando creamos
		  un objeto con new, Java elige el constructor m?s adecuado dependiendo de los par?metros utilizados.*/
		rectangulo r1 = new rectangulo(5,7);
		rectangulo r2 = new rectangulo();
		rectangulo r3 = new rectangulo(8);
		
		
		//Constructores de copia: Copia el contenido de un objeto en otro
		/*Para ello se usa el siguiente metodo de la clase rectangulo:
		  
		 
			rectangulo(rectangulo r){ //Metodo que permite contructores de copia
				this.ancho = r.getAncho();
				this.alto = r.getAlto();
			}
			
		 */
		rectangulo r4 = new rectangulo(5,7);
		rectangulo r5 = new rectangulo(r4); //Constructor de copia
		//r5 = r4; //Esto copia la referencia y no el contenido
		r5.incrementarAncho();
		r5.incrementarAlto();
		System.out.println("Alto: "+r1.getAlto());
		System.out.println("Ancho: "+r1.getAncho());
		
	}
	
}
