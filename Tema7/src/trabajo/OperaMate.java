package trabajo;

//OperaMat intenta (sin �xito) crear una clase gen�rica
//que puede calcular varias funciones num�ricas,
//como el rec�proco o parte fraccionaria, dado cualquier tipo de n�mero.
class OperaMate <T extends Number>{
	 // En este caso, el argumento de tipo
	 // debe ser Number o una subclase en Number.
	 T num;
	 // Pase al constructor una referencia a un objeto num�rico.
	 OperaMate( T n){
	     num=n;
	 }
	 
	 //Devuelve el rec�proco
	 double reciproco(){
	     return 1/num.doubleValue();
	 }
	 
	 //Devuelve parte fraccionaria
	 double fraccion(){
	     return num.doubleValue()-num.intValue();
	 }
}
