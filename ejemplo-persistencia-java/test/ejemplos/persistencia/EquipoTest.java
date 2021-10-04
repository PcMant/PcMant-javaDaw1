package ejemplos.persistencia;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class EquipoTest {

	private String nombreArchivo;

	@Before
	public void before() {
		this.nombreArchivo = java.util.UUID.randomUUID().toString() + ".xml";
	}
	
	@After
	public void after() {
		File archivo = new File(this.nombreArchivo);
		if (archivo.exists()) {
			archivo.delete();
		}
	}
	
	@Test
	public void guardarYRecuperar() throws ParserConfigurationException, TransformerException, SAXException, IOException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		Equipo equipoA = new Equipo("EquipoA");
		Jugador juan = new Jugador("Juan");
		Jugador pepe = new Jugador("Pepe");
		equipoA.agregarJugador(juan);
		equipoA.agregarJugador(pepe);
		Element equipoSerializado = equipoA.serializar(doc);
		Assert.assertNotNull(equipoSerializado);
		
		// hasta aqui hemos serializado el equipo con todo su contenido
		// ahora tenemos que bajarlo a disco
		
		doc.appendChild(equipoSerializado);
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		File archivoDestino = new File(this.nombreArchivo);
		StreamResult result = new StreamResult(archivoDestino);
		transformer.transform(source, result);
		
		File archivo = new File(this.nombreArchivo);
		Assert.assertTrue(archivo.exists());

		// ahora hacemos lo inveso, levantamos el archivo de disco y 
		//  y verificamos que los objetos se hidratan correctamente

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(archivo);
		doc.getDocumentElement().normalize();
		
		Equipo equipoCargado = Equipo.hidratar(doc);
		Assert.assertNotNull(equipoCargado);
		Assert.assertEquals(equipoA.getNombre(), equipoCargado.getNombre());
	}

}
