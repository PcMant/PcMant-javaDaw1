/*Paso de parámetros:
  
  -Por valor: Los parámetros se copian en las variables del método. Las variables pasadas
  como parámeto no se modifican.
  -Por referencia: Las variables pasadas como parámetro se modifican puesto que al método trabaja
  con las direcciones de memoria de los parámetros.
  
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
