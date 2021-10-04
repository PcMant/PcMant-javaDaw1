package examenT1;
/*Programa que deslosa en distintos billetes una cantidad de dinero y comprueba si
 * hay almenos un billete de 200euros y menos de 5 billetes de 20 euros*/
public class criterioJ {
	
	private static final boolean True = false;
	private static final boolean False = false;

	public static void main(String[] arg) {
		//Definición de variables
		int dinero=535, drestante;
		int b200, b20, b10, b5;
		boolean estado0,estado1;
		
		//deslosado del dinero en billetes de 200, 20 y 10.
		System.out.println("Deslose de: "+dinero+"€");
		b200 = dinero/200; //Divide la cantirdad de dinero por un tamaño de billete
		System.out.println(b200+" billetes de 200"); //imprime por pantalla el resultado
		dinero = dinero-(b200*200); //El dinero restante actualiza la variable para hacerlo con la cantidad de dinero aun sin utilizar
		b20 = dinero/20;
		System.out.println(b20+" billetes de 20");
		dinero = dinero-(b20*20);
		b10 = dinero/10;
		System.out.println(b10+" billetes de 10");
		dinero = dinero-(b10*10);
		b5 = dinero/5;
		System.out.println(b5+" billetes de 5");
		
		drestante = dinero-b5*5; //Se recoge en la variable drestante el dinero que ya no puede ser deslosado
		System.out.println("Dinero restante "+drestante+" euros."); //Se imprime por pantalla drestante
		
		if(b200>=1){ //Comprueba si hay almenos 1 billete de 200 devuelve true o false
			estado0 = true;
			System.out.println(estado0);
		}else{
			estado0 = false;
			System.out.println(estado0);
		}
		
		if(b20<5){ //Comprueba si hay menos de 5billetes de 20 devuelve true o false
			estado1 = true;
			System.out.println(estado1);
		}else{
			estado1 = false;
			System.out.println(estado1);
		}
	}

}
