
public class rectangulo implements Cloneable, intfigura{

	private int ancho = 0;
	private int alto = 0;
	private String nombre = "NULL";
	
	rectangulo(int an, int al){
		
		ancho = an; //se puede omitir el this
		this.alto = al;
	}
	
	rectangulo(){
		ancho=alto=0;
	}
	
	rectangulo(int dato){
		ancho=alto=dato;
	} //Al hacer constructores Java elige el m?s adecuado entre los metodos rectangulo
	
	rectangulo(rectangulo r){ //Metodo que permite contructores de copia
		this.ancho = r.getAncho();
		this.alto = r.getAlto();
	}
	
	public int getAncho(){ return this.ancho;}
	public int getAlto(){ return alto;} //se puede omitir el this
	
	public rectangulo incrementarAncho(){
		ancho++; //se puede omitir el this
		return this;
	}
	
	public rectangulo incrementarAlto(){
		this.alto++;
		return this;
	}
	
	public void setNombre(String nom){nombre = nom;}
	public String getNombre(){ return nombre;}	
	
	
	public Object clone(){
		Object objeto = null;
		try{
			objeto = super.clone();
		}catch(CloneNotSupportedException ex){
			System.out.println("Error al duplicar.");
		}
		
		return objeto;
	}
	
	//La sentencia protected evita que pueda ser invocado fuera de la clase
	protected void finalize() {System.out.println("Adios");}
	
	//Metodos de la interfaz implementada intfigura
	public int area() {return ancho*alto;}
	
	public static void main(String[] args){
		
		//
		
	}
}
