package trabajo;

public class usandoArrays {

	public static void main(String[] args) {
		
		//Inicializando Array
		String [] paises= {"Espa�a","M�xico","Colombia","Per�","Chile","Argentina","Ecuador","Venezuela"};
		
		//Listando elementos del array
		for(String elemento:paises) { //Bucle for each en Java (el for mejorado), disponible desde versi�n 5
			System.out.println(elemento);
		}
	}
	
}
