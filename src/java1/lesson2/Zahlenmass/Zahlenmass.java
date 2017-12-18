package java1.lesson2.Zahlenmass;

import java.util.Scanner;

public class Zahlenmass {
	public static void main(String[] args) {

		// Scanner dient zum Einlesen von Keyboard Input
		Scanner scanner = new Scanner(System.in);
		int anzahl = scanner.nextInt();
		
		int gros = anzahl / 144;		System.out.println(gros);	
		anzahl = anzahl % 144;			System.out.println(anzahl+ "\n");

		int schock = anzahl / 60;		System.out.println(schock);
		anzahl = anzahl % 60;			System.out.println(anzahl+ "\n");

		int dutzend = anzahl / 12;		System.out.println(dutzend);
		anzahl = anzahl % 12;			System.out.println(anzahl+ "\n");

		int stueck = anzahl;			System.out.println(stueck+ "\n");

		System.out.printf("%d Gros, %d Schock, %d Dutzend, %d Stück", gros, schock, dutzend, stueck);
	
		// alternativ:
		System.out.println("\n" +gros + " Gros, " + schock + " Schock, " + dutzend + " Dutzend, " + stueck + " Stück");
		
		scanner.close();	
	}
}
