
public class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	private double desplazamiento;
	
	satelite (double m, double p, double d){
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	
	satelite(){
		meridiano=paralelo=distancia_tierra=0;
	}
	
	public void setPosicion(double m, double p, double d) {
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	public void variaAltura(double desp){
		desplazamiento = desp;
	}
	
	boolean enOrbita(){
		
		if(distancia_tierra == 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public void variaPosicion(double variap, double variam){
		meridiano += variap;
		paralelo += variam;
	}
	
	public void printPosicion() {
		System.out.println("El satélite se encuentra en el paralelo "+paralelo
		+" Meridiano "+meridiano+" a una distancia de la tierra de "+distancia_tierra+
		" kilómetros");
	}
}
