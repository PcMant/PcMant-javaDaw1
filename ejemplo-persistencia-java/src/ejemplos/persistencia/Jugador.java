package ejemplos.persistencia;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Jugador {

	private String nombre;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public Node serializar(Document doc) {
		Element element = doc.createElement("Jugador");
		element.setAttribute("nombre", this.nombre);
		return element;
	}

	public static Jugador hidratar(Node elementoJugador) {
		Jugador nuevoJugador = new Jugador();
		nuevoJugador.nombre = ((Element)elementoJugador).getAttribute("nombre");
		return nuevoJugador;
	}

}
