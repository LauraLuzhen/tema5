package boletin1.ej1;

public class HoraPrincipal {

	public static void main(String[] args) {
		Hora hora1 = new Hora(23, 59);
		HoraExacta hora2 = new HoraExacta(3, 4, 2);

		System.out.println(hora1);
		System.out.println(hora2);

		hora1.inc();
		hora2.inc();

		System.out.println(hora1);
		System.out.println(hora2);
	}
}
