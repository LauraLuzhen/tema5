package boletin4.ej4;

import java.util.Comparator;

public class ComparadorFichaTituloAlfabeticamente implements Comparator<Ficha>{

	@Override
	public int compare(Ficha f1, Ficha f2) {
		return f1.getTitulo().compareTo(f2.getTitulo());
	}
}
