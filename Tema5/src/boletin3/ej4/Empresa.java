package boletin3.ej4;

/**
 * Clase Empresa que hereda de Contacto y además tiene un atributo paginaWeb
 */
public class Empresa extends Contacto {
	/**
	 * Atributo paginaWeb de la Empresa
	 */
	private String paginaWeb;

	/**
	 * Constructor de Empresa que llama al constructor del padre y además la
	 * paginaWeb
	 * 
	 * @param nombre    El nombre de la Empresa que no puede ser nulo ni estar en
	 *                  blanco
	 * @param telefono  El teléfono de la Empresa que debe ser mayor que 0
	 * @param paginaWeb La página web de la Empresa que no puede ser nulo ni estar
	 *                  en blanco
	 */
	public Empresa(String nombre, long telefono, String paginaWeb) {
		super(nombre, telefono);
		if (paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}
	}

	/**
	 * Método get de paginaWeb que devuelve su valor
	 * 
	 * @return El valor de la página web de la Empresa
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Método toString de Empresa que llama al padre y devuelve también la página
	 * web
	 */
	public String toString() {
		return super.toString() + ", página web " + paginaWeb;
	}

	/**
	 * Método compareTo que llama al del padre
	 */
	public boolean compareTo(Object o) {
		return super.compareTo(o);
	}
}
