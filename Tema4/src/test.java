
public class test {
	
	//Ejemplo de m?todo instancia
	public static int var;
	public int var2;
	public void prueba() { //metodo instancia
		test.var = 3;
		var2 = 5;
	}
	
	
	public static void main(String[] args) {
		// ejemplo equals(), esto lo que hace es comparaciones true/false segun sea igual o no
		rectangulo r1 = new rectangulo(5,7);
		rectangulo r2 = new rectangulo(5,7);
		rectangulo r3 = r1;
		
		
		if(r1.equals(r2)) {
			System.out.println("Iguales r1 y r2(equals)");
		}
		if(r1.equals(r3)) {
			System.out.println("Iguales r1 y r3(equals)");
		}
		
		//Ejemplo toString()
		/*Permite obtener el nombre de la clase desde el cual fue invocado. Adem?s
		 del nombre de la clase, devuelve el car?cter @ y la representaci?n
		 hexadecimal del c?digo hash del objeto. 
		 */
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		//Invocando metodo instancia
		test t = new test();
		t.prueba();
		
		//Probando inicializadores static (estos solo se ejecutan una vez)
		testInicializador t1 = new testInicializador();
		testInicializador t2 = new testInicializador();
		testInicializador t3 = new testInicializador();
	}

}
