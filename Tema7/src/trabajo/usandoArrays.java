package trabajo;

public class usandoArrays {

	public static void main(String[] args) {
		
		//Inicializando Array
		String [] paises= {"España","México","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};
		
		//Listando elementos del array
		for(String elemento:paises) { //Bucle for each en Java (el for mejorado), disponible desde versión 5
			System.out.println(elemento);
		}
	}
	
}
