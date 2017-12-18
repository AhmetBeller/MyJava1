package java1.lesson3.ggT;

import java.util.Scanner;

public class ggt { // GGT "GrösterGemeinsameTeiler" 21, 28, = 7
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = 0;

		r = BerechneGGT(x, y);	// Aufruf Methode BerechneGGT / Übergabe der Werte x und y
		System.out.println(r);	// Ausgabe Resultat
	}

	private static int BerechneGGT(int x, int y) {		// Methode BerechneGGT
		while (x != y) { // Solange x ungleich y
			if (x < y) {
				y = y - x;
			} else {
				x = x - y;
			}
		}
		return x;	// return giebt den berechneten Wert zurück
	}
}
