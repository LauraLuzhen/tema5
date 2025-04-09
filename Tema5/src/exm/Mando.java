package exm;

import java.util.Objects;

import exmexcepciones.ErrorAltura;
import exmexcepciones.ErrorAnchura;
import exmexcepciones.ErrorModelo;
import exmexcepciones.ErrorPrecio;

/**
 * Clase Mando que define un mando con los siguientes atributos: modelo, altura,
 * anchura, precio y botón. Podrá encender y apagar el mando.
 */
public class Mando implements Comparable<Mando>{
	/**
	 * Atributo modelo del Mando
	 */
	private String modelo;
	/**
	 * Atributo altura del Mando
	 */
	private double altura;
	/**
	 * Atributo anchura del Mando
	 */
	private double anchura;
	/**
	 * Atributo precio del Mando
	 */
	private double precio;
	/**
	 * Atributo boton del Mando que por defecto estará a false, es decir apagado.
	 */
	private boolean boton = false;

	/**
	 * Constructor de Mando que recibe modelo, altura, anchura y precio. En caso de
	 * que no se cumplan los requisitos de cada atributo saltará la excepción
	 * correspondiente
	 * 
	 * @param modelo  El modelo del Mando que no puede ser ni nulo ni estar en
	 *                blanco
	 * @param altura  La altura del Mando que debe ser mayor que 0
	 * @param anchura La anchura del Mando que debe ser mayor que 0
	 * @param precio  El precio del Mando que debe ser mayor que 0
	 */
	public Mando(String modelo, double altura, double anchura, double precio) throws ErrorModelo, ErrorAltura, ErrorAnchura, ErrorPrecio{
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ErrorModelo();
		}
		if (altura > 0) {
			this.altura = altura;
		} else {
			throw new ErrorAltura();
		}
		if (anchura > 0) {
			this.anchura = anchura;
		} else {
			throw new ErrorAnchura();
		}
		if (precio > 0) {
			this.precio = precio;
		} else {
			throw new ErrorPrecio();
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) throws ErrorPrecio{
		if (precio > 0) {
			this.precio = precio;			
		} else {
			throw new ErrorPrecio();
		}
	}

	public boolean isBoton() {
		return boton;
	}

	public String getModelo() {
		return modelo;
	}

	public double getAltura() {
		return altura;
	}

	public double getAnchura() {
		return anchura;
	}

	/**
	 * Método onOff que cambia el estado del botón, si está encendido lo pondrá a
	 * false y al contrario
	 */
	public void onOff() {
		if (boton) {
			this.boton = false;
		} else {
			this.boton = true;
		}
	}
	
	/**
	 * Método compareTo el cual se va a ordenar alfabéticamente por el nombre del modelo
	 */
	@Override
	public int compareTo(Mando mando) {
		return this.modelo.compareTo(mando.modelo);
	}

	/**
	 * Método hashCode ambos objetos son iguales si coinciden en el nombre
	 */
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	/**
	 * Método equals ambos objetos son iguales si coinciden en el nombre
	 */
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Mando other = (Mando) obj;
		if (this.modelo.equals(other.modelo)) {
			iguales = true;
		}
		return iguales;
	}

	/**
	 * Método toString que indica el modelo, altura, anchura, precio y el estado del
	 * botón
	 */
	@Override
	public String toString() {
		return "Mando: modelo " + modelo + ", altura " + altura + ", anchura " + anchura + ", precio " + precio
				+ ", boton " + boton;
	}
}
