/*Consumo de luz casa*/
public class consumodeluz {
	//Variables
	private static double potencia=13.82, energia=24, precioEnergia=0.173089, alquilerEquipos=0.77;
	private static double pEConsumida=0; //Variable referente al pago de energia consumida
	
	public static double pagoEnergiaConsumida(){ //Metodo calcula el pago de energia consumida sin impuestos
		pEConsumida = potencia+(precioEnergia*energia)+alquilerEquipos;
		return pEConsumida;
	}
	
	public static double impuestos() { //Método que calcula el impuesto
		return pEConsumida*0.21;
	}
	
	public static double pagoTotal() { //Método que calcula el precio con los impuestos añadidos
		return pEConsumida*1.21;
	}
	
	public static void main(String[] args) {
		consumodeluz f= new consumodeluz(); //Constructor
		f.pagoEnergiaConsumida(); //Lo ejecuto ya que va guardado en variable sin impuestos y este metodo lo tiene que ejecutar, de lo contrario va a salir 0
		System.out.println(f.pagoTotal());
	}
}
