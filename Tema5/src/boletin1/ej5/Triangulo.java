package boletin1.ej5;

/**
 * Clase Triangulo que hereda de Poligono donde se van a definir los lados y el
 * área del triángulo
 */
public class Triangulo extends Poligono {
	/**
	 * Atributo lado1 del triángulo
	 */
	private double lado1 = 1;
	/**
	 * Atributo lado2 del triángulo
	 */
	private double lado2 = 1;
	/**
	 * Atributo lado3 del triángulo
	 */
	private double lado3 = 1;

	/**
	 * Constructor Triangulo que llama al del padre
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor Triangulo que llama al padre y recibe los 3 lados del triángulo
	 * 
	 * @param l1 Lado 1 del triángulo
	 * @param l2 Lado 2 del triángulo
	 * @param l3 Lado 3 del triángulo
	 */
	public Triangulo(double l1, double l2, double l3) {
		super(3);
		if (l1 > 0) {
			this.lado1 = l1;
		}
		if (l2 > 0) {
			this.lado2 = l2;
		}
		if (l3 > 0) {
			this.lado3 = l3;
		}
	}

	/**
	 * Método get del lado 1
	 * 
	 * @return El valor del lado 1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set del lado 1 que modifica su valor
	 * 
	 * @param lado1 El lado 1 del triángulo
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	public double area() {
		double semiPerimetro = (lado1 + lado2 + lado3) / 2;
		double area = Math
				.sqrt(semiPerimetro * Math.abs((semiPerimetro - lado1)) * Math.abs((semiPerimetro - lado2)) * Math.abs((semiPerimetro - lado3)));
		return area;
	}

	@Override
	public String toString() {
		return "Polígono -> Triángulo: lado1 " + lado1 + ", lado2 " + lado2 + ", lado3 " + lado3;
	}
}
