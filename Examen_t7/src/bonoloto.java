/*
 * Programa que genera un sorteo de la bonoloto.
 * En el se obtienen 6 valores númericos aleatorios del 1 al 49 y
 * un valor numérico aleatorio del 1 al 49 llamado complementario.
 */
/**
 * @author Juan
 *Clase principal de la bonoloto
 *La clase es de tipo abstracta
 */
public abstract class bonoloto {
	
	protected int posibilidades;
	public abstract int lanzar(); //Este metodo ha de ser definido
	
	/**
	 * @param args
	 * En este método main se prueba el programa y se obtiene los resultados del sorteo.
	 */
	public static void main(String[] args) {
		
		//Ejecutando el resultado del sorteo
		ejecutar bono = new ejecutar(); //Creo el objeto de la clase ejecutar.
		bono.resultado(); //Ejecuto un método que me muestra los resultados por pantalla.
		
	}

}

/**
 * Clase que hereda de la clase principal bonoloto.
 * Clase que se encarga de valores de la bonoloto.
 */
final class valores extends bonoloto{
	
	int posibilidades=49; //Las posibilidades que hay en el lanzamiento
	
	/**
	 *@return Devuelve valores aleatorios del 1 al 49.
	 */
	public int lanzar() {
		
		return (int) (Math.random()*posibilidades+1); //Setencia que retorna los valores aleatorios según las posibilidades
	}
	
}

/**
 * Clase que hereda de la clase principal bonoloto.
 * Clase que se encarga de sacar el número complementario de la bonoloto.
 */
final class complementario extends bonoloto{ //Dicha clase utiliza la etiqueta final que significa que no permite herencia
	
	int posibilidades=49; //Las posibilidades que hay en el lanzamiento
	
	/**
	 * @return Devuelve valores aleatorios del 1 al 49.
	 */
	public int lanzar() {
		
		return (int) (Math.random()*posibilidades+1); //Sentencia que retorna los valores aleatorios según las posibilidades
		
	}
	
}

/**
 * Esta clase ejecuta el sorteo.
 *Se compone de los métodos lanzamiento es un método privado y genera los números del sorteo.
 *resultado(resultado da el resultante del sorteo por pantalla invocando) este invoca el método
 *lanzamiento para poder sacar resultados.
 */
class ejecutar{
	
	valores v = new valores(); //Creando objeto de la clase valores
	complementario c = new complementario(); //Creando objeto de la clase complementario
	int comple; //Variable que almacenara el complementario obtenido
	int[] valor = new int[6]; //Array que almacenará los valores obtenidos.

	/**
	 * Genera los números aleatorios, 6 valores y un complementario
	 * El nivel de acceso es private, solo la clase tendrá acceso
	 */
	private void lanzamiento(){ //Esta clase usa la etiqueta private, solamente la clase tiene acceso
		
		for(int i=0; i<6; i++) { //Este bucle crea 6 numeros aleatorios que almacena en array valor
			valor[i]=v.lanzar(); //Genera el número aleatorio y lo guarda en el array valor
		}
		
		comple = c.lanzar(); //Genera el número aleatorio y lo guarda en la variable comple
		
	}
	
	/**
	 * Imprime por pantalla los valores obtenidos.
	 */
	public void resultado() {
		
		lanzamiento(); //Invoco al método lanzamiento para poder obtener los números aleatorios.
		
		System.out.print("Los valores sacados son: ");
		
		for(int i:valor) { //Este bucle recorre el array valor
			System.out.print(i+" "); //Imprime por pantalla los 6 valores obtenidos
		}
		
		System.out.println(" complementario: "+comple+"."); //Imprime por pantalla los valores complementarios
		
	}
	
}