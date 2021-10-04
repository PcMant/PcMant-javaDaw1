/*Programa que recoge una cantidad de dinero y
 * lo divide en billetes dando la cantidad.
 */
public class A12Pg35 {
	public static void main(String[] arg) {
		int dinero=232;
		int b200, b20, b10;
		
		//deslosado del dinero en billetes de 200, 20 y 10.
		b200 = dinero/200;
		System.out.println(b200+" billetes de 200");
		dinero = dinero-(b200*200);
		b20 = dinero/20;
		System.out.println(b20+" billetes de 20");
		dinero = dinero-(b20*20);
		b10 = dinero/10;
		System.out.println(b10+" billetes de 10");
		
		int drestante = dinero-b10*10;
		System.out.println("Dinero restante "+drestante+" euros.");
		
	}

}
