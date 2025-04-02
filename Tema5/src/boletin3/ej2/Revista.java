package boletin3.ej2;

public class Revista extends Ficha{

	private int numRevista;
	private int añoPublicacion;
	
	public Revista(int num, String titulo, int numRevista, int añoPublicacion) {
		super(num, titulo);
		if (numRevista > 0) {
			this.numRevista = numRevista;
		}
		if (añoPublicacion > 0 ) {
			this.añoPublicacion = añoPublicacion;
		}
	}

	public int getNumRevista() {
		return numRevista;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	
	public void prestamoVia() {
		System.out.println("El préstamo de la revista es de 10 días.");
	}
	
	public String toString() {
		return super.toString() + ", número de revista: " + numRevista + ", año de publicación: " + añoPublicacion;
	}
}
