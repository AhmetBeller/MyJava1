package java1.lesson3.Zahlenraten;

import java.util.Scanner;

public class zahlenraten {
	public static void main(String[] args) {
		// Scanner dient zum Einlesen von Kyboard Input
		Scanner scanner = new Scanner(System.in);

		System.out.println(" *** Zahlenraten *** \n");
		System.out.println("Ich denke mir eine Zahl zwischen 1 und 100. Rate diese Zahl!\n");

		int secretNumber = (int) (100 * Math.random() + 1); // Generiert eine Zufalszahl zwischen 1 und 100
		int eingabe;
		int counter = 0;

		do {
			counter++;
			System.out.println(counter + ". Versuch: ");
			eingabe = scanner.nextInt();

			if (secretNumber > eingabe) {
				System.out.println("Meine Zahl ist grösser!");
			} else if (secretNumber < eingabe) {
				System.out.println("Meine Zahl ist kleiner!");
			} else {
				System.out.println("Du hast meine Zahl beim " + counter + ". Versuch erraten.");
				break;
			}
		} while (secretNumber != eingabe);
		scanner.close();
	}

}
