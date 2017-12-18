package java1.lesson3.Geschachtelt;

import java.util.Scanner;

//public class geschachtelt {
//	public static void main(String[] args) {
//		// Scanner dient zum Einlesen von Kyboard Input
//		Scanner scanner = new Scanner(System.in);
//
//		int input = scanner.nextInt();
//		
//		for (int counter1 = input; counter1 >= 0; counter1--) {
//			for (int counter2 = counter1; counter2 < input; counter2++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//
//	}
//
//}

 // Kontrollstrukturen - Aufgabe 2.3

public class geschachtelt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		scanner.close();

	}
}
