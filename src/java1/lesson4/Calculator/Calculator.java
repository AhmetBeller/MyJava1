package java1.lesson4.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ClassCalculator calc1 = new ClassCalculator();

		System.out
				.print("Hallo ich bin ein Java Rechner.\n\nIch beherrsche folgende Operationen:\n1. Addition\n2. Subtraktion\n3. Multiplikation\n4. Division\n\nBitte wähle eine Operation: ");
		boolean schleifeCalaculator = true;
		while (schleifeCalaculator) {	//	Schleife um neue Rechenoperatoren auszuführen

			boolean schleifeOperator = true;
			while (schleifeOperator) {	// Schleife um Operator Eingabe zu prüfen, wiederholen
				int operand = scanner.nextInt();

				if (operand >= 1 && operand <= 4) {
					calc1.setoperand(operand);
					schleifeOperator = false;
				} else if (operand == 5) {
					System.out.print("Rechner beendet!");
					schleifeOperator = false;
					schleifeCalaculator = false;

				} else {
					System.out
							.print("Ungültige Eingabe. Bitte erneut wählen: ");
				}
			}

			if (schleifeCalaculator) {
				System.out.print("\nEingabe Zahl 1: ");
				calc1.setzahl1(scanner.nextInt());
				System.out.print("\nEingabe Zahl 2: ");
				calc1.setzahl2(scanner.nextInt());

				System.out.println("Das Ergebnis lautet: " + calc1.getcalc()); // Ruft die Methode "calc" der Klasse calc1 auf 

				System.out.println("\nNeuer Opertor eingeben: ");
			}
		}
		scanner.close();
	}

}
