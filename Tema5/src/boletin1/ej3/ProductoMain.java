package boletin1.ej3;

public class ProductoMain {

	public static void main(String[] args) {
		Producto p = new Producto("Producto1", 12.3);
		Perecedero perecedero = new Perecedero("Producto2", 12.3, 2);
		NoPerecedero noPerecedero = new NoPerecedero("Producto3", 21.1, "Tipo1");

		System.out.println(p);
		System.out.println(perecedero);
		System.out.println(noPerecedero);

		System.out.println(p.calcular(3));
		System.out.println(perecedero.calcular(3));
	}
}
