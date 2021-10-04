package trabajo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email<M> {
	
	private M mail;
	
	email(M mail){
		
		this.mail = mail;
	}
	
	/**
	 * @param mail the email to set
	 */
	public void setMail(M mail) {
		this.mail = mail;
	}
	/*
	/**
	 * @return the mail
	 */
	public M getMail() {
		return mail;
	}

	/**
	 * Método para comprobar que el email es correcto
	 */
	public void checkMail() {
		
		// Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
        Matcher mather = pattern.matcher((String) mail);
        
        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            System.out.println("El email ingresado es inválido.");
        }
	}

	/**
	 * @return La posición de @ en valor int
	 */
	public int posicionArroba() {
		
		return ((String) mail).indexOf("@");
		
	}
	
	/**
	 * @return Devuelve como String el mominio del email
	 */
	public String dominio() {
		
		return ((String) mail).substring(posicionArroba()+1);
		
	}
	
	/**
	 * @return Devuelve como String el usuario del email
	 */
	public String usuario() {
		
		return ((String) mail).substring(0,posicionArroba());
		
	}
	
	public static void main(String[] args) {
		
		email<String> iEm = new email<String>("prueba.a@mail.com");
		iEm.checkMail();
		System.out.println("El usuario del correo es: "+iEm.usuario());
		System.out.println("El dominio del correo es: "+iEm.dominio());
		System.out.println("La posición de @ es: "+iEm.posicionArroba());
	}

}
