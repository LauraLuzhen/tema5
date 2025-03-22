package boletin1.ej4;

public class ElectrodomesticoMain {

	public static void main(String[] args) {
		Electrodomestico lavadora = new Lavadora(23, "azul", 'F', 100, 32);
		Electrodomestico television = new Television(97, "ROJO", 'B', 240, 40, true);
		
		System.out.println(lavadora);
		System.out.println(television);
		
		lavadora.precioFinal();
		television.precioFinal();
		
		System.out.println(lavadora);
		System.out.println(television);
	}
}
