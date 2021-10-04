/**
 * 
 * @author Normal User
 * Realiza un programa que genera una matriz 5x8 y muestre los elementos en forma de matriz
 */
public class resuelto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][8];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				matriz[i][j]=i+j;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
