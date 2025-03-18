package boletin1.ej5;

/**
 * Clase Rectangulo que hereda de Poligono que va a definir los lados y su área
 */
public class Rectangulo extends Poligono {
	/**
	 * Atributo del lado 1 del rectángulo
	 */
	private double lado1 = 1;
	/**
	 * Atributo del lado 2 del rectángulo
	 */
	private double lado2 = 1;

	/**
	 * Constructor del Rectangulo que llama al del padre
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor del Rectangulo que llama al del padre y verifica los lados del
	 * rectángulo
	 * 
	 * @param l1
	 * @param l2
	 */
	public Rectangulo(double l1, double l2) {
		super(4);
		if (l1 > 0) {
			this.lado1 = l1;
		}
		if (l2 > 0) {
			this.lado2 = l2;
		}
	}

	/**
	 * Método get del lado 1
	 * 
	 * @return El valor del lado 1 del rectángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set del lado 1 que modifica el valor
	 * 
	 * @param lado1 El nuevo valor del lado 1 del rectángulo
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Método get del lado 2
	 * 
	 * @return El valor del lado 2 del rectángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set del lado 2 que modifica su valor
	 * 
	 * @param lado2 El nuevo valor del lado 2 del rectángulo
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método area que calcula el área del rectángulo y devuelve el resultado
	 */
	public double area() {
		double area = lado1 * lado2;
		return area;
	}

	/**
	 * Método toString del Rectangulo que devuelve la clase padre, la clase hija y
	 * los lados del rectángulo
	 */
	@Override
	public String toString() {
		return "Polígono -> Rectángulo: lado1 " + lado1 + ", lado2 " + lado2;
	}
}
