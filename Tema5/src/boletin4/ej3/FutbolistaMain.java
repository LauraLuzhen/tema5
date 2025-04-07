package boletin4.ej3;

import java.util.Arrays;

public class FutbolistaMain {

	public static void main(String[] args) {
		Futbolista futbolistas[] = new Futbolista[] { new Futbolista("Marcos", 17, 2), new Futbolista("Lily", 15, 8), new Futbolista("Amara", 16, 4), };

		System.out.println(Arrays.toString(futbolistas));

		Arrays.sort(futbolistas);
		System.out.println(Arrays.toString(futbolistas));

		Arrays.sort(futbolistas, new ComparadorFutbolistaEdadAsc());
		System.out.println(Arrays.toString(futbolistas));

		Arrays.sort(futbolistas, new ComparadorFutbolistaGolesDesc());
		System.out.println(Arrays.toString(futbolistas));
	}
}
