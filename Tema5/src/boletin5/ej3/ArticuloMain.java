package boletin5.ej3;

import java.util.Scanner;

public class ArticuloMain {
	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		char opc;
		String nombre;
		double precio;
		int cantidadModificada;

		Articulo articulo;

		do {
			menu();
			opc = reader.nextLine().charAt(0);
			opc = Character.toUpperCase(opc);

			switch (opc) {
			case 'A' -> {
				// listado
				ArticuloCrud.listarArticulos();
			}
			case 'B' -> {
				// alta
				articulo = crearArticulo();
				if (ArticuloCrud.añadirArticulo(articulo)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 'C' -> {
				// baja
				nombre = pedirNombre();
				articulo = new Articulo(nombre);
				if (ArticuloCrud.eliminarArticulo(articulo)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 'D' -> {
				// modificación
				nombre = pedirNombre();
				precio = pedirPrecio();
				articulo = new Articulo(nombre);
				try {
					if (ArticuloCrud.modificarPrecio(articulo, precio)) {
						System.out.println("Realizado");
					} else {
						System.out.println("No realizado");
					}
				} catch (ErrorPriceException e) {
					System.out.println(e);
					System.out.println(e.getMessage());
				}
			}
			case 'E' -> {
				// entrada de mercancía
				nombre = pedirNombre();
				System.out.println("Introduce cuánta mercancía entra: ");
				cantidadModificada = reader.nextInt();
				reader.nextLine();
				articulo = new Articulo(nombre);
				if (ArticuloCrud.entradaMercancia(articulo, cantidadModificada)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 'F' -> {
				// salida de mercancía
				nombre = pedirNombre();
				System.out.println("Introduce cuánta mercancía sale: ");
				cantidadModificada = reader.nextInt();
				reader.nextLine();
				articulo = new Articulo(nombre);
				if (ArticuloCrud.salidaMercancia(articulo, cantidadModificada)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 'G' -> {
				System.out.println("Saliendo del programa...");
			}
			default -> {
				System.out.println("Elige una opción válida");
			}
			}
		} while (opc != 'G');

		reader.close();
	}

	public static void menu() {
		System.out.println("ELIGE UNA OPCIÓN");
		System.out.println("A. Listado");
		System.out.println("B. Alta");
		System.out.println("C. Baja");
		System.out.println("D. Modificación");
		System.out.println("E. Entrada de mercancía");
		System.out.println("F. Salida de mercancía");
		System.out.println("G. Salir");
	}

	public static Articulo crearArticulo() {
		Articulo articulo = null;
		String nombre;
		double precio;
		int cuantosQuedan;

		nombre = pedirNombre();
		precio = pedirPrecio();
		System.out.println("Introduce cuántos quedan: ");
		cuantosQuedan = reader.nextInt();
		reader.nextLine();

		try {
			articulo = new Articulo(nombre, precio, cuantosQuedan);
		} catch (ErrorPriceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ErrorStockException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		} catch (ErrorNameException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		return articulo;
	}

	private static String pedirNombre() {
		String nombre;
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		return nombre;
	}

	private static double pedirPrecio() {
		double precio;
		System.out.println("Introduce el precio: ");
		precio = reader.nextDouble();
		reader.nextLine();
		return precio;
	}
}
