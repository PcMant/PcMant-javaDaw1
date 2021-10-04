/*Ejercicio resuelto 5:
 * Realiza una clase huevo que esté compuesta por dos clases internas, una clara y otra yema. Crea dos
 * métodos hazYema() y hazClara() que genreren objetos de las clases yema y clara respectivamente. Realiza
 * un método main en el que se creen objetos de cada una de las clases.
 */
public class huevo {
	
	class yema{
		yema(){System.out.println("Iniciando yema");}
	}
	
	class clara{
		clara(){System.out.println("Iniciando clara");}
	}
	
	yema hazYema() {
		return new yema();
	}
	
	clara hazClara() {
		return new clara();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		huevo h = new huevo();
		yema y = h.hazYema();
		clara c = h.hazClara();
	}

}
