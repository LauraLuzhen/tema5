package boletin2.ej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocioMain {

	public static void main(String[] args) {
		// Creamos el array
		List<Socio> lista = new ArrayList<>();

		// Creamos algunos socios con ids diferentes
		Socio s1 = new Socio(1, "L", 12);
		Socio s2 = new Socio(5, "L", 18);
		Socio s3 = new Socio(2, "L", 14);
		Socio s4 = new Socio(9, "L", 16);
		Socio s5 = new Socio(8, "L", 19);

		// Añadimos a la lista
		lista.add(s1);
		lista.add(s2);
		lista.add(s3);
		lista.add(s4);
		lista.add(s5);

		// Ordenamos
		Collections.sort(lista);

		// Imprimimos la lista para ver si el compareTo ha funcionado
		System.out.println(lista);
	}
}
