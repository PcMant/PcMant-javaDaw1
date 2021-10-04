/*Programa que dice cual es valor mayor y menos de las variables a, b y c*/
public class ejercicio1 {
	
	public static void main(String[] args){
		int a=5, b=8, c=12;
		
		if(a>=b && a>=c && b>=c){
			System.out.println("El valor mayor es "+a+" y el valor menor es "+c);
		}else if(a>=b && a>=c && c>=b){
			System.out.println("El valor mayor es "+a+" y el valor menor es "+b);
		}if(b>=a && b>=c && a>=c){
			System.out.println("El valor mayor es "+b+" y el valor menor es "+c);
		}if(a>=b && a>=c && c>=a){
			System.out.println("El valor mayor es "+a+" y el valor menor es "+a);
		}if(c>=b && c>=a && a>=b){
			System.out.println("El valor mayor es "+c+" y el valor menor es "+b);
		}if(c>=b && c>=a && b>=a){
			System.out.println("El valor mayor es "+c+" y el valor menor es "+a);
		}if(b>=c && b>=a && a>=c){
			System.out.println("El valor mayor es "+b+" y el valor menor es "+c);
		}if(b>=c && b>=a && a<=c){
			System.out.println("El valor mayor es "+b+" y el valor menor es "+a);
		}
	}

}
