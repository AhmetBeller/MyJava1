package java1.lesson3.NumAusschreiben;

import java.util.Scanner;

public class numAusschreiben {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		char zahlen = scanner.nextLine().charAt(0);

		int counter = 0;
		do {
			if (zahlen == 'e') {
				break;
			} else if (zahlen >= 0 && zahlen < 10) {
				switch (zahlen) {
				case 0:
					System.out.println("Null");
					break;
				case 1:
					System.out.println("Eins");
					break;
				case 2:
					System.out.println("Zwei");
					break;
				case 3:
					System.out.println("Drei");
					break;
				case 4:
					System.out.println("Fier");
					break;
				case 5:
					System.out.println("Fünf");
					break;
				case 6:
					System.out.println("Sechs");
					break;
				case 7:
					System.out.println("Sieben");
					break;
				case 8:
					System.out.println("Acht");
					break;
				case 9:
					System.out.println("Neun");
					break;
				}
			} else {
				break;
			}
		} while (counter < 10);
	}
}
