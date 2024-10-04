package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		System.out.print("[");
		for (int i = 0; i < matrise.length; i++) {
			for (int n = 0; n < matrise[i].length; n++) {
				System.out.print(matrise[i][n] + " ");
			}

		}
		System.out.print("]");
		System.out.println();

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder resultat = new StringBuilder();

		for (int i = 0; i < matrise.length; i++) {
			for (int n = 0; n < matrise[i].length; n++) {
				resultat.append(matrise[i][n]);
				if (n < matrise.length) {
					resultat.append(" ");
				}

			}

			if (i < matrise[i].length + 1) {
				resultat.append("\n");
			}
		}

		String MatriseStreng = resultat.toString();
		System.out.println(MatriseStreng);
		return MatriseStreng;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skaler = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			skaler[i] = new int[matrise[i].length];
		}

		for (int i = 0; i < matrise.length; i++) {
			for (int n = 0; n < matrise[i].length; n++) {
				skaler[i][n] = tall * matrise[i][n];
			}
		}
		return skaler;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean bool = true;
		if (a.length != b.length) {
			bool = false;

		}
		if (bool == true) {
			for (int i = 0; i < a.length; i++) {
				if (a[i].length != b[i].length) {
					bool = false;
					break;
				}

				if (bool == true) {
					for (int n = 0; n < a[i].length; n++) {
						if (a[i][n] != b[i][n]) {
							bool = false;
							break;
						}
					}
				}
			}
		}
		return bool;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] speil = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			speil[i] = new int[matrise[i].length];
		}

		for (int i = 0; i < matrise.length; i++) {
			for (int n = 0; n < matrise[i].length; n++) {
				speil[i][n] = matrise [n][i];
			}
		}
		return speil;
	}

}
