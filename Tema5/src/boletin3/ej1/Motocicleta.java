package boletin3.ej1;

/**
 * Clase Motocicleta que hereda todos los atributos de Vehiculo y además contiene cilindrada
 */
public class Motocicleta extends Vehiculo{
	/**
	 * Atributo cilindrada que guarda la cilindrada de la Motocicleta
	 */
	private int cilindrada;
	
	public Motocicleta(String marca, String modelo, String color, String matricula) {
		super(marca, modelo, color, matricula);
	}
	
	/**
	 * Método toString que llama al toString de la clase padre y además indica la cilindrada de la Motocicleta
	 */
	public String toString() {
		return super.toString() + ", cilindrada " + cilindrada;
	}
}
