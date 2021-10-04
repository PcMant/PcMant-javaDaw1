/*9.Implementa una clase consumo, la cual forma parte de la centralita
electrónica de un coche y tiene las siguientes caracterísitcas:
Atributos:
	kms : Kilómetros recorridos por el coche
	litros : litros de combustible consumido
	vmed : velocidad media
	pgas : precio de la gasolina
Métodos:
	getTiempo : Indica tiempo empleado en realizar el viaje
	consumoMedio : Consumo medio, litos por cada 100km
	consumoEuros : consumo medio del vehículo, en euros
 */
public class consumo {
	
	private double kms, litros, vmed, pgas;
	
	/*consumo(){
		kms=litros=vmed=0;
		pgas=1.50;
	}*/
	
	//Metodos que modifican los valores de los atributos de la clase.
	public void setkms(double k){
		kms = k;
	}
	
	public void setLitros(double l) {
		litros = l;
	}
	
	public void setVmed(double vme) {
		vmed = vme;
	}
	
	public void setPgas(double p){
		pgas = p;
	}//
	
	public double getTiempo() {//devuelve el tiempo en horas
		return kms/vmed;
	}
	
	public double consumoMedio() {//Litros cada 100km
		return(litros*100)/kms;
	}
	
	public double consumoEuros() {
		return litros*pgas;
	}

}
