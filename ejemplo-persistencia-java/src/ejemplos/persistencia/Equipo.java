package ejemplos.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Equipo {

	private String nombre;
	private List<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public Equipo() {
	}

	public Element serializar(Document doc) {
		Element elementoEquipo = doc.createElement("Equipo");
		elementoEquipo.setAttribute("nombre", this.nombre);
		Element elementoJugadores = doc.createElement("Jugadores");
		elementoEquipo.appendChild(elementoJugadores);
		for (Jugador jugador : this.jugadores) {
			elementoJugadores.appendChild(jugador.serializar(doc));
		}
		return elementoEquipo;
	}

	public void agregarJugador(Jugador unJugador) {
		this.jugadores.add(unJugador);
	}

	public static Equipo hidratar(Document doc) {
		Equipo nuevoEquipo = new Equipo();
		Element elementoEquipo = (Element)doc.getElementsByTagName("Equipo").item(0);
		nuevoEquipo.nombre = elementoEquipo.getAttribute("nombre");
		Element elementoJugadores = (Element)doc.getElementsByTagName("Jugadores").item(0);
		for(int i=0; i< elementoJugadores.getChildNodes().getLength(); i++) {
			Jugador jugador = Jugador.hidratar(elementoJugadores.getChildNodes().item(i));
			nuevoEquipo.agregarJugador(jugador);
		}
		return nuevoEquipo;
	}

	public String getNombre() {
		return this.nombre;
	}

}
