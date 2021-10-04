import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Empleado mis_empleados[]=new Empleado[6];
		
		mis_empleados[0]=new Empleado ("Juan",8000, 2001,12,5); 
		mis_empleados[1]=new Empleado ("Maria",9000, 2001,11,5);
		mis_empleados[2]=new Empleado ("Lucas",10000, 2001,10,5);
		
		//BUCLE FOR QUE VAYA AUMENTANDO EL SUELDO A LOS EMPLEADOS
		
		for (int i=0;i<=2;i++) {
			
			mis_empleados[i].subir_sueldo(5); //sube el sueldo a los 3 de forma mas rapida
		}
		System.out.println(mis_empleados[1].dame_nombre());
	}

}