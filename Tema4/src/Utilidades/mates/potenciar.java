package Utilidades.mates;

public class potenciar {
	
	int potencia(int num, int exp){
		
		if(exp == 1){
			return num;
		}else{
			return num*potencia(num,exp-1);
		}
		
	}

}
