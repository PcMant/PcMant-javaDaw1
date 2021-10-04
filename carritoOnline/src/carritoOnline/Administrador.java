package carritoOnline;

public class Administrador extends Usuario { //Son los usuarios de tipo administrador
	
	//Variables de datos de Adminitrador
	private String adminName;
	private String email;
	
	public boolean updateCatalog() {
		//Sentencias para actualizar el catalogo de la tienda
		return true;
	}
	
	public boolean updateProfile() {
		/*Debido a que un Administrador no es un usuario normal este
		 * sobrescribe el método heredado updateProfile ya que tiene sus propias sentencias.
		 */
		return true;
	}

}
