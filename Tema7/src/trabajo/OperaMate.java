package trabajo;

//OperaMat intenta (sin éxito) crear una clase genérica
//que puede calcular varias funciones numéricas,
//como el recíproco o parte fraccionaria, dado cualquier tipo de número.
class OperaMate <T extends Number>{
	 // En este caso, el argumento de tipo
	 // debe ser Number o una subclase en Number.
	 T num;
	 // Pase al constructor una referencia a un objeto numérico.
	 OperaMate( T n){
	     num=n;
	 }
	 
	 //Devuelve el recíproco
	 double reciproco(){
	     return 1/num.doubleValue();
	 }
	 
	 //Devuelve parte fraccionaria
	 double fraccion(){
	     return num.doubleValue()-num.intValue();
	 }
}
