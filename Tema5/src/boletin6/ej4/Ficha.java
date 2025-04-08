package boletin6.ej4;

public class Ficha implements Comparable<Ficha>{
	private int num;
	private String titulo;

	public Ficha(int num, String titulo) {
		if (num > 0) {
			this.num = num;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public int getNum() {
		return num;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public String toString() {
		return "Número: " + num + ", titulo: " + titulo;
	}
	
	public int compareTo(Ficha f) {
		return this.num - f.num;
	}
}
