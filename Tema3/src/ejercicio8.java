/*Programa con metodo que trasforma números de decimal a romano*/
public class ejercicio8 {
	
	public static String decimalToRomano(int num){
		
		String rom;
		
		switch(num){
		
			case 1: rom = "I"; break;
			case 2: rom = "II"; break;
			case 3: rom = "III"; break;
			case 4: rom = "IV"; break;
			case 5: rom = "V"; break;
			case 6: rom = "VI"; break;
			case 7: rom = "VII"; break;
			case 8: rom = "VIII"; break;
			case 9: rom = "IX"; break;
			case 10: rom = "X"; break;
			case 11: rom = "XI"; break;
			case 12: rom = "XII"; break;
			case 13: rom = "XIII"; break;
			case 14: rom = "XIV"; break;
			case 15: rom = "XV"; break;
			case 16: rom = "XVI"; break;
			case 17: rom = "XVII"; break;
			case 18: rom = "XVIII"; break;
			case 19: rom = "IX"; break;
			case 20: rom = "XX"; break;
			default: rom = "Aviso: El programa solo convierte números del 1 al 20.";
		}
		
		return rom;
	}
	
	public static void main(String[] args){
		System.out.println(decimalToRomano(11));
		System.out.println(decimalToRomano(4));
	}
	
}
