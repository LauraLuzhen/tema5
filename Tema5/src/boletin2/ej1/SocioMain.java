package boletin2.ej1;

import java.util.Arrays;

public class SocioMain {

	public static void main(String[] args) {
		Socio socios[] = new Socio[] { new Socio(1, "L", 12), new Socio(5, "L", 18), new Socio(2, "L", 14),
				new Socio(9, "L", 16), new Socio(8, "L", 19) };

		Arrays.sort(socios);
		System.out.println(Arrays.deepToString(socios));
	}
}
