import java.util.*;

//CLASE EMPLEADO//
class Empleado{

	public Empleado(String nom, float suel, int agno, int mes, int dia ) { //METODO CONSTRUCTOR QUE DA VALOR INCIAL A LAS VARIBALES DE LA CLASE U OBJETO EMPLEADO. 
		//A DIFERENCIA DEL EJEMPLO DEL COCHE AQUI SE PERMITE INTRODUCIR LOS VALORES INCIALES QUE VA A ADPOTAR LAS CARACTERISTICAS DEL OBJETO
	
		nombre=nom;
		sueldo=suel;
		
		//GregorianCalendar -- cosntruye una fecha con el dia de la semana, el dia del mes, el mes, y el año
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes -1, dia);
		alta_contrato=calendario.getTime(); //metodo get time que nos devuelve la fecha
		
		
		Id=Id_siguiente; //LA PRIMERA VEZ QUE SE INSTANCIE UNA CLASE O CREE UN OBJETO, SE LE ASIGNARÁ EL ID=1
		Id_siguiente++; //SE IRA INCREMENTANDO ESA VARIABLE ESTÁTICA
	
	}
	
	
	//METODOS
	
	public String dame_nombre() {  //METODO GETTER QUE NOS DEVUELVE EL NOMBRE DEL EMPLEADO
	
	//return ("El nombre del empleado es: "+ nombre);
	return nombre;
	
	}
	
	public float dame_sueldo(){ //METODO GETTER QUE NOS DEVUELVE EL SUELDO DE UN EMPLEADO
	
	//return ("El sueldo del empleado es: " + sueldo); PUBLIC STRING DAME_SUELDO() EN ESTE CASO
	return (sueldo);
	
	}
	
	public Date dime_fecha() { //METODO GETTER QUE NOS DEVUELVE LA FECHA DE ALTA DEL EMPLEADO
	
		//return("La fecha de alta del empleado es: "+ (Date)alta_contrato); //Nos permite concatenar cadena string con otro tipo
		return alta_contrato;
	}
	
	public void subir_sueldo(float porcentaje) { //METODO SETTER QUE INCREMENTA O AUMENTA EL SUELDO DE UN EMPLEADO
	
		float aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	
	
	}
	
	
	//METODO FINAL IMPIDE QUE EL METODO SE SOBREESCRIBA POR ALGUNA SUBLCLASE
	public final int dime_id(){
	
		return Id;
	}
	
	
	
	
	public static int dime_ids() { //PARA LLAMAR A METODO QUE DEVUELVE VALOR STATIC EL METODO DEBE SER STATIC
	
		return Id_siguiente;
	
	}
	
	//USO CONSTANTE FINAL
	/*public void cambia_nombre(String nombre) {  
	
	this.nombre=nombre;		ESTE METODO NO FUNCIONARIA AL HABER AÑADIDO LA CONSTANTE FINAL A LA VARIABLE NOMBRE
	POR TANTO NO CAMBIARIA SU VALOR
	
	}*/
	
	
	private final String nombre; //variables de la clase declaradas al final y no al principio de la clase, dando igual el orden. LA CONSTANTE FINAL IMPIDE QUE EL VALOR DE ESA VARIABLE PUEDA SER MODIFICADO O CAMBIADO
	private float sueldo;
	private Date alta_contrato;
	private int Id;
	private static int Id_siguiente=1; //DECALARACION DE CONSTANTE STATIC que defien que sera una variables usada por todos los objetos de la clase(variable de clase), y no cada objeto con una copia distinta de esa variable(variable de instancia)

}