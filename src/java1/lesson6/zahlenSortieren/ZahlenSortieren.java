package java1.lesson6.zahlenSortieren;

import java.util.Scanner;
import java.util.Arrays;

public class ZahlenSortieren {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Wieviele Zahlen willst du sortieren?");

		scanner = new Scanner(System.in);
		int anzahl = scanner.nextInt();

		int[] array1 = new int[anzahl];
		for (int i = 0; i < anzahl; i++) {
			System.out.println("Zahl " + (i + 1) + ":");
			array1[i] = scanner.nextInt();
		}

		int[] array2 = new int[anzahl];

		System.out.println("Array vor Sortierung:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		Arrays.sort(array1);	// Sortiermethode / achtung benötigt: import java.util.Arrays;
		
		System.out.println("\n\nArray nach Sortierung:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}
