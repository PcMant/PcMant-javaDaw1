/*Ejercicio 4:
 * Realiza una clase conversor que tenga las siguientes características:
 * -Toma como parámetro en el constructor un valor entero.
 * -Tiene un método getNumero que dependiendo del parámetro devolverá el mismo número en el siguiente formato.
 * -Realiza un método main en la clase para probar todo lo anterior.
 */
public class Ej4 {
		
	int num;
	
	Ej4(int num){
		this.num = num;
	}
	
	String getNumero(char c){
		
		switch(c) {
			case 'B': 
				return Integer.toBinaryString(num);
				//break;
			case 'H': 
				return Integer.toHexString(num);
				//break;
			case 'O': 
				return Integer.toOctalString(num);
				//break;
			default: return "Parámetro erronio";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ej4 c = new Ej4(10);
		System.out.println(c.getNumero('B'));
		System.out.println(c.getNumero('H'));
		System.out.println(c.getNumero('O'));
		System.out.println(c.getNumero('D'));
	}

}
