
public abstract class forma {
	void identidad() {System.out.println(this);}
	abstract public String toString();
}

class circulo extends forma {
	public String toString() {return "círculo";}
}

class cuadrado extends forma{
	public String toString() {return "cuadrado";}
}

class trigangulo extends forma{
	public String toString() {return "triángulo";}
}

class rombo extends forma{
	public String toString() {return "rombo";}
}
