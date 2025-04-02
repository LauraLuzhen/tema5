package boletin3.ej2;

public class FichaMain {

	public static void main(String[] args) {
		
		Ficha f1 = new Libro(1, "Libro Hola", "Autor", "Titular");
		Ficha f2 = new Revista(2, "Revista Hola", 12, 2024);
		Ficha f3 = new Dvd(3, "DVD Hola", "Director", 2016, "Documental");
		
		System.out.println(f1);
		f1.prestamoVia();
		
		System.out.println(f2);
		f2.prestamoVia();
		
		System.out.println(f3);
		f3.prestamoVia();
	}
}
