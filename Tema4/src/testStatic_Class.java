/*
-Probando las reglas de métodos estáticos y de clase.

Reglas:
	1.Los métodos static no tienen referencia this.
	2.Un método static no puede acceder a miembros que no sean static.
	3.Un método no static puede acceder a miembros static y no static.
*/
public class testStatic_Class {
	public int dato = 0;
	public static int datostatico = 0;
	
	public void metodo() {this.datostatico++;}
	
	public static void metodostatico() {
		this.datostacio++; //Esto da error al compilar debido a que los métodos static no pueden usar this
		datostatico++;
	}
	
	public static void main(String[] args) {
		dato++; //Esto da error al compilar ya que lo metodos static no puede acceder a miembros no static
		datostatico++;
		metodostatico();
		metodo(); //Esto da error al compilar este debido a la primera regla por lo del metodo this
	}
}
