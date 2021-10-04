import java.util.Scanner;

/*Programa que ayuda a elegir el RAID que necesitas y si es coveniente añadir cache nvme a servidores NAS*/
public class elegirConfigNAS {
	
	public static void main(String[] args) {
		
		//Definición de variables
		Scanner teclado = new Scanner(System.in);
		boolean estado=true; //para el bucle principal, determina hasta cuando sigue el programa
		boolean setError=true; //determina hasta cuando se va a ejecutar el bucle de entrada erronea del menu principal
		boolean setJump=false; //sirve para saltarse los dos ultimos bloques del bucle principal
		int set; //selección menú principal
		char continuar =' '; //Para saber si se quiere repetir
		
		//variables necesarias para saber la configuración ideal
		char domestico =' ';
		char bbd =' ';
		char archivosRecu;
		char velocidad =' ';
		char seguridad =' ';
						
		//El menu principal
		System.out.println("###Asistente de decisión de configuración NAS###");
		System.out.println();
		System.out.println("1. Asistente para elegir RAID.");
		System.out.println("2. Asistente para saber si necesitas añadir cache NVME.");
		System.out.println("3. Salir del programa.");
		System.out.println();
		System.out.print("Selecciona una opción: ");
		set = teclado.nextInt();
		
		//Bucle principal, el que permite seguir ejecutando el programa
		while(estado!=false){
			
			//Reinicio de valores de variables
			setJump=false;
			setError=true;
			
			switch(set) {
			case 1:
				//RECOPILACION DE DATOS MEDIANTE PREGUNTAS AL USUARIO
				System.out.print("¿Primoriza la velocidad?(S/N): ");
				velocidad = teclado.next().charAt(0);

				while(velocidad!='N' && velocidad!='n' && velocidad!='S' && velocidad!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Primoriza la velocidad?(S/N): ");
					velocidad = teclado.next().charAt(0);
				}
				
				System.out.print("¿Primoriza la seguridad de los datos?(S/N): ");
				seguridad = teclado.next().charAt(0);
				
				while(seguridad!='N' && seguridad!='n' && seguridad!='S' && seguridad!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Primoriza la seguridad de los datos?(S/N): ");
					seguridad = teclado.next().charAt(0);
				}
				
				System.out.print("¿Va a usar bases de datos?(S/N): ");
				bbd = teclado.next().charAt(0);
				
				while(bbd!='N' && bbd!='n' && bbd!='S' && bbd!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Va a usar bases de datos?(S/N): ");
					bbd = teclado.next().charAt(0);
				}
				
				//Recomendación al usuario
				if((velocidad=='n' || velocidad=='N' || velocidad=='s' || velocidad=='S') && (seguridad=='n' || seguridad=='N') && (bbd=='n' || bbd=='N')){
					System.out.println("Se le recomienda un Raid0.");
				}else if((velocidad=='n' || velocidad=='N') && (seguridad=='s' || seguridad=='S') && (bbd=='n' || bbd=='N')){
					System.out.println("Se le recomienda un Raid5.");
				}else{
					System.out.println("Se le recomienda un Raid10");
				}
				
				System.out.println();
				break;
				
			case 2:
				//RECOPILACION DE DATOS MEDIANTE PREGUNTAS AL USUARIO
				System.out.print("¿Va a dar un uso domestico al servidor?(S/N): ");
				domestico = teclado.next().charAt(0);

				while(domestico!='N' && domestico!='n' && domestico!='S' && domestico!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Va a dar un uso domestico al servidor?(S/N): ");
					domestico = teclado.next().charAt(0);
				}
				
				System.out.print("¿Va a alojar una Web por CMS o usar bases de datos?(S/N): ");
				bbd = teclado.next().charAt(0);
				
				while(bbd!='N' && bbd!='n' && bbd!='S' && bbd!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Va a alojar una Web por CMS o usar bases de datos?(S/N): ");
					bbd = teclado.next().charAt(0);
				}
				
				System.out.print("¿Va a ver recurrencia de archivos por uno o varios clientes?(S/N): ");
				archivosRecu = teclado.next().charAt(0);
				
				while(archivosRecu!='N' && archivosRecu!='n' && archivosRecu!='S' && archivosRecu!='s') {
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Va a ver recurrencia de archivos por uno o varios clientes?(S/N): ");
					archivosRecu = teclado.next().charAt(0);
				}
				
				//Recomendación al usuario
				if((domestico=='s' || domestico=='S' || domestico=='n' || domestico=='N') && (bbd=='n' || bbd=='N') && (archivosRecu=='n' || archivosRecu=='N')){
					System.out.println("No es recomendable añadir cache.");
					System.out.println("En este caso podría penalizar negativamente el rendimiento.");
				}else {
					System.out.println("Es recomentable que añada cache");
					System.out.println("Al añadir cache consigues mejor rendimiento debido a que no tiene que buscar en los discos las consultas mas recurrentes.");
				}
				
				
				System.out.println();
				break;
				
			case 3: 
				System.out.println("Fin del programa.");
				estado = false;
				break;
				
			default: //este bloque pedirá una opción hasta que des un valor correcto
				while(setError==true) {
					System.err.println("Error: Entrada de teclado incorrecta debes de introduccir un valor del 1 al 3.");
					System.out.print("Selecciona una opción: ");
					set = teclado.nextInt();
					if(set>=1 && set<=2) {
						setJump=true;
						setError=false;
					}
				}
				
			}
			
			//Chequeo de si se quiere continuar
			if(set>=1 && set<=2 && setJump==false){
				System.out.print("¿Desea continuar?(S/N): ");
				continuar = teclado.next().charAt(0);
				
				if(continuar=='N' || continuar=='n') {
					System.out.println("Fin del programa.");
					estado=false;
				}else if(continuar=='S' || continuar=='s'){
					estado=true;
				}
				while(continuar!='N' && continuar!='n' && continuar!='S' && continuar!='s') {
					
					System.err.println("Error: Entrada de teclado incorrecta.");
					System.out.print("¿Desea continuar?(S/N): ");
					continuar = teclado.next().charAt(0);
					if(continuar=='N' || continuar=='n') {
						System.out.println("Fin del programa.");
						estado=false;
						break;
					}else if(continuar=='S' || continuar=='s'){
						estado=true;
						break;
					}
				}
			}
			
			//En caso de querer continuar se volverá al menú principal
			if(set!=3 && estado!=false && set>=1 && set<=2 && setJump==false) {
			System.out.println();
			System.out.println("###Asistente de decisión de configuración NAS###");
			System.out.println();
			System.out.println("1. Asistente para elegir RAID.");
			System.out.println("2. Asistente para saber si necesitas añadir cache NVME.");
			System.out.println("3. Salir del programa.");
			System.out.println();
			System.out.print("Selecciona una opción: ");
			set = teclado.nextInt();
			}
		}
	}
}
