/*Realiza una clase letras que almacene una letra y la convierta a mayúsculas.
 
métodos:
	getLetra() el cual devolverá la letra.
	printLetra() el cual muestra la letra por pantalla
 */
public class propuesto5 {
	
	private static char letra;
	
	propuesto5(char l){
		letra = l;
		if(l >='a') {
			letra -= 'a';
			letra += 'A';
		}
	}
	
	public static char getLetra() {return letra;}
	
	public static void printLetra(){
		System.out.println(letra);
	}
	
	public static void main(String[] args){
		
		
		propuesto5 let = new propuesto5('d');
		System.out.println(let.getLetra());
		let.printLetra();
	}

}
