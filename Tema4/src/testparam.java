/*Paso de par�metros:
  
  -Por valor: Los par�metros se copian en las variables del m�todo. Las variables pasadas
  como par�meto no se modifican.
  -Por referencia: Las variables pasadas como par�metro se modifican puesto que al m�todo trabaja
  con las direcciones de memoria de los par�metros.
  
 */
public class testparam {

		public static void cambiar (int x) {x++;}
		
		public static void cambiar2(int[] par) {par[0]++;}
		
		public static void main(String[] args) {
			int x = 3;
			int []arrx= {3};
			cambiar(x);
			System.out.println(x);
			cambiar2(arrx);
			System.out.println(arrx[0]);
		}
}
