package boletin1.ej1;

import java.util.Scanner;

public class HoraPrincipal {
	
	public static void main(String[] args) {
		
		int min;
		int seg;
		
		Scanner reader = new Scanner(System.in);
		
		Hora hora1 = new Hora(3, 4);
		HoraExacta hora2 = new HoraExacta(3, 4, 2);
		
		System.out.println(hora1);
		System.out.println(hora2);
		
		hora1.inc();
		
		
		
		reader.close();
	}
}
