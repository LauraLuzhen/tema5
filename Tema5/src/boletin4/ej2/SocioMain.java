package boletin4.ej2;

import java.util.Arrays;

public class SocioMain {

	public static void main(String[] args) {
		Socio socios[] = new Socio[] { new Socio(12, "Marcos"), new Socio(2, "Lily"), new Socio(54, "Amara"), };

		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios, new ComparadorSocioAlfabeticamente());
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios, new ComparadorSocioEdad());
		System.out.println(Arrays.toString(socios));
	}
}
