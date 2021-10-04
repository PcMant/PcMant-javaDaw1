/*Metodos en instancia*/
public class cuadrado extends figura { //Con la sentencia extends la clase hedera de otra clase
	private int lado;
	cuadrado(int l){this.lado = l;}
	public int getArea() { return lado*lado;}
}
