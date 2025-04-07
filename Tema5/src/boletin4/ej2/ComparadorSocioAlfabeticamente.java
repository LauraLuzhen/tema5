package boletin4.ej2;

import java.util.Comparator;

public class ComparadorSocioAlfabeticamente implements Comparator<Socio> {

	@Override
	public int compare(Socio s1, Socio s2) {
		return s1.compareTo(s2);
	}
}
