package java1.lesson4.CalculatorLoesung;

import java.util.Scanner;

/**
 * Calculator class supporting the operations +, -, *, /
 * 
 * @author fean
 * 
 */
public class Calculator {

	public int add(int operand1, int operand2) {
		return operand1 + operand2;
	}

	public int subtract(int operand1, int operand2) {
		return operand1 - operand2;
	}

	public int multiply(int operand1, int operand2) {
		return operand1 * operand2;
	}

	public int divide(int operand1, int operand2) {
		return operand1 / operand2;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		int operator;
		int operand1 = 0, operand2 = 0;
		int choice = 0;

		System.out.println("Hallo ich bin ein Java Rechner.");

		while (choice != 5) {

			System.out.println("\nIch beherrsche folgende Operationen: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraktion");
			System.out.println("3. Multiplikation");
			System.out.println("4. Division");

			System.out.print("\nBitte wähle eine Operation: ");
			operator = scanner.nextInt();

			if (operator >= 1 && operator <= 4) {
				System.out.print("\nEingabe Zahl 1: ");
				operand1 = scanner.nextInt();

				System.out.print("\nEingabe Zahl 2: ");
				operand2 = scanner.nextInt();
			}

			switch (operator) {
			case 1:
				System.out.println("Resultat: "
						+ calculator.add(operand1, operand2));
				break;
			case 2:
				System.out.println("Resultat: "
						+ calculator.subtract(operand1, operand2));
				break;
			case 3:
				System.out.println("Resultat: "
						+ calculator.multiply(operand1, operand2));
				break;
			case 4:
				System.out.println("Resultat: "
						+ calculator.divide(operand1, operand2));
				break;
			case 5:
				System.out.println("Bye Bye!");
				choice = 5;
				break;
			default:
				System.out.println("Ungültige Eingabe!");
				break;
			}
		}

		scanner.close();
	}

}
