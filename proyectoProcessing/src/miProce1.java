
import processing.core.*; //Importa la libreria de processing

public class miProce1 extends PApplet{ //La clase extends hedera de PApplet mediante el metodo extends
	/*
	PApplet: es un applet Java del que extiende nuestra clase principal y que creará una ventana alrededor
	 de nuestro contenido para una mejor visualización.
	*/
	
	public static void main(String[] args) {		
		PApplet.main("miProce1");
	}
	
	public void settings(){ //Añado este metodo ya que no puedo dimensionar ventana con el método setup
		size(500,500);//ajusta el tamaNo de la ventana
	}
	
	public void setup(){ //Para poder usarse hay que poner public
        //ajusta el tamaNo de la ventana
        //size(500,500);
      }
       
       String msj="";
       
    public void draw (){ //Para poder usarse hay que poner public
      //pone el fondo de color gris
      background (128);
     
      //define el color a usar para pintar con base a la posiciOn del mouse y un valor aleatorio 
      fill((mouseX/2),(mouseY/2),random(255)); //Elimino los metodos int por no ser validos en esa sentencia
      
      //ajusta el tamaNo del texto  
      textSize(25);
      
      //define texto a pintar y sus coordenadas
      text("Bienvenido al Mundo de processing",40,200);
      
      //dibuja una lInea entre el origen de coordenadas y la posiciOn del mouse
      line(0,0,mouseX,mouseY);
      
      //crea el mensaje a pintar y a imprimir basado en coordenadas del mouse
      msj="mouseX: "+mouseX+" mouseY: "+mouseY;
      
      //define el color a usar para pintar
      fill(255);
     
      //define texto a pintar y sus coordenadas
      text(msj,80,250);
      
      //imprime en consola
      println(msj);
    }
}