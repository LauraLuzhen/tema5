package boletin1.ej5;

/**
 * Clase Poligono que va a guardar el número de lados y el área
 */
public abstract class Poligono {
	/**
	 * Atributo num de lados del polígono
	 */
	int numeroLados;

	/**
	 * Constructor Poligono que estable el num de lados
	 * 
	 * @param numLados El num de lados del polígono
	 */
	public Poligono(int numLados) {
		if (numLados > 2) {
			this.numeroLados = numLados;
		}
	}

	/**
	 * Método get de numeroLados que devuelve el valor
	 * 
	 * @return El valor de numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método area que devuelve el área del polígono
	 * 
	 * @return
	 */
	public abstract double area();

	/**
	 * Método toString del Poligono que imprime el numero de lados del polígono
	 */
	@Override
	public String toString() {
		return "Número de lados: " + numeroLados;
	}
}
