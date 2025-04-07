package boletin4.ej3;

import java.util.Comparator;

public class ComparadorFutbolistaGolesDesc implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista f1, Futbolista f2) {
		return f1.getNumGoles() - f2.getNumGoles();
	}
}
