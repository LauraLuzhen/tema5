package boletin3.ej2;

public class Dvd extends Ficha{
	enum Tipo {
		PELÍCULA, DOCUMENTAL, SERIE
	}
	
	private String director;
	private int año;
	private Tipo tipo = Tipo.PELÍCULA;
	
	public Dvd(int num, String titulo, String director, int año, String tipo) {
		super(num, titulo);
		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		if (año > 0) {
			this.año = año;
		}
		comprobarTipo(tipo);
	}
	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		comprobarTipo(tipo);
	}

	public String getDirector() {
		return director;
	}

	public int getAño() {
		return año;
	}

	public void prestamoVia() {
		System.out.println("El préstamo del dvd es de 5 días.");
	}

	public void comprobarTipo(String tipo) {
		String t = tipo.toUpperCase();
		switch(t) {
		case "PELÍCULA", "DOCUMENTAL", "SERIE" -> {
			this.tipo = Tipo.valueOf(t);
		}
		}
	}
	
	public String toString() {
		return super.toString() + ", director: " + director + ", año: " + año + ", tipo: " + tipo;
	}
}
