package boletin3.ej2;

public class Dvd {
	enum Tipo {
		PELÍCULA, DOCUMENTAL, SERIE
	}
	
	private String director;
	private int año;
	private Tipo tipo = Tipo.PELÍCULA;
}
