package boletin2.ej2;

import java.util.Arrays;

public class FutbolistaMain {

	public static void main(String[] args) {

		Futbolista futbolistas[] = new Futbolista[] { new Futbolista(1, "Laura", 19, 4),
				new Futbolista(2, "Ana", 16, 1), new Futbolista(2, "Alex", 20, 7), new Futbolista(3, "Paco", 21, 0),
				new Futbolista(8, "Juan", 19, 2) };

		Arrays.sort(futbolistas);

		System.out.println(Arrays.deepToString(futbolistas));
	}
}
