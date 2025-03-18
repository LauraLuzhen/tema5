package boletin1.ej5;

import java.util.Scanner;

public class PoligonoMain {
	// Creamos el Scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaración de variables
		// Variable que guarda la opción del usuario
		int opc;
		// Variable que guarda un lado de un polígono
		double lado1;
		// Variable que guarda un lado de un polígono
		double lado2;
		// Variable que guarda un lado de un polígono
		double lado3;

		// Do-while que sale del bucle cuando lo elige el usuario
		do {
			// Imprimimos el menú
			menu();
			opc = reader.nextInt();
			reader.nextLine();

			// Switch según el valor de la opción
			switch (opc) {
			case 1 -> {
				// Introducir un triángulo
				System.out.println("Introduce el primer lado: ");
				lado1 = reader.nextDouble();
				System.out.println("Introduce el segundo lado: ");
				lado2 = reader.nextDouble();
				System.out.println("Introduce el tercer lado: ");
				lado3 = reader.nextDouble();
				if (PoligonoCrud.añadirTriangulo(lado1, lado2, lado3)) {
					System.out.println("Triángulo añadido correctamente");
				} else {
					System.out.println("El triángulo no se ha podido añadir");
				}
			}
			case 2 -> {
				// Introducir un rectángulo
				System.out.println("Introduce la anchura: ");
				lado1 = reader.nextDouble();
				System.out.println("Introduce la altura: ");
				lado2 = reader.nextDouble();
				if (PoligonoCrud.añadirRectangulo(lado1, lado2)) {
					System.out.println("Rectángulo añadido correctamente");
				} else {
					System.out.println("El rectángulo no se ha podido añadir");
				}
			}
			case 3 -> {
				// Mostrar polígonos
				PoligonoCrud.listado();
			}
			case 0 -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Introduce un valor válido");
			}
		} while (opc != 0);

		// Cerramos el Scanner
		reader.close();
	}

	// Función que imprime el manú
	public static void menu() {
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("0. Salir");
	}
}
