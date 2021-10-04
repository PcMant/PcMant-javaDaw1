/*Programa que convierte segundos en  horas, minutos y segundos*/
public class A11Pg36 {
	
	public static void main(String[] arg) {
		//Definir variavle t metiendo una cantidad de segundos
		int t = 123456;
		
		//Convierto los segundos a horas 60*60
		int horas = t/3600;
		//Convierto los segundos a minutos pero teniendo en cuenta
		//los minutos, por eso resto
		int minutos = (t/60) - (horas*60);
		//Convierto en segundos teniendo en cuenta las horas y minutos
		int segundos = t - (minutos*60) - (horas*3600);
		
		//Devuelvo el resultado
		System.out.println(horas+":"+minutos+":"+segundos);
		
	}
}
