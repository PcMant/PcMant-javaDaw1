/*Los inicializadores static son un bloque de c�digo que se ejecutar� una vez solamente cuando se utlice la clase.*/
public class testInicializador {

	static { //Inicializador static
		System.out.println("Llamada al inicializador");
	}
	
	static { //Inicializador static
		System.out.println("Llamada al segundo inicializador");
	}
	
	testInicializador(){ //Llamada de contructor
		System.out.println("Llamada al constructor");
	}
	
}
