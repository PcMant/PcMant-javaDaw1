/*
 * El programa mostrará los siguientes literales "temperaturas1!=temperatuas2" y
 * "temperaturas1==temperaturas3" porque en el primer caso, aunque los datos son los mismos, el objeto es diferente
 * y en el segundo caso, al asignar temperaturas3=temperaturas1 hace que temperaturas3 referencia al mismo objeto
 * (apunta al mismo lugar en la memoria, no se duplican los datos), y en ese caso el método equals si da como resultado
 * true.
 * */
public class metodosVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] temperaturas1= {10,11,12,11,10,9,18,19,14,13,15,15};
		byte[] temperaturas2=(byte[]) temperaturas1.clone();
		byte[] temperaturas3=temperaturas1;
		
		if(temperaturas1.equals(temperaturas2)) {
			System.out.println("temperaturas1==temperaturas2");
		}else {
			System.out.println("temperaturas1!=temperaturas2");
		}
		
		if(temperaturas1.equals(temperaturas3)) {
			System.out.println("temperaturas1==temperaturas3");
		}else {
			System.out.println("temperaturas1!=temperaturas3");
		}
	}

}
