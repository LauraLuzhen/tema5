package boletin4.ej1;

import java.util.Comparator;

public class ComparadorNumeroDescendiente implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		return n2 - n1;
	}
}
