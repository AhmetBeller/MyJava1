package java1.lesson4.Calculator;

public class ClassCalculator {
	// Beginn Klassenrumpf
	private int operand = 0;
	private int zahl1;
	private int zahl2;

	public void setoperand(int op) { // Zum Schreiben fon operand
		operand = op;
	}

	public void setzahl1(int z1) { // Zum Schreiben fon zahl1
		zahl1 = z1;
	}

	public void setzahl2(int z2) { // Zum Schreiben fon zahl2
		zahl2 = z2;
	}

	public int getcalc() {
		int result = 0;
		switch (operand) {
			case 1: {
				result = zahl1 + zahl2;
				break;
			}
			case 2: {
				result = zahl1 - zahl2;
				break;
			}
			case 3: {
				result = zahl1 * zahl2;
				break;
			}
			case 4: {
				result = zahl1 / zahl2;
				break;
			}
			default:{
				result = 8888;
			}
			
		}
		return result;
	}
}
