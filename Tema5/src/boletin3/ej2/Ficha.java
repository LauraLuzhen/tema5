package boletin3.ej2;

/**
 * Clase Ficha que define un ficha con los atributos num y titulo
 */
public abstract class Ficha {
	/**
	 * Atributo num que define el número de la ficha
	 */
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

	public abstract void prestamoVia();
	
	public String toString() {
		return "Número: " + num + ", titulo: " + titulo;
	}
}
