package utilidades.examen;

public class notas {
	
	//Inicialización de variables
	private static int prog = 1;
	private static int endes = 1;
	private static int sistemas = 1;
	
	public static int setProg(int n1, int n2, int n3) { //Recoge las notas y hace la media de programación llamando a un método
		prog = calculo.media(n1,n2,n3);
		return prog; //Devuelve la media de programación
	}
	
	public static int getProg() { //Devuelve la media de programación
		return prog;
	}
	
	public static int setEndes(int n1, int n2, int n3) {//Recoge las notas y hace la media de entornos llamando a un método
		endes = calculo.media(n1,n2,n3);
		return endes; //Devuelve la media de entornos
	}
	
	public static int getEndes() { //Devuelve la media de entornos
		return endes;
	}
	
	public static int setSistemas(int n1, int n2, int n3) {//Recoge las notas y hace la media de sistemas llamando a un método
		sistemas = calculo.media(n1,n2,n3);
		return sistemas; //Devuelve la media de sistemas
	}
	
	public static int getSistemas() { //Devuelve la media de sistemas
		return sistemas;
	}
	
	public static void promoc() { //Método que comprueba si promocionas de curso y si tienes más de 9 de promedio
		if(getProg() >=5 && getEndes() >=5 && getSistemas() >= 5) {
			System.out.println("Enorabuena el año que viene estás en segundo de DAW");
			if(((getProg()+getEndes()+getSistemas())/3)>=9) {
				System.out.println("Enorabuena, eres uno de los mejores de este curso");
			}
		}else if(getProg() <=4 && getEndes() <=4 && getSistemas() >= 5) {
			System.out.println("Lo lamentamos, este año no promocionas de curso.");
		}else if(getProg() >=5 && getEndes() <=4 && getSistemas() <= 4) {
			System.out.println("Lo lamentamos, este año no promocionas de curso.");
		}else if(getProg() <=4 && getEndes() >=5 && getSistemas() <= 4) {
			System.out.println("Lo lamentamos, este año no promocionas de curso.");
		}else {
			System.out.println("Enorabuena el año que viene estás en segundo de DAW");
			if(((getProg()+getEndes()+getSistemas())/3)>=9) {
				System.out.println("Enorabuena, eres uno de los mejores de este curso");
			}
		}
	}

	public static void main(String[] args) {
		//Testeo la el programa con un alumno
		notas a1 = new notas(); //Creo el constructor del alumno de prueba
		
		//Ejecuto cada uno de los métodos de asignaturas metiendo las notas
		a1.setProg(9,9,9);
		a1.setEndes(9,9,9);
		a1.setSistemas(9,9,9);
		
		//Por ultimo obetengo con este método si el alumno promociona de curso o si es uno de los mejores
		a1.promoc();
	}
}
