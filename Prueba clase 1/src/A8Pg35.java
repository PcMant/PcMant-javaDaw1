/*Programa que genera letras aleatorias y determina si son
 * vocales o consonantes.
 */
public class A8Pg35 {
	public static void main(String[] arg) {
		String letra = ""; 
		//Generando n?meros aleatorios correspondiente al alfabeto ASCII en minusculas
		int caracter = (int)Math.floor(Math.random()*(122 - 97)+97); 
		System.out.println(caracter);
		//para pasar el c?digo a car?cter basta con hacer un cast a char 
        letra = letra + (char)caracter;
        //String letra = Integer.toString(letra);
		System.out.println(letra);
		//comparando si es vocal o consonante a partir del c?digo ASCII
		if((caracter == 97) || (caracter == 101) || (caracter == 105) || (caracter == 111) || (caracter == 117)){
			System.out.println("La letra es vocal");
		}else{
			System.out.println("La letra es consonante");
		}
	}

}
