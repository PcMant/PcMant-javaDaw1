
public class testforma {

	public static void main(String[] args) {
		
		forma f = new circulo();
		f.identidad();
		circulo c = new circulo();
		((forma)c).identidad();
		((circulo)f).identidad();
		//forma f2 = new forma();
		//f2.identidad();
		//Las clases abstractas nunca pueden ser instanciadas
		
		/*
		 El resultante es:
			 c�rculo
			 c�rculo
			 c�rculo 
		 */
	}

}
