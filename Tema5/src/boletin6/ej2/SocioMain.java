package boletin6.ej2;

import java.util.Arrays;
import java.util.Comparator;

public class SocioMain {
	public static void main(String[] args) {
		Socio socios[] = new Socio[] { new Socio(12, "Marcos"), new Socio(2, "Lily"), new Socio(54, "Amara"), };
		
		Comparator<Socio> compSocioAlfabeticamente = (a, b) -> {
			return a.getNombre().compareTo(b.getNombre());
		};
		
		Comparator<Socio> compSocioEdad = (a, b) -> {
			return b.getEdad() - a.getEdad();
		};

		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios,compSocioAlfabeticamente);
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios, compSocioEdad);
		System.out.println(Arrays.toString(socios));
	}
}
