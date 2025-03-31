package boletin3.ej2;

public class Ficha {

	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}
	
	public int getId() {
		return id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void toma() {
		System.out.println("ME CAGO EN LA FICHA");
	}
	
	public String toString() {
		return "informacion ficha";
	}
}
