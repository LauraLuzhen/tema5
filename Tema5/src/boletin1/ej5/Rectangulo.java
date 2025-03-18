package boletin1.ej5;

public class Rectangulo extends Poligono {

	private double lado1 = 1;
	private double lado2 = 1;
	
	public Rectangulo() {
		super(4);
	}
	
	public Rectangulo(double l1, double l2) {
		super(4);
		if (l1 > 0) {
			this.lado1 = l1;
		}
		if (l2 > 0) {
			this.lado2 = l2;
		}
	}

	public double getLado1() {
		return lado1;
	}

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
	
	public double area() {
		double area = lado1 * lado2;
		return area;
	}
	
	@Override
	public String toString() {
		return "Polígono -> Rectángulo: lado1 " + lado1 + ", lado2 " + lado2;
	}
}
