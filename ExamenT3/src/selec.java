import java.util.Scanner;

/*progrma que dice si sacas 5 aprobado, si sacaste 10 enorabuena, tienes una matricula de honor*/
public class selec {

	public static void main(String[] args){
		
		//Declaración de variables
		Scanner teclado = new Scanner(System.in);
		int pn1, pn2, pn3, ne1, ne2, ne3, s1, s2, s3;
		int mp, me, ms;
		
		//Pide notas por examén de programación y hace la media.
		System.out.print("Introducce la nota del primer examén de programación: ");
		pn1 = teclado.nextInt();
		System.out.print("Introducce la nota del segundo examén de programación: ");
		pn2 = teclado.nextInt();
		System.out.print("Introducce la nota del tercer examén de programación: ");
		pn3 = teclado.nextInt();
		
		mp = (pn1+pn2+pn3)/3;
		
		//Pide las notas por examén de entornos y hace la media.
		System.out.print("Introducce la nota del primer examén de entornos: ");
		ne1 = teclado.nextInt();
		System.out.print("Introducce la nota del segundo examén de entornos: ");
		ne2 = teclado.nextInt();
		System.out.print("Introducce la nota del tercer examén de entornos: ");
		ne3 = teclado.nextInt();
		
		me = (ne1+ne2+ne3)/3;
		
		//Pide las notas por examén de sistemas y hace la media.
		System.out.print("Introducce la nota del primer examén de sistemas: ");
		s1 = teclado.nextInt();
		System.out.print("Introducce la nota del segundo examén de sistemas: ");
		s2 = teclado.nextInt();
		System.out.print("Introducce la nota del tercer examén de sistemas: ");
		s3 = teclado.nextInt();
		
		ms = (s1+s2+s3)/3;
		
		
		//Comprueba si has supendido y aprobado programación o si tienes matricula por asignaturas las siguientes estructuras de selección
		if(mp >= 10){//Programación
			System.out.println("Enorabuena tienes una matrícula de honor en programación.");
		}else if(mp >= 5) {
			System.out.println("Has aprobado programación.");
		}else {
			System.out.println("Has suspendido programación.");
		}
		
		if(me >= 10){//Entornos
			System.out.println("Enorabuena tienes una matrícula de honor en entornos.");
		}else if(me >= 5) {
			System.out.println("Has aprobado entornos.");
		}else {
			System.out.println("Has suspendido entornos.");
		}
		
		if(ms >= 10){//Sistemas
			System.out.println("Enorabuena tienes una matrícula de honor en sistemas.");
		}else if(ms >= 5) {
			System.out.println("Has aprobado sistemas.");
		}else {
			System.out.println("Has suspendido sistemas.");
		}
	}
	
}
