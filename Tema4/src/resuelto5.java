/*transforma y cambia base de números decimales*/
public class resuelto5 {
	
	public static void muestraCifra(int dat) {
		if(dat<10) {
			System.out.print(dat);
		}else{
			dat-=10;
			char c = (char) ('A'+dat);
			System.out.print(c);
		}
	}
	
	
	public static void transforma(int dato, int base){
		if(base>dato){
			muestraCifra(dato);
		}else{
			transforma(dato/base,base);
			muestraCifra(dato%base);
		}
	}
	public static void main(String[] args){
		transforma(8,2);
		System.out.println("");
		transforma(12,16);
		System.out.println("");
		transforma(13,8);
		System.out.println("");
	}

}
