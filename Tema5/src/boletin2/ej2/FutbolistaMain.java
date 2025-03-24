package boletin2.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FutbolistaMain {

	public static void main(String[] args) {
		// Creamos el array
		List<Futbolista> lista = new ArrayList<>();

		// Creamos algunos socios con ids diferentes
		Futbolista f1 = new Futbolista(1, "Laura", 19, 4);
		Futbolista f2 = new Futbolista(2, "Ana", 16, 1);
		Futbolista f3 = new Futbolista(2, "Alex", 20, 7);
		Futbolista f4 = new Futbolista(3, "Paco", 21, 0);
		Futbolista f5 = new Futbolista(8, "Juan", 19, 2);

		// Añadimos a la lista
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		lista.add(f5);

		// Ordenamos
		Collections.sort(lista);

		// Imprimimos la lista para ver si el compareTo ha funcionado
		System.out.println(lista);
	}
}
