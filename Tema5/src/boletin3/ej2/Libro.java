package boletin3.ej2;

public class Libro extends Ficha{
	
	private String autor;
	private String titular;
	
	public Libro(int num, String titulo, String autor, String titular) {
		super(num, titulo);
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (titular != null && !titular.isBlank() ) {
			this.titular = titular;
		}
	}

	public String getAutor() {
		return autor;
	}

	public String getTitular() {
		return titular;
	}
	
	public void prestamoVia() {
		System.out.println("El préstamo del libro es de 15 días.");
	}
	
	public String toString() {
		return super.toString() + ", autor: " + autor + ", titular: " + titular;
	}
}
