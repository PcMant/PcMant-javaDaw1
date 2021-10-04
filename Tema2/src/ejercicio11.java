/*Programa que determina cuantos clientes se pueden atender
 * haciendo papas con chocos con lo que hay en el almacen
 */
public class ejercicio11 {
	double clientes, klsPapas, klsPC, klsChocos, klsCC;
	
	public ejercicio11(double kpa, double kc) { //Establece kg de papas y chocos
		klsPapas = kpa;
		klsChocos = kc;
	}
	
	public void setKls(double kpa, double kc) { //Establece kg de papas y chocos
		klsPapas = kpa;
		klsChocos = kc;
	}
	
	public void setPapas(double kpa) { //Establece kg de papas
		klsPapas = kpa;
	}
	
	public void setChocos(double kc) { //Establece kg de chocos
		klsChocos = kc;
	}
	
	public void addChocos(int x) { //Incrementa los Chocos
		klsChocos+=x;
	}
	
	public void addPapas(int x) { // Incrementa las papas
		klsChocos+=x;
	}
	
	public int getComensales() {
		klsPC = klsPapas*3; //3 clientes por cada kg de papas
		klsCC = (klsChocos*0.5)*3; //3 clientes por cada medio kilo de chocos
		
		//Estructura de control que determina los comensales en función de los kgs de papas y chocos juntos
		if(klsPC == klsCC) {
			clientes = klsPC;
		}else if(klsPC!=klsCC && klsPC > klsCC){
			clientes = klsCC;
		}else if(klsPC!=klsCC && klsCC > klsPC) {
			clientes = klsPC;
		}
		
		return (int) clientes;
	}
	
	public void showChocos() { //Imprime los kilos de chocos
		System.out.println(klsChocos+" kg de chocos.");
	}
	
	public void showPapas() { //Imprime los kilos de papas
		System.out.println(klsPapas+" kg de papas.");
	}
	
	public static void main(String[] args) {
		ejercicio11 c = new ejercicio11(10,5);
		System.out.println(c.getComensales()+" comensales a los que se les puede servir chocos con papas con el stock actual.");
		c.showChocos();
		c.showPapas();
	}
}
