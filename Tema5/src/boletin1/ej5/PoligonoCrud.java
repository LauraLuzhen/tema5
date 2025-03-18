package boletin1.ej5;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase PoligonoCrud donde vamos a crear una colección y vamos a crear métodos
 * para modificarla
 */
public class PoligonoCrud {
	/**
	 * Creamos la colección donde van a guardar los polígonos
	 */
	private static Set<Poligono> poligonos = new HashSet<Poligono>();

	/**
	 * Método que imprime cada polígono del conjunto junto con su área
	 */
	public static void listado() {
		for (Poligono poligono : poligonos) {
			System.out.println(poligono);
			System.out.println("Área: " + poligono.area());
			System.out.println("--------------------------------------");
		}
	}

	/**
	 * Método que añade un Triángulo al conjunto
	 * 
	 * @param l1 Lado 1 del triángulo
	 * @param l2 Lado 2 del triángulo
	 * @param l3 Lado 3 del triángulo
	 * @return Si lo ha añadido correctamente
	 */
	public static boolean añadirTriangulo(double l1, double l2, double l3) {
		return poligonos.add(new Triangulo(l1, l2, l3));
	}

	/**
	 * Método que añade un Rectángulo al conjunto
	 * 
	 * @param l1 Lado 1 del rectángulo
	 * @param l2 Lado 2 del rectángulo
	 * @return Si lo ha añadido correctamente
	 */
	public static boolean añadirRectangulo(double l1, double l2) {
		return poligonos.add(new Rectangulo(l1, l2));
	}
}
