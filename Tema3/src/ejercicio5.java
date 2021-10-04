/*programa que calcula el número de la suerte, este consiste en la suma de número a número individual
de la fecha de nacimiento, luego queda un número de dos cifras y se realiza la misma operación hasta una unica cifra */
public class ejercicio5 {
	
	public static int luckyNumber(int d, int m, int a){
		
		int dia = d;
		int mes = m;
		int year = a;
		
		//Suma de los datos introduccidos
		int sumaSu1 = dia + mes + year;
		
		//Deslose digito a digito el resultante de la suma de datos introducidos
		int n1=0;
		if(sumaSu1>=1000){
			n1 = sumaSu1/1000;
		}
		int n2=0;
		if(n1>=1){
			n2 = (sumaSu1-(n1*1000))/100;
		}
		int n3=0;
		if(n2>=1){
			n3 = (sumaSu1-((n2*100)+(n1*1000)))/10;
		}
		int n4 = sumaSu1-((n2*100)+(n1*1000)+(n3*10));
		
		//suma de los números deslosados y deslosados de nuevo
		int sumaSu2 = n1 + n2 + n3 + n4;
		int nf1 = 0;
		if(sumaSu2>=10){
			nf1 = sumaSu2/10;
		}
		int nf2 = sumaSu2-(nf1*10);
		
		//suma del nuevo deslose para conocer el número de la suerte
		int suerte = nf1 + nf2;
		
		return suerte;
	}
	
	public static void main(String[] args){
		System.out.println(luckyNumber(16,8,1973));
		System.out.println(luckyNumber(22,8,1995));
	}
	
}
