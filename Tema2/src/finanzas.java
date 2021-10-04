
public class finanzas {

	public static double dolaresToEuros(double money){
		return money*1.36;		
	}
	
	public static double eurosToDolares(double money) {
		return money/1.36;
	}
	
	public static void main(String[] args) {
		System.out.println(dolaresToEuros(500));
		System.out.println(eurosToDolares(100));
	}
}
