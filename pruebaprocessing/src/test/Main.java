package test;
import processing.core.*;

public class Main extends PApplet {

	public static void main(String[] args) {		
		PApplet.main("Main");
	}
	
	public void setup(){
        //ajusta el tamaNo de la ventana
        size(500,500);
      }
       
      /* String msj="";
       
    public void draw (){
      //pone el fondo de color gris
      background (128);
     
      //define el color a usar para pintar con base a la posiciOn del mouse y un valor aleatorio 
      fill((mouseX/2),(mouseY/2),random(255));
      
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
    }*/
	
}
