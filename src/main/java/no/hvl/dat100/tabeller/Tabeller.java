package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder resultat = new StringBuilder();
		resultat.append("[");

		for (int i = 0; i < tabell.length; i++) {
			resultat.append(tabell[i]);

			if (i < tabell.length - 1) {
				resultat.append(",");
			}
		}
		resultat.append("]");

		String TabellStreng = resultat.toString();
		System.out.println(TabellStreng);
		return TabellStreng;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];

			System.out.println(sum);
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean bool = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				bool = true;
				break;
			}
		}
		return bool;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
				break;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] motsatt = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			motsatt[i] = tabell[tabell.length - 1 - i];
		}
		return motsatt;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean bool = true;
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				bool = false;
			}
		}
		return bool;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int TotalLengde = tabell1.length + tabell2.length;
		int[] Sammen = new int[TotalLengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			Sammen[i] = tabell1[i];
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			Sammen[tabell1.length + i] = tabell2[i];
		}
		return Sammen;
	}
}
