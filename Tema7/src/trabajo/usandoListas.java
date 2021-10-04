package trabajo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class usandoListas {

	public static void main(String[] args) {
		
		// Definimos una ArrayList
		List list = new ArrayList();
		
		// Añadimos elementos
		list.add("Peralta");
		list.add("Santiago");
		list.add("Linetti");
		list.add("Diaz");
		list.add("Charles");
		list.add("Holt");
		
		// Obtenemos un Iterador y recorremos la lista.
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
		  System.out.println(iter.next());
		}

	}

}
