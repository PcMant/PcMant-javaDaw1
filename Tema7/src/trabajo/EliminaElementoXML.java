package trabajo;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

public class EliminaElementoXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerFactoryConfigurationError, TransformerException {
		
		// Cargar el XML original
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(new File("src/trabajo/ejmplo.xml"));

		// Buscar y eliminar el elemento <student rollno="500"> de entre 
		//muchos elementos <student> ubicados en cualquier posicion del documento
		NodeList items = doc.getElementsByTagName("student");
		for (int ix = 0; ix < items.getLength(); ix++) {
		    Element element = (Element) items.item(ix);
		    // elejir un elemento especifico por algun atributo
		    if (element.getAttribute("rollno").equalsIgnoreCase("500")) {
		        // borrar elemento
		        element.getParentNode().removeChild(element);
		    }
		}

		//Exportar nuevamente el XML
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		Result output = new StreamResult(new File("src/trabajo/ejmplo.xml"));
		Source input = new DOMSource(doc);
		transformer.transform(input, output);

	}

}
