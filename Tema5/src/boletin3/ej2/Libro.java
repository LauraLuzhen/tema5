package boletin3.ej2;

public class Libro extends Ficha{
	
	private int id2;

	public Libro(int id, String titulo, int id2) {
		super(id, titulo);
		this.id2 = id2;
		// TODO Auto-generated constructor stub
	}
	
	public int getId2() {
		return id2;
	}
	
	public void tomaLibr() {
		super.toma();
		System.out.println("ME CAGO EN EL LIBRO");
	}
	
	public void tom2() {
		System.out.println("aver si aparece");
	}
	
	public String toString() {
		return "informacion del libro" + id2;
	}
}
