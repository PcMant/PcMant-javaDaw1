package trabajo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * @author
 * Clase que contiene  lo básico para tratar ficheros XML
 */
public class FicheroXML {

	private org.w3c.dom.Document documentoXML = null;   // Documento XML en si
	private String rutaFicheroXML = "nombrepordefecto"; // Ruta del fichero XML en nuestro sistema
	private int cantidadtotalnodos;                     // Número total de nodos del fichero

	//con los cuales podremos crear un fichero XML desde cero y también podremos cargarlo desde disco
	/**
	* Constructor
	* @param rutaFicheroXML Ruta del fichero XML a crear
	*/
	public FicheroXML(String rutaFicheroXML)
	{
	    this.rutaFicheroXML = rutaFicheroXML;
	    cantidadtotalnodos = 0;
	}
	
	/**
	* Carga un fichero XML
	* @throws ParserConfigurationException
	* @throws SAXException
	* @throws IOException 
	*/
	public void cargarFicheroXML() throws ParserConfigurationException, SAXException, IOException
	{
	    DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	    documentoXML = documentBuilder.parse(new File(this.rutaFicheroXML));
	}
	 
	/**
	* Crea el fichero XML
	* @param etiquetaraiz Etiqueta del nodo raíz del fichero XML
	* @throws ParserConfigurationException
	* @throws TransformerConfigurationException
	* @throws TransformerException 
	*/
	public void crearFicheroXML(String etiquetaraiz) throws ParserConfigurationException, TransformerConfigurationException, TransformerException
	{
	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    DOMImplementation implementation = builder.getDOMImplementation();
	    documentoXML = implementation.createDocument(null, etiquetaraiz, null);
	    documentoXML.setXmlVersion("1.0");
	}
	
	//Cómo podemos insertar nodos
	/**
	* Obtiene el nodo raiz del fichero XML
	* @return Nodo raíz del fichero XML
	*/
	public Element obtenerNodoRaiz()
	{
	    return documentoXML.getDocumentElement();
	}
	 
	/**
	* Agrega un nodo item a la raíz del fichero XML
	* @param item Nodo a agregar a la raíz
	*/
	public void agregarItemARaiz(Element item)
	{
	    Node raiz = obtenerNodoRaiz();
	    raiz.appendChild(item);
	}
	 
	/**
	* Crea un nodo item
	* @param nombreITEM Nombre de la etiqueta de ese nodo
	* @return Nodo
	* @param atributos Lista de atributos del nodo
	* @param valoresatributos Lista de los valores de los atributos del nodo
	*/
	public Element crearNodoItem(String nombreITEM, ArrayList<String> atributos, ArrayList<String> valoresatributos)
	{
	    Element item = documentoXML.createElement(nombreITEM);
	 
	    if( atributos != null && valoresatributos != null )
	    {
	        for(int i = 0; i < atributos.size(); i++)
	        {
	            item.setAttribute(atributos.get(i), valoresatributos.get(i));
	        }
	    }
	    return item;
	}
	 
	/**
	* Agrega un nodo a un nodo item
	* @param nodoItem Nodo item
	* @param etiquetanodo Etiqueta del nodo
	* @param valor Valor del nodo
	* @param atributos Lista de atributos del nodo
	* @param valoresatributos Lista de los valores de los atributos del nodo
	*/
	public void agregarNodo(Element nodoItem, String etiquetanodo, String valor, ArrayList<String> atributos, ArrayList<String> valoresatributos)
	{
	    Element nodo = documentoXML.createElement(etiquetanodo); 
	    Text nodeKeyValue = documentoXML.createTextNode(valor);
	    nodo.appendChild(nodeKeyValue);
	 
	    if( atributos != null && valoresatributos != null )
	    {
	        for(int i = 0; i < atributos.size(); i++)
	        {
	            nodo.setAttribute(atributos.get(i), valoresatributos.get(i));
	        }
	    }
	    nodoItem.appendChild(nodo);
	}
	
	//Si queremos eliminar un nodo
	/**
	* Elimina un nodo del documento XML
	* @param nodo Nodo a eliminar
	*/
	public void eliminarNodo(Element nodo)
	{
	    Node eliminado = nodo.getParentNode().removeChild(nodo);
	}
	
	//Como guardar el fichero XML que hemos creado en disco
	/**
	* Genera y guarda el fichero XML
	* @throws TransformerConfigurationException
	* @throws TransformerException 
	*/
	public void generarFicheroXML() throws TransformerConfigurationException, TransformerException
	{
	    Source source = new DOMSource(documentoXML);
	    Result result = new StreamResult(new java.io.File(rutaFicheroXML));
	    Transformer transformer = TransformerFactory.newInstance().newTransformer();
	    transformer.transform(source, result);
	}
}