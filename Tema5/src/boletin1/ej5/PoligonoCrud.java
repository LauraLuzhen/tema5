package boletin1.ej5;

import java.util.HashSet;
import java.util.Set;

public class PoligonoCrud {

	private static Set<Poligono> poligonos = new HashSet<Poligono>();
	 
	public static void listado() {
		for (Poligono poligono: poligonos) {
			System.out.println(poligono);
			System.out.println("Área: " + poligono.area());
			System.out.println("--------------------------------------");
		}
	}
	
	public static boolean añadirTriangulo(double l1, double l2, double l3) {
		return poligonos.add(new Triangulo(l1, l2, l3));
	}
	
	public static boolean añadirRectangulo(double l1, double l2) {
		return poligonos.add(new Rectangulo(l1, l2));
	}
}
