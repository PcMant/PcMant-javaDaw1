/*Programa que vaya multiplicando el número por dos hasta llegar a 20*/
public class bucle {

	public static void main(String [] args) {
		
		
		int num = 1;
		
		while(num<20){
			num = num * 2;
			
			if(num<20){
				System.out.println(num);
			}	
		}
	}
}
